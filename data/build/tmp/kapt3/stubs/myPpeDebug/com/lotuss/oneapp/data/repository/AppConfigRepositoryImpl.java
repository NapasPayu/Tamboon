package com.lotuss.oneapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/lotuss/oneapp/data/repository/AppConfigRepositoryImpl;", "Lcom/lotuss/oneapp/domain/repository/AppConfigRepository;", "leanplumVariables", "Lcom/lotuss/oneapp/data/model/variables/LeanplumVariables;", "onboardingDetailMapper", "Lcom/lotuss/oneapp/data/model/mapper/OnboardingDetailMapper;", "qrDetailMapper", "Lcom/lotuss/oneapp/data/model/mapper/QrDetailMapper;", "(Lcom/lotuss/oneapp/data/model/variables/LeanplumVariables;Lcom/lotuss/oneapp/data/model/mapper/OnboardingDetailMapper;Lcom/lotuss/oneapp/data/model/mapper/QrDetailMapper;)V", "getImagePath", "", "fileName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOnboardingConfig", "", "Lcom/lotuss/oneapp/domain/model/OnBoardingDetail;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQrConfig", "data_myPpeDebug"})
public final class AppConfigRepositoryImpl implements com.lotuss.oneapp.domain.repository.AppConfigRepository {
    private final com.lotuss.oneapp.data.model.variables.LeanplumVariables leanplumVariables = null;
    private final com.lotuss.oneapp.data.model.mapper.OnboardingDetailMapper onboardingDetailMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.QrDetailMapper qrDetailMapper = null;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getOnboardingConfig(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.domain.model.OnBoardingDetail>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getQrConfig(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getImagePath(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    public AppConfigRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.variables.LeanplumVariables leanplumVariables, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.OnboardingDetailMapper onboardingDetailMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.QrDetailMapper qrDetailMapper) {
        super();
    }
}