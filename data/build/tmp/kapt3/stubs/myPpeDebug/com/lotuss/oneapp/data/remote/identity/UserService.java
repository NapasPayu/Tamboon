package com.lotuss.oneapp.data.remote.identity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/lotuss/oneapp/data/remote/identity/UserService;", "", "getResultPreSignIn", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "", "Lcom/lotuss/oneapp/domain/model/CommonError;", "body", "Lcom/lotuss/oneapp/data/model/request/PreSignRequest;", "(Lcom/lotuss/oneapp/data/model/request/PreSignRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_myPpeDebug"})
public abstract interface UserService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "identity/v1/user")
    public abstract java.lang.Object getResultPreSignIn(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.lotuss.oneapp.data.model.request.PreSignRequest body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<kotlin.Unit, com.lotuss.oneapp.domain.model.CommonError>> p1);
}