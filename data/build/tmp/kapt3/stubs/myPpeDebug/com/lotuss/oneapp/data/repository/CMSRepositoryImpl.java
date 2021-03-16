package com.lotuss.oneapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0002\u0010\u001eJ\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J-\u0010$\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`\'\u0012\u0004\u0012\u00020\"0 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001d\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"0 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J%\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\"0 2\u0006\u0010,\u001a\u00020+H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\'\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\"0 2\b\u00100\u001a\u0004\u0018\u00010)H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J1\u00102\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\"0 2\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000105H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J%\u00108\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\"0 2\u0006\u0010,\u001a\u00020+H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J%\u0010:\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\"0 2\u0006\u0010<\u001a\u00020)H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006="}, d2 = {"Lcom/lotuss/oneapp/data/repository/CMSRepositoryImpl;", "Lcom/lotuss/oneapp/domain/repository/CMSRepository;", "config", "Lcom/lotuss/oneapp/data/model/Config;", "promotionMapper", "Lcom/lotuss/oneapp/data/model/mapper/PromotionMapper;", "promotionDetailMapper", "Lcom/lotuss/oneapp/data/model/mapper/PromotionDetailMapper;", "appSettingMapper", "Lcom/lotuss/oneapp/data/model/mapper/AppSettingMapper;", "checkAppVersionMapper", "Lcom/lotuss/oneapp/data/model/mapper/CheckAppVersionMapper;", "promotionService", "Lcom/lotuss/oneapp/data/remote/cms/PromotionService;", "versionService", "Lcom/lotuss/oneapp/data/remote/cms/VersionService;", "sharePreferencesUseCase", "Lcom/lotuss/oneapp/domain/usecase/SharePreferencesUseCase;", "infoService", "Lcom/lotuss/oneapp/data/remote/cms/InfoService;", "targetedCouponService", "Lcom/lotuss/oneapp/data/remote/cms/TargetedCouponService;", "callCenterPhoneMapper", "Lcom/lotuss/oneapp/data/model/mapper/CallCenterPhoneMapper;", "myRewardsDetailMapper", "Lcom/lotuss/oneapp/data/model/mapper/MyRewardsDetailMapper;", "targetedCouponDetailMapper", "Lcom/lotuss/oneapp/data/model/mapper/TargetedCouponDetailMapper;", "buildConfigManager", "Lcom/lotuss/oneapp/domain/util/BuildConfigManager;", "(Lcom/lotuss/oneapp/data/model/Config;Lcom/lotuss/oneapp/data/model/mapper/PromotionMapper;Lcom/lotuss/oneapp/data/model/mapper/PromotionDetailMapper;Lcom/lotuss/oneapp/data/model/mapper/AppSettingMapper;Lcom/lotuss/oneapp/data/model/mapper/CheckAppVersionMapper;Lcom/lotuss/oneapp/data/remote/cms/PromotionService;Lcom/lotuss/oneapp/data/remote/cms/VersionService;Lcom/lotuss/oneapp/domain/usecase/SharePreferencesUseCase;Lcom/lotuss/oneapp/data/remote/cms/InfoService;Lcom/lotuss/oneapp/data/remote/cms/TargetedCouponService;Lcom/lotuss/oneapp/data/model/mapper/CallCenterPhoneMapper;Lcom/lotuss/oneapp/data/model/mapper/MyRewardsDetailMapper;Lcom/lotuss/oneapp/data/model/mapper/TargetedCouponDetailMapper;Lcom/lotuss/oneapp/domain/util/BuildConfigManager;)V", "checkAppVersion", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Lcom/lotuss/oneapp/domain/model/CheckAppVersion;", "Lcom/lotuss/oneapp/domain/model/CmsError;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppSetting", "Ljava/util/ArrayList;", "Lcom/lotuss/oneapp/domain/model/WebContent;", "Lkotlin/collections/ArrayList;", "getCallCenter", "", "getInfoVoucher", "Lcom/lotuss/oneapp/domain/model/MyRewards$Data;", "myRewards", "(Lcom/lotuss/oneapp/domain/model/MyRewards$Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPromotionDetail", "Lcom/lotuss/oneapp/domain/model/PromotionDetail;", "promotionId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPromotionList", "Lcom/lotuss/oneapp/domain/model/Promotion;", "limit", "", "offset", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTargetedCouponDetail", "Lcom/lotuss/oneapp/domain/model/RedeemDetail;", "redeemTargetedCoupon", "", "id", "data_myPpeDebug"})
public final class CMSRepositoryImpl implements com.lotuss.oneapp.domain.repository.CMSRepository {
    private final com.lotuss.oneapp.data.model.Config config = null;
    private final com.lotuss.oneapp.data.model.mapper.PromotionMapper promotionMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.PromotionDetailMapper promotionDetailMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.AppSettingMapper appSettingMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.CheckAppVersionMapper checkAppVersionMapper = null;
    private final com.lotuss.oneapp.data.remote.cms.PromotionService promotionService = null;
    private final com.lotuss.oneapp.data.remote.cms.VersionService versionService = null;
    private final com.lotuss.oneapp.domain.usecase.SharePreferencesUseCase sharePreferencesUseCase = null;
    private final com.lotuss.oneapp.data.remote.cms.InfoService infoService = null;
    private final com.lotuss.oneapp.data.remote.cms.TargetedCouponService targetedCouponService = null;
    private final com.lotuss.oneapp.data.model.mapper.CallCenterPhoneMapper callCenterPhoneMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.MyRewardsDetailMapper myRewardsDetailMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.TargetedCouponDetailMapper targetedCouponDetailMapper = null;
    private final com.lotuss.oneapp.domain.util.BuildConfigManager buildConfigManager = null;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPromotionList(@org.jetbrains.annotations.Nullable
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.Promotion, com.lotuss.oneapp.domain.model.CmsError>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPromotionDetail(@org.jetbrains.annotations.Nullable
    java.lang.String promotionId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.PromotionDetail, com.lotuss.oneapp.domain.model.CmsError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAppSetting(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<? extends java.util.ArrayList<com.lotuss.oneapp.domain.model.WebContent>, com.lotuss.oneapp.domain.model.CmsError>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCallCenter(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<java.lang.String, com.lotuss.oneapp.domain.model.CmsError>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object checkAppVersion(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.CheckAppVersion, com.lotuss.oneapp.domain.model.CmsError>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getInfoVoucher(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.model.MyRewards.Data myRewards, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.MyRewards.Data, com.lotuss.oneapp.domain.model.CmsError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTargetedCouponDetail(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.model.MyRewards.Data myRewards, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.RedeemDetail, com.lotuss.oneapp.domain.model.CmsError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object redeemTargetedCoupon(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<kotlin.Unit, com.lotuss.oneapp.domain.model.CmsError>> p1) {
        return null;
    }
    
    public CMSRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.Config config, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.PromotionMapper promotionMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.PromotionDetailMapper promotionDetailMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.AppSettingMapper appSettingMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.CheckAppVersionMapper checkAppVersionMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.cms.PromotionService promotionService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.cms.VersionService versionService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.usecase.SharePreferencesUseCase sharePreferencesUseCase, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.cms.InfoService infoService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.cms.TargetedCouponService targetedCouponService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.CallCenterPhoneMapper callCenterPhoneMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.MyRewardsDetailMapper myRewardsDetailMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.TargetedCouponDetailMapper targetedCouponDetailMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.util.BuildConfigManager buildConfigManager) {
        super();
    }
}