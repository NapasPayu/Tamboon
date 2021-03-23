package com.napas.tamboon.domain.repository

import com.napas.tamboon.domain.model.CardParam
import com.napas.tamboon.domain.model.ResultWrapper

interface OmiseRepository {
    suspend fun tokenize(cardParam: CardParam): ResultWrapper<String>
}