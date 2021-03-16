package com.lotuss.oneapp.data.remote.identity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ1\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ1\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J1\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/lotuss/oneapp/data/remote/identity/PinService;", "", "getPinStatus", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Lcom/lotuss/oneapp/data/model/PinStatusEntity;", "Lcom/lotuss/oneapp/domain/model/CommonError;", "cognitoToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResultCreatePin", "Lcom/lotuss/oneapp/data/model/PinEntity;", "body", "Lcom/lotuss/oneapp/data/model/request/PinRequest;", "(Ljava/lang/String;Lcom/lotuss/oneapp/data/model/request/PinRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResultForgotPassword", "", "Lcom/lotuss/oneapp/data/model/request/ForgotPinRequest;", "(Ljava/lang/String;Lcom/lotuss/oneapp/data/model/request/ForgotPinRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResultVerifyPin", "data_myPpeDebug"})
public abstract interface PinService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "identity/v1/pin/create")
    public abstract java.lang.Object getResultCreatePin(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.lotuss.oneapp.data.model.request.PinRequest body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.PinEntity, com.lotuss.oneapp.domain.model.CommonError>> p2);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "identity/v1/pin/verify")
    public abstract java.lang.Object getResultVerifyPin(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.lotuss.oneapp.data.model.request.PinRequest body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.PinEntity, com.lotuss.oneapp.domain.model.CommonError>> p2);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "identity/v1/pin/status")
    public abstract java.lang.Object getPinStatus(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.PinStatusEntity, com.lotuss.oneapp.domain.model.CommonError>> p1);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "identity/v1/pin/reset")
    public abstract java.lang.Object getResultForgotPassword(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.lotuss.oneapp.data.model.request.ForgotPinRequest body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<kotlin.Unit, com.lotuss.oneapp.domain.model.CommonError>> p2);
}