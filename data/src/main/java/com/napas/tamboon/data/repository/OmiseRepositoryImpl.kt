package com.napas.tamboon.data.repository

import co.omise.android.api.Client
import co.omise.android.api.RequestListener
import co.omise.android.models.Token
import com.napas.tamboon.data.model.mapper.CardParamMapper
import com.napas.tamboon.data.model.mapper.TokenMapper
import com.napas.tamboon.domain.model.CardParam
import com.napas.tamboon.domain.model.ResultWrapper
import com.napas.tamboon.domain.repository.OmiseRepository
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class OmiseRepositoryImpl(
    private val omiseClient: Client,
    private val cardParamMapper: CardParamMapper,
    private val tokenMapper: TokenMapper
) : OmiseRepository {
    override suspend fun tokenize(cardParam: CardParam): ResultWrapper<String> {
        val requestBody = cardParamMapper.map(cardParam)
        val request = Token.CreateTokenRequestBuilder(requestBody).build()
        return suspendCoroutine { continuation ->
            omiseClient.send(request, object : RequestListener<Token> {
                override fun onRequestSucceed(model: Token) {
                    val token = tokenMapper.map(model)
                    continuation.resume(ResultWrapper.Success(token))
                }

                override fun onRequestFailed(throwable: Throwable) {
                    continuation.resume(ResultWrapper.GenericError(throwable))
                }
            })
        }
    }
}