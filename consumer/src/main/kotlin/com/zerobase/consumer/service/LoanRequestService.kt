package com.zerobase.consumer.service

import com.zerobase.consumer.dto.ReviewReponseDto
import com.zerobase.domain.domain.LoanReview
import com.zerobase.domain.repository.LoanReviewRepository
import com.zerobase.kafka.dto.LoanRequestDto
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Service
import org.springframework.web.client.postForEntity
import java.time.Duration

@Service
class LoanRequestService(
    private val loanReviewRepository: LoanReviewRepository
) {
    companion object {
        const val cssUrl = "http://localhost:8081/css/api/v1/request"
    }

    fun loanRequest(loanRequestDto: LoanRequestDto) {
        // CB Component로 요청 보내기 -> 응답값을 DB에 저장하기
        val reviewResult = loanRequestToCb(loanRequestDto)

        saveLoanReviewData(reviewResult.toLoanReviewEntity())
    }

    fun loanRequestToCb(
        loanRequestDto: LoanRequestDto
    ): ReviewReponseDto {
        val restTemplate = RestTemplateBuilder()
            .setConnectTimeout(Duration.ofSeconds(1000))
            .setReadTimeout(Duration.ofSeconds(1000))
            .build()

        return restTemplate.postForEntity(cssUrl, loanRequestDto, ReviewReponseDto::class.java).body!!
    }

   private fun saveLoanReviewData(loanReview: LoanReview) = loanReviewRepository.save(loanReview)
}