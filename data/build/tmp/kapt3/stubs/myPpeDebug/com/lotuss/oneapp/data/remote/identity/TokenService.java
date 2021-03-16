package com.lotuss.oneapp.data.remote.identity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/lotuss/oneapp/data/remote/identity/TokenService;", "", "getResultLogin", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Lcom/lotuss/oneapp/data/model/LoginEntity;", "Lcom/lotuss/oneapp/domain/model/MCAError;", "cognitoToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResultLoginLv16", "data_myPpeDebug"})
public abstract interface TokenService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "identity/v1/token/mca/lvl/12")
    public abstract java.lang.Object getResultLogin(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.LoginEntity, com.lotuss.oneapp.domain.model.MCAError>> p1);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "identity/v1/token/mca/lvl/16")
    public abstract java.lang.Object getResultLoginLv16(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.LoginEntity, com.lotuss.oneapp.domain.model.MCAError>> p1);
}