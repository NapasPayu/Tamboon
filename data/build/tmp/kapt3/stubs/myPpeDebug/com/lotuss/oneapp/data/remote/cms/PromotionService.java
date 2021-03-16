package com.lotuss.oneapp.data.remote.cms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJM\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/lotuss/oneapp/data/remote/cms/PromotionService;", "", "getPromotionDetail", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Lcom/lotuss/oneapp/data/model/PromotionDetailEntity;", "Lcom/lotuss/oneapp/domain/model/CmsError;", "key", "", "lang", "promotionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPromotionList", "Lcom/lotuss/oneapp/data/model/PromotionEntity;", "limit", "", "offset", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_myPpeDebug"})
public abstract interface PromotionService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "promotions")
    public abstract java.lang.Object getPromotionList(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Key")
    java.lang.String key, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Accept-Language")
    java.lang.String lang, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.PromotionEntity, com.lotuss.oneapp.domain.model.CmsError>> p4);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "promotions/{promotionId}")
    public abstract java.lang.Object getPromotionDetail(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Key")
    java.lang.String key, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Accept-Language")
    java.lang.String lang, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Path(value = "promotionId")
    java.lang.String promotionId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.PromotionDetailEntity, com.lotuss.oneapp.domain.model.CmsError>> p3);
}