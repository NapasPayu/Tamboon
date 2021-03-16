package com.lotuss.oneapp.data.remote.cms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJI\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJI\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/lotuss/oneapp/data/remote/cms/TargetedCouponService;", "", "getTargetedCoupon", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Lcom/lotuss/oneapp/data/model/TargetedCouponEntity;", "Lcom/lotuss/oneapp/domain/model/CmsError;", "key", "", "authorization", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTargetedCouponDetail", "Lcom/lotuss/oneapp/data/model/TargetedCouponDetailEntity;", "barcodeId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "redeemTargetedCoupon", "", "Lcom/lotuss/oneapp/data/model/request/RedeemTargetedCouponRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lotuss/oneapp/data/model/request/RedeemTargetedCouponRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_myPpeDebug"})
public abstract interface TargetedCouponService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "coupons")
    public abstract java.lang.Object getTargetedCoupon(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Key")
    java.lang.String key, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Accept-Language")
    java.lang.String lang, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.TargetedCouponEntity, com.lotuss.oneapp.domain.model.CmsError>> p3);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "coupons/{barcodeId}")
    public abstract java.lang.Object getTargetedCouponDetail(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Key")
    java.lang.String key, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Accept-Language")
    java.lang.String lang, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "barcodeId")
    java.lang.String barcodeId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.TargetedCouponDetailEntity, com.lotuss.oneapp.domain.model.CmsError>> p4);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "redeem")
    public abstract java.lang.Object redeemTargetedCoupon(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Key")
    java.lang.String key, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Accept-Language")
    java.lang.String lang, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.lotuss.oneapp.data.model.request.RedeemTargetedCouponRequest barcodeId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<kotlin.Unit, com.lotuss.oneapp.domain.model.CmsError>> p4);
}