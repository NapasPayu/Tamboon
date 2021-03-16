package com.lotuss.oneapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/lotuss/oneapp/data/repository/FeatureFlagRepositoryImpl;", "Lcom/lotuss/oneapp/domain/repository/FeatureFlagRepository;", "prefs", "Lcom/lotuss/oneapp/data/local/sharepreferences/SharePreferencesDataSourceImpl;", "leanplumVariables", "Lcom/lotuss/oneapp/data/model/variables/LeanplumVariables;", "(Lcom/lotuss/oneapp/data/local/sharepreferences/SharePreferencesDataSourceImpl;Lcom/lotuss/oneapp/data/model/variables/LeanplumVariables;)V", "fetchAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFeatureEnabled", "feature", "Lcom/lotuss/oneapp/domain/model/Feature;", "(Lcom/lotuss/oneapp/domain/model/Feature;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_myPpeDebug"})
public final class FeatureFlagRepositoryImpl implements com.lotuss.oneapp.domain.repository.FeatureFlagRepository {
    private final com.lotuss.oneapp.data.local.sharepreferences.SharePreferencesDataSourceImpl prefs = null;
    private final com.lotuss.oneapp.data.model.variables.LeanplumVariables leanplumVariables = null;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object fetchAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object isFeatureEnabled(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.model.Feature feature, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    public FeatureFlagRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.local.sharepreferences.SharePreferencesDataSourceImpl prefs, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.variables.LeanplumVariables leanplumVariables) {
        super();
    }
}