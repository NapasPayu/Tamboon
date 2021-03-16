package com.lotuss.oneapp.data.local.encryption.rsa;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/lotuss/oneapp/data/local/encryption/rsa/RSAEncryption;", "", "()V", "BASE64_FLAG", "", "RSA_ALGORITHM", "", "TRANSFORMATION", "encrypt", "plain", "publicKey", "Ljava/security/PublicKey;", "getKey", "input", "Ljava/io/InputStream;", "getRSAPublicKey", "publicKeyPEM", "data_myPpeDebug"})
public final class RSAEncryption {
    private static final java.lang.String RSA_ALGORITHM = "RSA";
    private static final java.lang.String TRANSFORMATION = "RSA/NONE/OAEPPadding";
    private static final int BASE64_FLAG = android.util.Base64.DEFAULT;
    @org.jetbrains.annotations.NotNull
    public static final com.lotuss.oneapp.data.local.encryption.rsa.RSAEncryption INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey(@org.jetbrains.annotations.NotNull
    java.io.InputStream input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.security.PublicKey getRSAPublicKey(@org.jetbrains.annotations.NotNull
    java.lang.String publicKeyPEM) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String encrypt(@org.jetbrains.annotations.NotNull
    java.lang.String plain, @org.jetbrains.annotations.Nullable
    java.security.PublicKey publicKey) {
        return null;
    }
    
    private RSAEncryption() {
        super();
    }
}