package com.napas.tamboon.domain.usecase

import com.napas.tamboon.domain.model.CardParam
import com.napas.tamboon.domain.repository.OmiseRepository

class GetCreditCardTokenUseCase(
    private val omiseRepository: OmiseRepository
) {
    suspend operator fun invoke(cardParam: CardParam) = omiseRepository.tokenize(cardParam)
}