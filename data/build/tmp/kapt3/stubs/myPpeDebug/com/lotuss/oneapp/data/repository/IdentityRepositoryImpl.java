package com.lotuss.oneapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J5\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ%\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J%\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u00182\u0006\u0010&\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J-\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J%\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J%\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J%\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010/\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J-\u00100\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/lotuss/oneapp/data/repository/IdentityRepositoryImpl;", "Lcom/lotuss/oneapp/domain/repository/IdentityRepository;", "config", "Lcom/lotuss/oneapp/data/model/Config;", "pinService", "Lcom/lotuss/oneapp/data/remote/identity/PinService;", "userService", "Lcom/lotuss/oneapp/data/remote/identity/UserService;", "tokenService", "Lcom/lotuss/oneapp/data/remote/identity/TokenService;", "latteService", "Lcom/lotuss/oneapp/data/remote/identity/LatteService;", "pinStatusMapper", "Lcom/lotuss/oneapp/data/model/mapper/PinStatusMapper;", "pinMapper", "Lcom/lotuss/oneapp/data/model/mapper/PinMapper;", "loginMapper", "Lcom/lotuss/oneapp/data/model/mapper/LoginMapper;", "primaryClubCardMapper", "Lcom/lotuss/oneapp/data/model/mapper/PrimaryClubCardMapper;", "context", "Landroid/content/Context;", "(Lcom/lotuss/oneapp/data/model/Config;Lcom/lotuss/oneapp/data/remote/identity/PinService;Lcom/lotuss/oneapp/data/remote/identity/UserService;Lcom/lotuss/oneapp/data/remote/identity/TokenService;Lcom/lotuss/oneapp/data/remote/identity/LatteService;Lcom/lotuss/oneapp/data/model/mapper/PinStatusMapper;Lcom/lotuss/oneapp/data/model/mapper/PinMapper;Lcom/lotuss/oneapp/data/model/mapper/LoginMapper;Lcom/lotuss/oneapp/data/model/mapper/PrimaryClubCardMapper;Landroid/content/Context;)V", "getForgotPassword", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "", "Lcom/lotuss/oneapp/domain/model/CommonError;", "cognitoToken", "", "personalValue", "pin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPinStatus", "Lcom/lotuss/oneapp/domain/model/PinStatus;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrimaryClubCard", "Lcom/lotuss/oneapp/domain/model/PrimaryClubCard;", "Lcom/lotuss/oneapp/domain/model/LatteError;", "authorization", "getResultCreatePin", "Lcom/lotuss/oneapp/domain/model/Pin;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResultLogin", "Lcom/lotuss/oneapp/domain/model/Login;", "Lcom/lotuss/oneapp/domain/model/MCAError;", "getResultLoginLv16", "getResultPreSignIn", "phone", "getResultVerifyPin", "data_myPpeDebug"})
public final class IdentityRepositoryImpl implements com.lotuss.oneapp.domain.repository.IdentityRepository {
    private final com.lotuss.oneapp.data.model.Config config = null;
    private final com.lotuss.oneapp.data.remote.identity.PinService pinService = null;
    private final com.lotuss.oneapp.data.remote.identity.UserService userService = null;
    private final com.lotuss.oneapp.data.remote.identity.TokenService tokenService = null;
    private final com.lotuss.oneapp.data.remote.identity.LatteService latteService = null;
    private final com.lotuss.oneapp.data.model.mapper.PinStatusMapper pinStatusMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.PinMapper pinMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.LoginMapper loginMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.PrimaryClubCardMapper primaryClubCardMapper = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getResultLogin(@org.jetbrains.annotations.NotNull
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.Login, com.lotuss.oneapp.domain.model.MCAError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getResultLoginLv16(@org.jetbrains.annotations.NotNull
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.Login, com.lotuss.oneapp.domain.model.MCAError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPinStatus(@org.jetbrains.annotations.NotNull
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.PinStatus, com.lotuss.oneapp.domain.model.CommonError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getResultPreSignIn(@org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<kotlin.Unit, com.lotuss.oneapp.domain.model.CommonError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getResultVerifyPin(@org.jetbrains.annotations.NotNull
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    java.lang.String pin, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.Pin, com.lotuss.oneapp.domain.model.CommonError>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getResultCreatePin(@org.jetbrains.annotations.NotNull
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    java.lang.String pin, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.Pin, com.lotuss.oneapp.domain.model.CommonError>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPrimaryClubCard(@org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.PrimaryClubCard, com.lotuss.oneapp.domain.model.LatteError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getForgotPassword(@org.jetbrains.annotations.NotNull
    java.lang.String cognitoToken, @org.jetbrains.annotations.NotNull
    java.lang.String personalValue, @org.jetbrains.annotations.NotNull
    java.lang.String pin, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<kotlin.Unit, com.lotuss.oneapp.domain.model.CommonError>> p3) {
        return null;
    }
    
    public IdentityRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.Config config, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.identity.PinService pinService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.identity.UserService userService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.identity.TokenService tokenService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.identity.LatteService latteService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.PinStatusMapper pinStatusMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.PinMapper pinMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.LoginMapper loginMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.PrimaryClubCardMapper primaryClubCardMapper, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
}