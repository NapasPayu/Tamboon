package com.lotuss.oneapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ+\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/lotuss/oneapp/data/repository/CognitoRepositoryImpl;", "Lcom/lotuss/oneapp/domain/repository/CognitoRepository;", "cognitoSessionHelper", "Lcom/lotuss/oneapp/data/util/CognitoSessionHelper;", "(Lcom/lotuss/oneapp/data/util/CognitoSessionHelper;)V", "multiFactorAuthenticationContinuation", "Lcom/amazonaws/mobileconnectors/cognitoidentityprovider/continuations/MultiFactorAuthenticationContinuation;", "getMultiFactorAuthenticationContinuation", "()Lcom/amazonaws/mobileconnectors/cognitoidentityprovider/continuations/MultiFactorAuthenticationContinuation;", "setMultiFactorAuthenticationContinuation", "(Lcom/amazonaws/mobileconnectors/cognitoidentityprovider/continuations/MultiFactorAuthenticationContinuation;)V", "confirmMFACode", "", "mfaCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResultRegister", "Landroidx/lifecycle/LiveData;", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Lcom/lotuss/oneapp/domain/model/CognitoToken;", "Lcom/lotuss/oneapp/domain/model/CognitoError;", "phoneNumber", "refreshToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_myPpeDebug"})
public final class CognitoRepositoryImpl implements com.lotuss.oneapp.domain.repository.CognitoRepository {
    @org.jetbrains.annotations.Nullable
    private com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation;
    private final com.lotuss.oneapp.data.util.CognitoSessionHelper cognitoSessionHelper = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PASSWORD_COGNITO = "1821160c43d2cb9ffe692eb4602ce4fc";
    public static final int CODE_MISS_MATCH = 401;
    public static final int NETWORK_ERROR_CODE_ACTION_CLOSED = 404;
    public static final int NETWORK_ERROR_CODE_ACTION_BACK = 405;
    public static final int SESSION_EXPIRED = 406;
    @org.jetbrains.annotations.NotNull
    public static final com.lotuss.oneapp.data.repository.CognitoRepositoryImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable
    public final com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation getMultiFactorAuthenticationContinuation() {
        return null;
    }
    
    public final void setMultiFactorAuthenticationContinuation(@org.jetbrains.annotations.Nullable
    com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getResultRegister(@org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.CognitoToken, com.lotuss.oneapp.domain.model.CognitoError>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object refreshToken(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.CognitoToken, com.lotuss.oneapp.domain.model.CognitoError>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object confirmMFACode(@org.jetbrains.annotations.NotNull
    java.lang.String mfaCode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public CognitoRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.util.CognitoSessionHelper cognitoSessionHelper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/lotuss/oneapp/data/repository/CognitoRepositoryImpl$Companion;", "", "()V", "CODE_MISS_MATCH", "", "NETWORK_ERROR_CODE_ACTION_BACK", "NETWORK_ERROR_CODE_ACTION_CLOSED", "PASSWORD_COGNITO", "", "SESSION_EXPIRED", "data_myPpeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}