package com.lotuss.oneapp.data.local.sharepreferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\tH&J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\b\u0010\u0016\u001a\u00020\u0005H&J\b\u0010\u0017\u001a\u00020\u0005H&J\b\u0010\u0018\u001a\u00020\u0005H&J\b\u0010\u0019\u001a\u00020\u0005H&J\b\u0010\u001a\u001a\u00020\u0005H&J\b\u0010\u001b\u001a\u00020\u0005H&J\b\u0010\u001c\u001a\u00020\u0005H&J\b\u0010\u001d\u001a\u00020\u0005H&J\b\u0010\u001e\u001a\u00020\u0005H&J\b\u0010\u001f\u001a\u00020\u0005H&J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010$\u001a\u00020\u000eH&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006&"}, d2 = {"Lcom/lotuss/oneapp/data/local/sharepreferences/SharePreferencesDataSource;", "", "commitSharedPreference", "", "prefKey", "", "value", "commitSharedPreferenceEncrypt", "getAllKeyPreference", "", "getBooleanSharedPreference", "", "defaultValue", "getIntSharedPreference", "", "getKeyBZBLvl12", "getKeyBZBLvl16", "getKeyCognitoRefreshTokenPreference", "getKeyCognitoToken16Preference", "getKeyCognitoTokenPreference", "getKeyCountNationIDNotMatch", "getKeyCountPinNotMatch", "getKeyDateForgotPinAvailable", "getKeyDateVerifyPinAvailable", "getKeyDisplayOnboardingPreference", "getKeyLanguagePreference", "getKeyLastVerifyPreference", "getKeyMCATokenLvl12Preference", "getKeyMCATokenLvl16Preference", "getKeyPinPreference", "getKeyPinStatus", "getKeyPoint", "getLongSharedPreference", "", "getSharedPreferenceDecrypt", "getStringSharedPreference", "getTimeVerifyPin", "removeSharePreferenceByPrefKey", "data_myPpeDebug"})
public abstract interface SharePreferencesDataSource {
    
    public abstract void commitSharedPreferenceEncrypt(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey, @org.jetbrains.annotations.NotNull
    java.lang.String value);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getSharedPreferenceDecrypt(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey);
    
    public abstract void commitSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey, @org.jetbrains.annotations.NotNull
    java.lang.Object value);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getStringSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey);
    
    public abstract boolean getBooleanSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey, boolean defaultValue);
    
    public abstract int getIntSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey);
    
    public abstract void removeSharePreferenceByPrefKey(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.util.Map<java.lang.String, ?> getAllKeyPreference();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyDisplayOnboardingPreference();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyMCATokenLvl12Preference();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyLanguagePreference();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyCognitoTokenPreference();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyCognitoRefreshTokenPreference();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyPinPreference();
    
    public abstract long getLongSharedPreference(@org.jetbrains.annotations.NotNull
    java.lang.String prefKey);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyLastVerifyPreference();
    
    public abstract int getTimeVerifyPin();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyMCATokenLvl16Preference();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyCognitoToken16Preference();
    
    /**
     * * pin status
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyPinStatus();
    
    /**
     * * verify pin block
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyDateVerifyPinAvailable();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyCountPinNotMatch();
    
    /**
     * * forgot pin block
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyDateForgotPinAvailable();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyCountNationIDNotMatch();
    
    /**
     * * Bzb
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyBZBLvl12();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyBZBLvl16();
    
    /**
     * * Get Point
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getKeyPoint();
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}