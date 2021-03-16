package com.lotuss.oneapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 H2\u00020\u0001:\u0001HB\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u00a2\u0006\u0002\u0010\"J5\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J-\u0010,\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020&0$2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.JE\u0010/\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020&0$2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u00101\u001a\u00020(2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J-\u00107\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020&0$2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.Jc\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020&0$2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006I"}, d2 = {"Lcom/lotuss/oneapp/data/repository/MCARepositoryImpl;", "Lcom/lotuss/oneapp/domain/repository/MCARepository;", "config", "Lcom/lotuss/oneapp/data/model/Config;", "pointsService", "Lcom/lotuss/oneapp/data/remote/mca/PointsService;", "bzbService", "Lcom/lotuss/oneapp/data/remote/bzb/BZBService;", "cardService", "Lcom/lotuss/oneapp/data/remote/cms/CardService;", "latteService", "Lcom/lotuss/oneapp/data/remote/identity/LatteService;", "memberDetailService", "Lcom/lotuss/oneapp/data/remote/mca/MemberDetailService;", "couponService", "Lcom/lotuss/oneapp/data/remote/mca/CouponService;", "voucherService", "Lcom/lotuss/oneapp/data/remote/mca/VoucherService;", "infoService", "Lcom/lotuss/oneapp/data/remote/cms/InfoService;", "targetedCouponService", "Lcom/lotuss/oneapp/data/remote/cms/TargetedCouponService;", "clubCardInfoMapper", "Lcom/lotuss/oneapp/data/model/mapper/ClubCardInfoMapper;", "transactionHistoryMapper", "Lcom/lotuss/oneapp/data/model/mapper/TransactionHistoryMapper;", "getAccountMapper", "Lcom/lotuss/oneapp/data/model/mapper/GetAccountMapper;", "myRewardsMapper", "Lcom/lotuss/oneapp/data/model/mapper/MyRewardsMapper;", "addressRepository", "Lcom/lotuss/oneapp/domain/repository/AddressRepository;", "sharePreferencesUseCase", "Lcom/lotuss/oneapp/domain/usecase/SharePreferencesUseCase;", "(Lcom/lotuss/oneapp/data/model/Config;Lcom/lotuss/oneapp/data/remote/mca/PointsService;Lcom/lotuss/oneapp/data/remote/bzb/BZBService;Lcom/lotuss/oneapp/data/remote/cms/CardService;Lcom/lotuss/oneapp/data/remote/identity/LatteService;Lcom/lotuss/oneapp/data/remote/mca/MemberDetailService;Lcom/lotuss/oneapp/data/remote/mca/CouponService;Lcom/lotuss/oneapp/data/remote/mca/VoucherService;Lcom/lotuss/oneapp/data/remote/cms/InfoService;Lcom/lotuss/oneapp/data/remote/cms/TargetedCouponService;Lcom/lotuss/oneapp/data/model/mapper/ClubCardInfoMapper;Lcom/lotuss/oneapp/data/model/mapper/TransactionHistoryMapper;Lcom/lotuss/oneapp/data/model/mapper/GetAccountMapper;Lcom/lotuss/oneapp/data/model/mapper/MyRewardsMapper;Lcom/lotuss/oneapp/domain/repository/AddressRepository;Lcom/lotuss/oneapp/domain/usecase/SharePreferencesUseCase;)V", "getClubCardInfo", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Lcom/lotuss/oneapp/domain/model/ClubCardInfo;", "Lcom/lotuss/oneapp/domain/model/MCAError;", "authorization", "", "mcaToken", "bzbTokenLvl12", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMemberDetail", "Lcom/lotuss/oneapp/domain/model/MemberDetail;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyRewards", "Lcom/lotuss/oneapp/domain/model/MyRewards;", "bzbToken", "byConfig", "", "top", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactionHistory", "Lcom/lotuss/oneapp/domain/model/TransactionHistory;", "saveMemberDetail", "", "nameMemberDetailEdit", "Lcom/lotuss/oneapp/domain/model/NameMemberDetailEdit;", "emailMemberDetailEdit", "Lcom/lotuss/oneapp/domain/model/EmailMemberDetailEdit;", "addressMemberDetailEdit", "Lcom/lotuss/oneapp/domain/model/AddressMemberDetailEdit;", "dobMemberDetailEdit", "Lcom/lotuss/oneapp/domain/model/DOBMemberDetailEdit;", "prefMemberDetailEdit", "Lcom/lotuss/oneapp/domain/model/MemberDetail$PreferencesData;", "otherMemberDetailEdit", "Lcom/lotuss/oneapp/domain/model/OtherMemberDetailEdit;", "(Ljava/lang/String;Ljava/lang/String;Lcom/lotuss/oneapp/domain/model/NameMemberDetailEdit;Lcom/lotuss/oneapp/domain/model/EmailMemberDetailEdit;Lcom/lotuss/oneapp/domain/model/AddressMemberDetailEdit;Lcom/lotuss/oneapp/domain/model/DOBMemberDetailEdit;Lcom/lotuss/oneapp/domain/model/MemberDetail$PreferencesData;Lcom/lotuss/oneapp/domain/model/OtherMemberDetailEdit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_myPpeDebug"})
public final class MCARepositoryImpl implements com.lotuss.oneapp.domain.repository.MCARepository {
    private final com.lotuss.oneapp.data.model.Config config = null;
    private final com.lotuss.oneapp.data.remote.mca.PointsService pointsService = null;
    private final com.lotuss.oneapp.data.remote.bzb.BZBService bzbService = null;
    private final com.lotuss.oneapp.data.remote.cms.CardService cardService = null;
    private final com.lotuss.oneapp.data.remote.identity.LatteService latteService = null;
    private final com.lotuss.oneapp.data.remote.mca.MemberDetailService memberDetailService = null;
    private final com.lotuss.oneapp.data.remote.mca.CouponService couponService = null;
    private final com.lotuss.oneapp.data.remote.mca.VoucherService voucherService = null;
    private final com.lotuss.oneapp.data.remote.cms.InfoService infoService = null;
    private final com.lotuss.oneapp.data.remote.cms.TargetedCouponService targetedCouponService = null;
    private final com.lotuss.oneapp.data.model.mapper.ClubCardInfoMapper clubCardInfoMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.TransactionHistoryMapper transactionHistoryMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.GetAccountMapper getAccountMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.MyRewardsMapper myRewardsMapper = null;
    private final com.lotuss.oneapp.domain.repository.AddressRepository addressRepository = null;
    private final com.lotuss.oneapp.domain.usecase.SharePreferencesUseCase sharePreferencesUseCase = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ERROR_CLUBCARD = "error_clubcard";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ERROR_MY_REWARDS = "error_my_rewards";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_BEARRER = "Bearer";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CONFIG_PURCHASE = "purchase";
    @org.jetbrains.annotations.NotNull
    public static final com.lotuss.oneapp.data.repository.MCARepositoryImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getClubCardInfo(@org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    java.lang.String mcaToken, @org.jetbrains.annotations.NotNull
    java.lang.String bzbTokenLvl12, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.ClubCardInfo, com.lotuss.oneapp.domain.model.MCAError>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTransactionHistory(@org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    java.lang.String mcaToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.TransactionHistory, com.lotuss.oneapp.domain.model.MCAError>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMemberDetail(@org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    java.lang.String mcaToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.MemberDetail, com.lotuss.oneapp.domain.model.MCAError>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveMemberDetail(@org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    java.lang.String mcaToken, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.model.NameMemberDetailEdit nameMemberDetailEdit, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.model.EmailMemberDetailEdit emailMemberDetailEdit, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.model.AddressMemberDetailEdit addressMemberDetailEdit, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.domain.model.DOBMemberDetailEdit dobMemberDetailEdit, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.domain.model.MemberDetail.PreferencesData prefMemberDetailEdit, @org.jetbrains.annotations.Nullable
    com.lotuss.oneapp.domain.model.OtherMemberDetailEdit otherMemberDetailEdit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<kotlin.Unit, com.lotuss.oneapp.domain.model.MCAError>> p8) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMyRewards(@org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    java.lang.String mcaToken, @org.jetbrains.annotations.NotNull
    java.lang.String bzbToken, boolean byConfig, int top, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<com.lotuss.oneapp.domain.model.MyRewards, com.lotuss.oneapp.domain.model.MCAError>> p5) {
        return null;
    }
    
    public MCARepositoryImpl(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.Config config, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.mca.PointsService pointsService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.bzb.BZBService bzbService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.cms.CardService cardService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.identity.LatteService latteService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.mca.MemberDetailService memberDetailService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.mca.CouponService couponService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.mca.VoucherService voucherService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.cms.InfoService infoService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.cms.TargetedCouponService targetedCouponService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.ClubCardInfoMapper clubCardInfoMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.TransactionHistoryMapper transactionHistoryMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.GetAccountMapper getAccountMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.MyRewardsMapper myRewardsMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.repository.AddressRepository addressRepository, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.usecase.SharePreferencesUseCase sharePreferencesUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/lotuss/oneapp/data/repository/MCARepositoryImpl$Companion;", "", "()V", "CONFIG_PURCHASE", "", "ERROR_CLUBCARD", "ERROR_MY_REWARDS", "KEY_BEARRER", "data_myPpeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}