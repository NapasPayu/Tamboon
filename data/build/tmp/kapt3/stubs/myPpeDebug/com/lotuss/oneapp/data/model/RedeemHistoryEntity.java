package com.lotuss.oneapp.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u000eH\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0012H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0012H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\u00a9\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0012H\u00c6\u0001J\u0013\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020\u0007H\u00d6\u0001J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\"R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0016\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010&\u00a8\u0006?"}, d2 = {"Lcom/lotuss/oneapp/data/model/RedeemHistoryEntity;", "", "agencyName", "", "condition", "conditionEN", "currentDate", "", "detail", "detailEN", "expireIn", "fullImageUrl", "iD", "isUsed", "", "name", "nameEN", "redeemDate", "", "redeemKey", "serial", "voucherExpireDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V", "getAgencyName", "()Ljava/lang/String;", "getCondition", "getConditionEN", "getCurrentDate", "()I", "getDetail", "getDetailEN", "getExpireIn", "getFullImageUrl", "getID", "()Z", "getName", "getNameEN", "getRedeemDate", "()J", "getRedeemKey", "getSerial", "getVoucherExpireDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_myPpeDebug"})
public final class RedeemHistoryEntity {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "AgencyName")
    private final java.lang.String agencyName = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Condition")
    private final java.lang.String condition = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "ConditionEN")
    private final java.lang.String conditionEN = null;
    @com.google.gson.annotations.SerializedName(value = "CurrentDate")
    private final int currentDate = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Detail")
    private final java.lang.String detail = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "DetailEN")
    private final java.lang.String detailEN = null;
    @com.google.gson.annotations.SerializedName(value = "ExpireIn")
    private final int expireIn = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "FullImageUrl")
    private final java.lang.String fullImageUrl = null;
    @com.google.gson.annotations.SerializedName(value = "ID")
    private final int iD = 0;
    @com.google.gson.annotations.SerializedName(value = "IsUsed")
    private final boolean isUsed = false;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "NameEN")
    private final java.lang.String nameEN = null;
    @com.google.gson.annotations.SerializedName(value = "RedeemDate")
    private final long redeemDate = 0L;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "RedeemKey")
    private final java.lang.String redeemKey = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Serial")
    private final java.lang.String serial = null;
    @com.google.gson.annotations.SerializedName(value = "VoucherExpireDate")
    private final long voucherExpireDate = 0L;
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAgencyName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCondition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getConditionEN() {
        return null;
    }
    
    public final int getCurrentDate() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDetailEN() {
        return null;
    }
    
    public final int getExpireIn() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFullImageUrl() {
        return null;
    }
    
    public final int getID() {
        return 0;
    }
    
    public final boolean isUsed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNameEN() {
        return null;
    }
    
    public final long getRedeemDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRedeemKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSerial() {
        return null;
    }
    
    public final long getVoucherExpireDate() {
        return 0L;
    }
    
    public RedeemHistoryEntity(@org.jetbrains.annotations.NotNull
    java.lang.String agencyName, @org.jetbrains.annotations.NotNull
    java.lang.String condition, @org.jetbrains.annotations.NotNull
    java.lang.String conditionEN, int currentDate, @org.jetbrains.annotations.NotNull
    java.lang.String detail, @org.jetbrains.annotations.NotNull
    java.lang.String detailEN, int expireIn, @org.jetbrains.annotations.NotNull
    java.lang.String fullImageUrl, int iD, boolean isUsed, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String nameEN, long redeemDate, @org.jetbrains.annotations.NotNull
    java.lang.String redeemKey, @org.jetbrains.annotations.NotNull
    java.lang.String serial, long voucherExpireDate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    public final long component13() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    public final long component16() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lotuss.oneapp.data.model.RedeemHistoryEntity copy(@org.jetbrains.annotations.NotNull
    java.lang.String agencyName, @org.jetbrains.annotations.NotNull
    java.lang.String condition, @org.jetbrains.annotations.NotNull
    java.lang.String conditionEN, int currentDate, @org.jetbrains.annotations.NotNull
    java.lang.String detail, @org.jetbrains.annotations.NotNull
    java.lang.String detailEN, int expireIn, @org.jetbrains.annotations.NotNull
    java.lang.String fullImageUrl, int iD, boolean isUsed, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String nameEN, long redeemDate, @org.jetbrains.annotations.NotNull
    java.lang.String redeemKey, @org.jetbrains.annotations.NotNull
    java.lang.String serial, long voucherExpireDate) {
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