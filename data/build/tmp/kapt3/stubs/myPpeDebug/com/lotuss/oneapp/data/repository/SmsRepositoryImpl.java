package com.lotuss.oneapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\t\u001a\u0004\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/lotuss/oneapp/data/repository/SmsRepositoryImpl;", "Lcom/lotuss/oneapp/domain/repository/SmsRepository;", "context", "Landroid/content/Context;", "smsRetrieverClient", "Lcom/google/android/gms/auth/api/phone/SmsRetrieverClient;", "smsReceiver", "Lcom/lotuss/oneapp/data/receiver/SmsReceiver;", "(Landroid/content/Context;Lcom/google/android/gms/auth/api/phone/SmsRetrieverClient;Lcom/lotuss/oneapp/data/receiver/SmsReceiver;)V", "getOTP", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_myPpeDebug"})
public final class SmsRepositoryImpl implements com.lotuss.oneapp.domain.repository.SmsRepository {
    private final android.content.Context context = null;
    private final com.google.android.gms.auth.api.phone.SmsRetrieverClient smsRetrieverClient = null;
    private final com.lotuss.oneapp.data.receiver.SmsReceiver smsReceiver = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SMS_RETRIEVED = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";
    @org.jetbrains.annotations.NotNull
    public static final com.lotuss.oneapp.data.repository.SmsRepositoryImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getOTP(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    public SmsRepositoryImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.google.android.gms.auth.api.phone.SmsRetrieverClient smsRetrieverClient, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.receiver.SmsReceiver smsReceiver) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/lotuss/oneapp/data/repository/SmsRepositoryImpl$Companion;", "", "()V", "SMS_RETRIEVED", "", "data_myPpeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}