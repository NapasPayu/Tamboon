package com.lotuss.oneapp.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0014J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0011H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u000bH\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u0095\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u00c6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0003H\u00d6\u0001J\t\u0010:\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018\u00a8\u0006;"}, d2 = {"Lcom/lotuss/oneapp/data/model/CampaignListEntity;", "", "agencyID", "", "agencyName", "", "categoryID", "categoryName", "condition", "detail", "expireDate", "", "fullImageUrl", "id", "name", "pointPerUnit", "qty", "", "startDate", "website", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;IDILjava/lang/String;)V", "getAgencyID", "()I", "getAgencyName", "()Ljava/lang/String;", "getCategoryID", "getCategoryName", "getCondition", "getDetail", "getExpireDate", "()J", "getFullImageUrl", "getId", "getName", "getPointPerUnit", "getQty", "()D", "getStartDate", "getWebsite", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "data_myPpeDebug"})
public final class CampaignListEntity {
    @com.google.gson.annotations.SerializedName(value = "AgencyId")
    private final int agencyID = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "AgencyName")
    private final java.lang.String agencyName = null;
    @com.google.gson.annotations.SerializedName(value = "CategoryId")
    private final int categoryID = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "CategoryName")
    private final java.lang.String categoryName = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Condition")
    private final java.lang.String condition = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Detail")
    private final java.lang.String detail = null;
    @com.google.gson.annotations.SerializedName(value = "ExpireDate")
    private final long expireDate = 0L;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "FullImageUrl")
    private final java.lang.String fullImageUrl = null;
    @com.google.gson.annotations.SerializedName(value = "ID")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Name")
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "PointPerUnit")
    private final int pointPerUnit = 0;
    @com.google.gson.annotations.SerializedName(value = "Qty")
    private final double qty = 0.0;
    @com.google.gson.annotations.SerializedName(value = "StartDate")
    private final int startDate = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "Website")
    private final java.lang.String website = null;
    
    public final int getAgencyID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAgencyName() {
        return null;
    }
    
    public final int getCategoryID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategoryName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCondition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDetail() {
        return null;
    }
    
    public final long getExpireDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFullImageUrl() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getPointPerUnit() {
        return 0;
    }
    
    public final double getQty() {
        return 0.0;
    }
    
    public final int getStartDate() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebsite() {
        return null;
    }
    
    public CampaignListEntity(int agencyID, @org.jetbrains.annotations.NotNull
    java.lang.String agencyName, int categoryID, @org.jetbrains.annotations.NotNull
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull
    java.lang.String condition, @org.jetbrains.annotations.NotNull
    java.lang.String detail, long expireDate, @org.jetbrains.annotations.NotNull
    java.lang.String fullImageUrl, int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, int pointPerUnit, double qty, int startDate, @org.jetbrains.annotations.NotNull
    java.lang.String website) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
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
    
    public final long component7() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lotuss.oneapp.data.model.CampaignListEntity copy(int agencyID, @org.jetbrains.annotations.NotNull
    java.lang.String agencyName, int categoryID, @org.jetbrains.annotations.NotNull
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull
    java.lang.String condition, @org.jetbrains.annotations.NotNull
    java.lang.String detail, long expireDate, @org.jetbrains.annotations.NotNull
    java.lang.String fullImageUrl, int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, int pointPerUnit, double qty, int startDate, @org.jetbrains.annotations.NotNull
    java.lang.String website) {
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