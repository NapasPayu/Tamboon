package com.lotuss.oneapp.data.remote.cms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/lotuss/oneapp/data/remote/cms/AddressService;", "", "getAddress", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Lcom/lotuss/oneapp/data/model/AddressEntity;", "Lcom/lotuss/oneapp/domain/model/CmsError;", "key", "", "lang", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_myPpeDebug"})
public abstract interface AddressService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "info/addresses")
    public abstract java.lang.Object getAddress(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Key")
    java.lang.String key, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Accept-Language")
    java.lang.String lang, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.AddressEntity, com.lotuss.oneapp.domain.model.CmsError>> p2);
}