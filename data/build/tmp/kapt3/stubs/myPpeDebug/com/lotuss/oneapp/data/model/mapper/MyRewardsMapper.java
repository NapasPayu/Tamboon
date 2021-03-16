package com.lotuss.oneapp.data.model.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ<\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J4\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u0010H\u0002J \u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/lotuss/oneapp/data/model/mapper/MyRewardsMapper;", "Lcom/lotuss/oneapp/data/model/mapper/Mapper;", "Lcom/lotuss/oneapp/data/model/GetCouponEntity;", "Lcom/lotuss/oneapp/domain/model/MyRewards;", "country", "Lcom/lotuss/oneapp/commonui/constant/Country;", "couponSeparationChar", "", "(Lcom/lotuss/oneapp/commonui/constant/Country;Ljava/lang/String;)V", "getCountry", "()Lcom/lotuss/oneapp/commonui/constant/Country;", "getCouponSeparationChar", "()Ljava/lang/String;", "couponBZBToRewards", "Ljava/util/ArrayList;", "Lcom/lotuss/oneapp/domain/model/MyRewards$Data;", "Lkotlin/collections/ArrayList;", "redeemHistoryEntity", "Lcom/lotuss/oneapp/data/model/RedeemHistoryEntity;", "isEn", "", "couponToRewards", "couponsAvailableEntity", "Lcom/lotuss/oneapp/data/model/CouponsAvailableEntity;", "map", "input", "targetedCoupon", "targetedCouponEntity", "Lcom/lotuss/oneapp/data/model/TargetedCouponEntity$Data;", "voucherToRewards", "vouchersAvailableEntity", "Lcom/lotuss/oneapp/data/model/VouchersAvailableEntity;", "data_myPpeDebug"})
public final class MyRewardsMapper implements com.lotuss.oneapp.data.model.mapper.Mapper<com.lotuss.oneapp.data.model.GetCouponEntity, com.lotuss.oneapp.domain.model.MyRewards> {
    @org.jetbrains.annotations.Nullable
    private final com.lotuss.oneapp.commonui.constant.Country country = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String couponSeparationChar = null;
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.lotuss.oneapp.domain.model.MyRewards map(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.GetCouponEntity input) {
        return null;
    }
    
    private final java.util.ArrayList<com.lotuss.oneapp.domain.model.MyRewards.Data> couponBZBToRewards(java.util.ArrayList<com.lotuss.oneapp.data.model.RedeemHistoryEntity> redeemHistoryEntity, boolean isEn) {
        return null;
    }
    
    private final java.util.ArrayList<com.lotuss.oneapp.domain.model.MyRewards.Data> targetedCoupon(java.util.ArrayList<com.lotuss.oneapp.data.model.TargetedCouponEntity.Data> targetedCouponEntity) {
        return null;
    }
    
    private final java.util.ArrayList<com.lotuss.oneapp.domain.model.MyRewards.Data> couponToRewards(com.lotuss.oneapp.data.model.CouponsAvailableEntity couponsAvailableEntity, boolean isEn) {
        return null;
    }
    
    private final java.util.ArrayList<com.lotuss.oneapp.domain.model.MyRewards.Data> voucherToRewards(com.lotuss.oneapp.data.model.VouchersAvailableEntity vouchersAvailableEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.commonui.constant.Country getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCouponSeparationChar() {
        return null;
    }
    
    public MyRewardsMapper(@org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.commonui.constant.Country country, @org.jetbrains.annotations.NotNull
    java.lang.String couponSeparationChar) {
        super();
    }
}