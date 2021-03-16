package com.lotuss.oneapp.data.local.sharepreferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\nH\u0016J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\nH\u0016J\b\u0010%\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\u0010\u0010+\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/lotuss/oneapp/data/local/sharepreferences/SharePreferencesDataSourceImpl;", "Lcom/lotuss/oneapp/data/local/sharepreferences/SharePreferencesDataSource;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "prefs", "Landroid/content/SharedPreferences$Editor;", "commitSharedPreference", "", "prefKey", "", "value", "", "commitSharedPreferenceEncrypt", "getAllKeyPreference", "", "getBooleanSharedPreference", "", "defaultValue", "getIntSharedPreference", "", "getKeyBZBLvl12", "getKeyBZBLvl16", "getKeyCognitoRefreshTokenPreference", "getKeyCognitoToken16Preference", "getKeyCognitoTokenPreference", "getKeyCountNationIDNotMatch", "getKeyCountPinNotMatch", "getKeyDateForgotPinAvailable", "getKeyDateVerifyPinAvailable", "getKeyDisplayOnboardingPreference", "getKeyLanguagePreference", "getKeyLastVerifyPreference", "getKeyMCATokenLvl12Preference", "getKeyMCATokenLvl16Preference", "getKeyPinPreference", "getKeyPinStatus", "getKeyPoint", "getLongSharedPreference", "", "getSharedPreferenceDecrypt", "getStringSharedPreference", "getTimeVerifyPin", "removeSharePreferenceByPrefKey", "Companion", "data_myPpeDebug"})
public final class SharePreferencesDataSourceImpl implements com.lotuss.oneapp.data.local.sharepreferences.SharePreferencesDataSource {
    private final android.content.SharedPreferences.Editor prefs = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_DISPLAYED_ONBOARDING = "39E552040FA1543FF765239F65E2E7F4C61AE4E7DB6F7BE596EEA684667C652A";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_MCA_TOKEN_LVL12 = "73D87EA8AB8A03161724E2A69052F3F234C812881F27068F01B54C8FC4973EAE";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_LANGUAGE = "7DDBA3607B129EA76432CFBFBCADA590664197F0B7D5D8F2EA7765E2106A73C6";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_COGNITO_TOKEN = "10FB5775D284564D0457BF953A0D20A6DD002135BE112D68D88456BCB204FCC3";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_COGNITO_REFRESH_TOKEN = "2194D332EA6FD3718D683A813EEFDFB4E6D266B3C69BBAE99D49AE276733D33F";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_PIN = "A619419ACAC43A1265B782D332AB0095302FF968C6AE24DDFF3F6B09900A478F";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_LAST_VERIFY = "9D7EA09730D36724C0BFF3DA086E93813A1E8A4BD5E8E697FA2075FBD7EA7D21";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_MCA_TOKEN_LVL16 = "507323D24675FBF6475D9B1B865AA8451C781228687D5FBADBA409094A948B64";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_COGNITO_TOKEN_16 = "9CE595E4C724A290BCEC05311D829ABB603B444F36FBD96F97F116B4EFA74099";
    
    /**
     * * pin status
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_PIN_STATUS = "58D8A3D4860C7991913D1C853881BE11A5F8F3F498878E9E6DABBAF330C5D8A4";
    
    /**
     * * verify pin block
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_COUNT_PIN_NOT_MATCH = "45FD8B8DDC13DFCEDE32437B67DFC2F47A7FE43BF0D1007441273FBFFF2BE3A8";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_DATE_AVAILABLE = "75678B150991FB0574927D7F8E2813F23C8D9D620D6824FE522C37F8BB44D44D";
    
    /**
     * * verify pin block
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_COUNT_NATIONID_NOT_MATCH = "510224DDD918E25E7B978CDB7CE552E4B1D0D3EB926E4A0C81028217A066751C";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_DATE_FORGOTPIN_AVAILABLE = "F918FAB437DFEF4E67CDF51D039FF2BC28EAC1AB8E54429C89B7E36B88EEDB1B";
    
    /**
     * * verify pin block
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_BZB_TOKEN_12 = "DD23E3F580050A5FDD5F0365D64918239AAD63FB6752A462DE2D662C425E93D1";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_BZB_TOKEN_16 = "DB04A11E74EF18B131077D5C140EB48F63A10D1816FA94E70D53094DD38A3E65";
    
    /**
     * * get point
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREF_POINT = "251FECD592E56E6C4A95121752F4A73BB802DFFC1CC4BCE6100206EE2B7CB650";
    public static final int TIME_VERIFY_PIN = 1800000;
    @org.jetbrains.annotations.NotNull
    public static final com.lotuss.oneapp.data.local.sharepreferences.SharePreferencesDataSourceImpl.Companion Companion = null;
    
    @java.lang.Override
    public void commitSharedPreferenceEncrypt(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getSharedPreferenceDecrypt(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey) {
        return null;
    }
    
    @java.lang.Override
    public void commitSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey, @org.jetbrains.annotations.NotNull
    java.lang.Object value) {
    }
    
    @java.lang.Override
    public int getIntSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey) {
        return 0;
    }
    
    @java.lang.Override
    public long getLongSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getStringSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey) {
        return null;
    }
    
    @java.lang.Override
    public boolean getBooleanSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey, boolean defaultValue) {
        return false;
    }
    
    @java.lang.Override
    public void removeSharePreferenceByPrefKey(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.Map<java.lang.String, ?> getAllKeyPreference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyDisplayOnboardingPreference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyMCATokenLvl12Preference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyLanguagePreference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyCognitoTokenPreference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyCognitoRefreshTokenPreference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyPinPreference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyLastVerifyPreference() {
        return null;
    }
    
    @java.lang.Override
    public int getTimeVerifyPin() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyMCATokenLvl16Preference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyCognitoToken16Preference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyPinStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyDateVerifyPinAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyCountPinNotMatch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyDateForgotPinAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyCountNationIDNotMatch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyBZBLvl12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyBZBLvl16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKeyPoint() {
        return null;
    }
    
    public SharePreferencesDataSourceImpl(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/lotuss/oneapp/data/local/sharepreferences/SharePreferencesDataSourceImpl$Companion;", "", "()V", "PREF_BZB_TOKEN_12", "", "PREF_BZB_TOKEN_16", "PREF_COGNITO_REFRESH_TOKEN", "PREF_COGNITO_TOKEN", "PREF_COGNITO_TOKEN_16", "PREF_COUNT_NATIONID_NOT_MATCH", "PREF_COUNT_PIN_NOT_MATCH", "PREF_DATE_AVAILABLE", "PREF_DATE_FORGOTPIN_AVAILABLE", "PREF_DISPLAYED_ONBOARDING", "PREF_LANGUAGE", "PREF_LAST_VERIFY", "PREF_MCA_TOKEN_LVL12", "PREF_MCA_TOKEN_LVL16", "PREF_PIN", "PREF_PIN_STATUS", "PREF_POINT", "TIME_VERIFY_PIN", "", "data_myPpeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}