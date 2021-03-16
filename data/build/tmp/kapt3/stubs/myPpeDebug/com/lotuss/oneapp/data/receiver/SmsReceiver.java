package com.lotuss.oneapp.data.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/lotuss/oneapp/data/receiver/SmsReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "otpReceiver", "Lcom/lotuss/oneapp/data/receiver/SmsReceiver$OTPReceiveListener;", "initOTPListener", "", "receiver", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "OTPReceiveListener", "data_myPpeDebug"})
public final class SmsReceiver extends android.content.BroadcastReceiver {
    private com.lotuss.oneapp.data.receiver.SmsReceiver.OTPReceiveListener otpReceiver;
    
    public final void initOTPListener(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.receiver.SmsReceiver.OTPReceiveListener receiver) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    public SmsReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/lotuss/oneapp/data/receiver/SmsReceiver$OTPReceiveListener;", "", "onOTPReceived", "", "otp", "", "onOTPTimeOut", "data_myPpeDebug"})
    public static abstract interface OTPReceiveListener {
        
        public abstract void onOTPReceived(@org.jetbrains.annotations.NotNull
        java.lang.String otp);
        
        public abstract void onOTPTimeOut();
    }
}