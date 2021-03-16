package com.lotuss.oneapp.data.local.encryption.aes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nJ\f\u0010\u0014\u001a\u00020\n*\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/lotuss/oneapp/data/local/encryption/aes/AESHelper;", "", "()V", "ivParameterSpec", "Ljavax/crypto/spec/IvParameterSpec;", "secretKeySpec", "Ljavax/crypto/spec/SecretKeySpec;", "decodeHexString", "", "hexText", "", "decryptAES", "decrypted", "algorithm", "encryptAES", "encrypted", "setKey", "", "key", "iv", "enCodeHexString", "data_myPpeDebug"})
public final class AESHelper {
    private static javax.crypto.spec.IvParameterSpec ivParameterSpec;
    private static javax.crypto.spec.SecretKeySpec secretKeySpec;
    @org.jetbrains.annotations.NotNull
    public static final com.lotuss.oneapp.data.local.encryption.aes.AESHelper INSTANCE = null;
    
    public final void setKey(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.String iv) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String encryptAES(@org.jetbrains.annotations.NotNull
    java.lang.String encrypted, @org.jetbrains.annotations.NotNull
    java.lang.String algorithm) throws java.lang.Exception {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String decryptAES(@org.jetbrains.annotations.NotNull
    java.lang.String decrypted, @org.jetbrains.annotations.NotNull
    java.lang.String algorithm) throws java.lang.Exception {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final byte[] decodeHexString(@org.jetbrains.annotations.Nullable
    java.lang.String hexText) throws java.lang.Exception {
        return null;
    }
    
    private final java.lang.String enCodeHexString(byte[] $this$enCodeHexString) {
        return null;
    }
    
    private AESHelper() {
        super();
    }
}