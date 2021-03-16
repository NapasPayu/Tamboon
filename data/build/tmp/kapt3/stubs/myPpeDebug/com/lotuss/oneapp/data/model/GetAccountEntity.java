package com.lotuss.oneapp.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0011H\u00c6\u0003J\t\u0010-\u001a\u00020\u0015H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u00104\u001a\u00020\u0011H\u00c6\u0003J\t\u00105\u001a\u00020\u0011H\u00c6\u0003J\u0085\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020;H\u00d6\u0001J\t\u0010<\u001a\u00020\u0011H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a\u00a8\u0006="}, d2 = {"Lcom/lotuss/oneapp/data/model/GetAccountEntity;", "", "nameEntity", "Lcom/lotuss/oneapp/data/model/GetAccountNameEntity;", "dobEntity", "Lcom/lotuss/oneapp/data/model/GetAccountDateOfBirthEntity;", "emailEntity", "Lcom/lotuss/oneapp/data/model/GetAccountEmailEntity;", "addrEntity", "Lcom/lotuss/oneapp/data/model/GetAccountAddressEntity;", "phoneEntity", "Lcom/lotuss/oneapp/data/model/GetAccountPhoneEntity;", "otherEntity", "Lcom/lotuss/oneapp/data/model/GetAccountOtherEntity;", "prefEntity", "Lcom/lotuss/oneapp/data/model/GetAccountPreferenceEntity;", "provinceName", "", "districtName", "subDistrictName", "statementVoucherFeatureType", "Lcom/lotuss/oneapp/domain/constant/StatementVoucherFeatureType;", "(Lcom/lotuss/oneapp/data/model/GetAccountNameEntity;Lcom/lotuss/oneapp/data/model/GetAccountDateOfBirthEntity;Lcom/lotuss/oneapp/data/model/GetAccountEmailEntity;Lcom/lotuss/oneapp/data/model/GetAccountAddressEntity;Lcom/lotuss/oneapp/data/model/GetAccountPhoneEntity;Lcom/lotuss/oneapp/data/model/GetAccountOtherEntity;Lcom/lotuss/oneapp/data/model/GetAccountPreferenceEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lotuss/oneapp/domain/constant/StatementVoucherFeatureType;)V", "getAddrEntity", "()Lcom/lotuss/oneapp/data/model/GetAccountAddressEntity;", "getDistrictName", "()Ljava/lang/String;", "getDobEntity", "()Lcom/lotuss/oneapp/data/model/GetAccountDateOfBirthEntity;", "getEmailEntity", "()Lcom/lotuss/oneapp/data/model/GetAccountEmailEntity;", "getNameEntity", "()Lcom/lotuss/oneapp/data/model/GetAccountNameEntity;", "getOtherEntity", "()Lcom/lotuss/oneapp/data/model/GetAccountOtherEntity;", "getPhoneEntity", "()Lcom/lotuss/oneapp/data/model/GetAccountPhoneEntity;", "getPrefEntity", "()Lcom/lotuss/oneapp/data/model/GetAccountPreferenceEntity;", "getProvinceName", "getStatementVoucherFeatureType", "()Lcom/lotuss/oneapp/domain/constant/StatementVoucherFeatureType;", "getSubDistrictName", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_myPpeDebug"})
public final class GetAccountEntity {
    @org.jetbrains.annotations.Nullable
    private final com.lotuss.oneapp.data.model.GetAccountNameEntity nameEntity = null;
    @org.jetbrains.annotations.Nullable
    private final com.lotuss.oneapp.data.model.GetAccountDateOfBirthEntity dobEntity = null;
    @org.jetbrains.annotations.Nullable
    private final com.lotuss.oneapp.data.model.GetAccountEmailEntity emailEntity = null;
    @org.jetbrains.annotations.Nullable
    private final com.lotuss.oneapp.data.model.GetAccountAddressEntity addrEntity = null;
    @org.jetbrains.annotations.Nullable
    private final com.lotuss.oneapp.data.model.GetAccountPhoneEntity phoneEntity = null;
    @org.jetbrains.annotations.Nullable
    private final com.lotuss.oneapp.data.model.GetAccountOtherEntity otherEntity = null;
    @org.jetbrains.annotations.Nullable
    private final com.lotuss.oneapp.data.model.GetAccountPreferenceEntity prefEntity = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String provinceName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String districtName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String subDistrictName = null;
    @org.jetbrains.annotations.NotNull
    private final com.lotuss.oneapp.domain.constant.StatementVoucherFeatureType statementVoucherFeatureType = null;
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountNameEntity getNameEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountDateOfBirthEntity getDobEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountEmailEntity getEmailEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountAddressEntity getAddrEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountPhoneEntity getPhoneEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountOtherEntity getOtherEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountPreferenceEntity getPrefEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProvinceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDistrictName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubDistrictName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lotuss.oneapp.domain.constant.StatementVoucherFeatureType getStatementVoucherFeatureType() {
        return null;
    }
    
    public GetAccountEntity(@org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountNameEntity nameEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountDateOfBirthEntity dobEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountEmailEntity emailEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountAddressEntity addrEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountPhoneEntity phoneEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountOtherEntity otherEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountPreferenceEntity prefEntity, @org.jetbrains.annotations.NotNull
    java.lang.String provinceName, @org.jetbrains.annotations.NotNull
    java.lang.String districtName, @org.jetbrains.annotations.NotNull
    java.lang.String subDistrictName, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.constant.StatementVoucherFeatureType statementVoucherFeatureType) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountNameEntity component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountDateOfBirthEntity component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountEmailEntity component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountAddressEntity component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountPhoneEntity component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountOtherEntity component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.data.model.GetAccountPreferenceEntity component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lotuss.oneapp.domain.constant.StatementVoucherFeatureType component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lotuss.oneapp.data.model.GetAccountEntity copy(@org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountNameEntity nameEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountDateOfBirthEntity dobEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountEmailEntity emailEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountAddressEntity addrEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountPhoneEntity phoneEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountOtherEntity otherEntity, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.data.model.GetAccountPreferenceEntity prefEntity, @org.jetbrains.annotations.NotNull
    java.lang.String provinceName, @org.jetbrains.annotations.NotNull
    java.lang.String districtName, @org.jetbrains.annotations.NotNull
    java.lang.String subDistrictName, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.constant.StatementVoucherFeatureType statementVoucherFeatureType) {
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