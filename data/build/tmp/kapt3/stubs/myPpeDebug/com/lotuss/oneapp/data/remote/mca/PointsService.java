package com.lotuss.oneapp.data.remote.mca;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ?\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/lotuss/oneapp/data/remote/mca/PointsService;", "", "getPointOffer", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Lcom/lotuss/oneapp/data/model/PointOffersEntity;", "Lcom/lotuss/oneapp/domain/model/MCAError;", "authorization", "", "mcaToken", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPointTransaction", "Lcom/lotuss/oneapp/data/model/TransactionOffersEntity;", "offerId", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPointsSummary", "Lcom/lotuss/oneapp/data/model/PointSummaryEntity;", "data_myPpeDebug"})
public abstract interface PointsService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "points/summary")
    public abstract java.lang.Object getPointsSummary(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "mcaToken")
    java.lang.String mcaToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.PointSummaryEntity, com.lotuss.oneapp.domain.model.MCAError>> p2);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "points/offers")
    public abstract java.lang.Object getPointOffer(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "mcaToken")
    java.lang.String mcaToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.PointOffersEntity, com.lotuss.oneapp.domain.model.MCAError>> p2);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "points/transactions/{offerId}")
    public abstract java.lang.Object getPointTransaction(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Header(value = "mcaToken")
    java.lang.String mcaToken, @retrofit2.http.Path(value = "offerId")
    int offerId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.data.model.TransactionOffersEntity, com.lotuss.oneapp.domain.model.MCAError>> p3);
}