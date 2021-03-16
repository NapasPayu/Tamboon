package com.lotuss.oneapp.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001,BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u000bH\u00c6\u0003J\t\u0010%\u001a\u00020\rH\u00c6\u0003J\t\u0010&\u001a\u00020\u000fH\u00c6\u0003Jc\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006-"}, d2 = {"Lcom/lotuss/oneapp/data/model/RedeemResultEntity;", "", "agencyName", "", "campaignId", "", "expireIn", "name", "redeemKey", "serial", "isNotAutoUse", "", "currentDate", "", "updatedPoints", "Lcom/lotuss/oneapp/data/model/RedeemResultEntity$UpdatedPoints;", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLcom/lotuss/oneapp/data/model/RedeemResultEntity$UpdatedPoints;)V", "getAgencyName", "()Ljava/lang/String;", "getCampaignId", "()I", "getCurrentDate", "()J", "getExpireIn", "()Z", "getName", "getRedeemKey", "getSerial", "getUpdatedPoints", "()Lcom/lotuss/oneapp/data/model/RedeemResultEntity$UpdatedPoints;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "UpdatedPoints", "data_myPpeDebug"})
public final class RedeemResultEntity {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "AgencyName")
    private final java.lang.String agencyName = null;
    @com.google.gson.annotations.SerializedName(value = "CampaignId")
    private final int campaignId = 0;
    @com.google.gson.annotations.SerializedName(value = "ExpireIn")
    private final int expireIn = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "RedeemKey")
    private final java.lang.String redeemKey = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Serial")
    private final java.lang.String serial = null;
    @com.google.gson.annotations.SerializedName(value = "IsNotAutoUse")
    private final boolean isNotAutoUse = false;
    @com.google.gson.annotations.SerializedName(value = "CurrentDate")
    private final long currentDate = 0L;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "updated_points")
    private final com.lotuss.oneapp.data.model.RedeemResultEntity.UpdatedPoints updatedPoints = null;
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAgencyName() {
        return null;
    }
    
    public final int getCampaignId() {
        return 0;
    }
    
    public final int getExpireIn() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRedeemKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSerial() {
        return null;
    }
    
    public final boolean isNotAutoUse() {
        return false;
    }
    
    public final long getCurrentDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lotuss.oneapp.data.model.RedeemResultEntity.UpdatedPoints getUpdatedPoints() {
        return null;
    }
    
    public RedeemResultEntity(@org.jetbrains.annotations.NotNull
    java.lang.String agencyName, int campaignId, int expireIn, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String redeemKey, @org.jetbrains.annotations.NotNull
    java.lang.String serial, boolean isNotAutoUse, long currentDate, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.RedeemResultEntity.UpdatedPoints updatedPoints) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final long component8() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lotuss.oneapp.data.model.RedeemResultEntity.UpdatedPoints component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lotuss.oneapp.data.model.RedeemResultEntity copy(@org.jetbrains.annotations.NotNull
    java.lang.String agencyName, int campaignId, int expireIn, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String redeemKey, @org.jetbrains.annotations.NotNull
    java.lang.String serial, boolean isNotAutoUse, long currentDate, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.RedeemResultEntity.UpdatedPoints updatedPoints) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/lotuss/oneapp/data/model/RedeemResultEntity$UpdatedPoints;", "", "points", "", "time", "(II)V", "getPoints", "()I", "getTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "data_myPpeDebug"})
    public static final class UpdatedPoints {
        @com.google.gson.annotations.SerializedName(value = "points")
        private final int points = 0;
        @com.google.gson.annotations.SerializedName(value = "time")
        private final int time = 0;
        
        public final int getPoints() {
            return 0;
        }
        
        public final int getTime() {
            return 0;
        }
        
        public UpdatedPoints(int points, int time) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.lotuss.oneapp.data.model.RedeemResultEntity.UpdatedPoints copy(int points, int time) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object p0) {
            return false;
        }
    }
}