package com.lotuss.oneapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u00014BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J7\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJE\u0010\u001c\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J?\u0010%\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00160\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\'\u0010(\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00160\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J%\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010,\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J/\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00160\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010/\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J/\u00101\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00160\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u00102\u001a\u00020.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00065"}, d2 = {"Lcom/lotuss/oneapp/data/repository/BZBRepositoryImpl;", "Lcom/lotuss/oneapp/domain/repository/BZBRepository;", "config", "Lcom/lotuss/oneapp/data/model/Config;", "bzbService", "Lcom/lotuss/oneapp/data/remote/bzb/BZBService;", "couponDetailMapper", "Lcom/lotuss/oneapp/data/model/mapper/CouponDetailMapper;", "redeemDetailMapper", "Lcom/lotuss/oneapp/data/model/mapper/RedeemDetailMapper;", "loginBZBMapper", "Lcom/lotuss/oneapp/data/model/mapper/LoginBZBMapper;", "couponListMapper", "Lcom/lotuss/oneapp/data/model/mapper/CouponListMapper;", "couponHomeListMapper", "Lcom/lotuss/oneapp/data/model/mapper/CouponHomeListMapper;", "pointBZBMapper", "Lcom/lotuss/oneapp/data/model/mapper/PointMapper;", "(Lcom/lotuss/oneapp/data/model/Config;Lcom/lotuss/oneapp/data/remote/bzb/BZBService;Lcom/lotuss/oneapp/data/model/mapper/CouponDetailMapper;Lcom/lotuss/oneapp/data/model/mapper/RedeemDetailMapper;Lcom/lotuss/oneapp/data/model/mapper/LoginBZBMapper;Lcom/lotuss/oneapp/data/model/mapper/CouponListMapper;Lcom/lotuss/oneapp/data/model/mapper/CouponHomeListMapper;Lcom/lotuss/oneapp/data/model/mapper/PointMapper;)V", "getCampaignDetail", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Lcom/lotuss/oneapp/domain/model/CouponDetail;", "Lcom/lotuss/oneapp/domain/model/BZBError;", "token", "", "campaignId", "deviceLocale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCouponHomeList", "Ljava/util/ArrayList;", "Lcom/lotuss/oneapp/domain/model/Coupons$Coupon;", "Lkotlin/collections/ArrayList;", "byConfig", "", "top", "", "(Ljava/lang/String;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCouponList", "Lcom/lotuss/oneapp/domain/model/Coupons;", "(Ljava/lang/String;Ljava/lang/String;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPoint", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginBZB", "Lcom/lotuss/oneapp/domain/model/LoginBZB;", "uuid", "redeemCoupon", "Lcom/lotuss/oneapp/domain/model/RedeemDetail;", "couponDetail", "(Ljava/lang/String;Lcom/lotuss/oneapp/domain/model/CouponDetail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "useCoupon", "redeemDetail", "(Ljava/lang/String;Lcom/lotuss/oneapp/domain/model/RedeemDetail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_myPpeDebug"})
public final class BZBRepositoryImpl implements com.lotuss.oneapp.domain.repository.BZBRepository {
    private final com.lotuss.oneapp.data.model.Config config = null;
    private final com.lotuss.oneapp.data.remote.bzb.BZBService bzbService = null;
    private final com.lotuss.oneapp.data.model.mapper.CouponDetailMapper couponDetailMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.RedeemDetailMapper redeemDetailMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.LoginBZBMapper loginBZBMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.CouponListMapper couponListMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.CouponHomeListMapper couponHomeListMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.PointMapper pointBZBMapper = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CONFIG_CAMPAIGN_MEMBER = "campaign_tesco";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CONFIG_CAMPAIGN_GUEST = "campaign_tesco_guest";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CONFIG_MENU_MEMBER = "menu_tesco";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CONFIG_MENU_GUEST = "menu_tesco_guest";
    @org.jetbrains.annotations.NotNull
    public static final com.lotuss.oneapp.data.repository.BZBRepositoryImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCampaignDetail(@org.jetbrains.annotations.Nullable
    java.lang.String token, @org.jetbrains.annotations.NotNull
    java.lang.String campaignId, @org.jetbrains.annotations.NotNull
    java.lang.String deviceLocale, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.CouponDetail, com.lotuss.oneapp.domain.model.BZBError>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object redeemCoupon(@org.jetbrains.annotations.Nullable
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.model.CouponDetail couponDetail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.RedeemDetail, com.lotuss.oneapp.domain.model.BZBError>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object useCoupon(@org.jetbrains.annotations.Nullable
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.model.RedeemDetail redeemDetail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.RedeemDetail, com.lotuss.oneapp.domain.model.BZBError>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object loginBZB(@org.jetbrains.annotations.NotNull
    java.lang.String uuid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.LoginBZB, com.lotuss.oneapp.domain.model.BZBError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCouponList(@org.jetbrains.annotations.Nullable
    java.lang.String token, @org.jetbrains.annotations.NotNull
    java.lang.String deviceLocale, boolean byConfig, int top, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.Coupons, com.lotuss.oneapp.domain.model.BZBError>> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCouponHomeList(@org.jetbrains.annotations.NotNull
    java.lang.String deviceLocale, boolean byConfig, int top, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<? extends java.util.ArrayList<com.lotuss.oneapp.domain.model.Coupons.Coupon>, com.lotuss.oneapp.domain.model.BZBError>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPoint(@org.jetbrains.annotations.Nullable
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<java.lang.Integer, com.lotuss.oneapp.domain.model.BZBError>> p1) {
        return null;
    }
    
    public BZBRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.Config config, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.bzb.BZBService bzbService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.CouponDetailMapper couponDetailMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.RedeemDetailMapper redeemDetailMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.LoginBZBMapper loginBZBMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.CouponListMapper couponListMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.CouponHomeListMapper couponHomeListMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.PointMapper pointBZBMapper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/lotuss/oneapp/data/repository/BZBRepositoryImpl$Companion;", "", "()V", "CONFIG_CAMPAIGN_GUEST", "", "CONFIG_CAMPAIGN_MEMBER", "CONFIG_MENU_GUEST", "CONFIG_MENU_MEMBER", "data_myPpeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}