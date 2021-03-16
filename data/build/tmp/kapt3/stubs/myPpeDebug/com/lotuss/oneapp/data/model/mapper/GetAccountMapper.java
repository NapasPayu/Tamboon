package com.lotuss.oneapp.data.model.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/lotuss/oneapp/data/model/mapper/GetAccountMapper;", "Lcom/lotuss/oneapp/data/model/mapper/Mapper;", "Lcom/lotuss/oneapp/data/model/GetAccountEntity;", "Lcom/lotuss/oneapp/domain/model/MemberDetail;", "country", "Lcom/lotuss/oneapp/commonui/constant/Country;", "(Lcom/lotuss/oneapp/commonui/constant/Country;)V", "getCountry", "()Lcom/lotuss/oneapp/commonui/constant/Country;", "getTitleName", "Lcom/lotuss/oneapp/domain/constant/TitleName;", "titleString", "", "map", "input", "mapPrefData", "Lcom/lotuss/oneapp/domain/model/MemberDetail$PreferencesData;", "data", "Lcom/lotuss/oneapp/data/model/GetAccountPreferenceEntity$Data;", "mapStatementVoucher", "Lcom/lotuss/oneapp/domain/model/StatementVoucher;", "statementPreferences", "", "Lcom/lotuss/oneapp/data/model/GetAccountPreferenceEntity$Data$StatementPreference;", "data_myPpeDebug"})
public final class GetAccountMapper implements com.lotuss.oneapp.data.model.mapper.Mapper<com.lotuss.oneapp.data.model.GetAccountEntity, com.lotuss.oneapp.domain.model.MemberDetail> {
    @org.jetbrains.annotations.Nullable
    private final com.lotuss.oneapp.commonui.constant.Country country = null;
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.lotuss.oneapp.domain.model.MemberDetail map(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.GetAccountEntity input) {
        return null;
    }
    
    private final com.lotuss.oneapp.domain.constant.TitleName getTitleName(java.lang.String titleString) {
        return null;
    }
    
    private final com.lotuss.oneapp.domain.model.MemberDetail.PreferencesData mapPrefData(com.lotuss.oneapp.data.model.GetAccountPreferenceEntity.Data data) {
        return null;
    }
    
    private final com.lotuss.oneapp.domain.model.StatementVoucher mapStatementVoucher(java.util.List<com.lotuss.oneapp.data.model.GetAccountPreferenceEntity.Data.StatementPreference> statementPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.lotuss.oneapp.commonui.constant.Country getCountry() {
        return null;
    }
    
    public GetAccountMapper(@org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.commonui.constant.Country country) {
        super();
    }
}