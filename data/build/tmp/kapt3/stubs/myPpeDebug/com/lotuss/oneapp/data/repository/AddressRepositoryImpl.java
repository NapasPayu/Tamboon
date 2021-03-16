package com.lotuss.oneapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J5\u0010\u0013\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ)\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\'\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J!\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u001d\u0010%\u001a\u0004\u0018\u00010\u00162\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ)\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00172\u0006\u0010(\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\'\u0010)\u001a\u0004\u0018\u00010\u00162\b\u0010(\u001a\u0004\u0018\u00010\u001e2\b\u0010*\u001a\u0004\u0018\u00010\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/lotuss/oneapp/data/repository/AddressRepositoryImpl;", "Lcom/lotuss/oneapp/domain/repository/AddressRepository;", "config", "Lcom/lotuss/oneapp/data/model/Config;", "addressDao", "Lcom/lotuss/oneapp/data/local/database/AddressDao;", "addressService", "Lcom/lotuss/oneapp/data/remote/cms/AddressService;", "addressMapper", "Lcom/lotuss/oneapp/data/model/mapper/AddressMapper;", "provinceMapper", "Lcom/lotuss/oneapp/data/model/mapper/ProvinceMapper;", "districtMapper", "Lcom/lotuss/oneapp/data/model/mapper/DistrictMapper;", "subDistrictMapper", "Lcom/lotuss/oneapp/data/model/mapper/SubDistrictMapper;", "sharePreferencesRepository", "Lcom/lotuss/oneapp/domain/repository/SharePreferencesRepository;", "(Lcom/lotuss/oneapp/data/model/Config;Lcom/lotuss/oneapp/data/local/database/AddressDao;Lcom/lotuss/oneapp/data/remote/cms/AddressService;Lcom/lotuss/oneapp/data/model/mapper/AddressMapper;Lcom/lotuss/oneapp/data/model/mapper/ProvinceMapper;Lcom/lotuss/oneapp/data/model/mapper/DistrictMapper;Lcom/lotuss/oneapp/data/model/mapper/SubDistrictMapper;Lcom/lotuss/oneapp/domain/repository/SharePreferencesRepository;)V", "getAddress", "Lcom/lotuss/oneapp/domain/model/NetworkResponse;", "Ljava/util/ArrayList;", "Lcom/lotuss/oneapp/domain/model/Address;", "Lkotlin/collections/ArrayList;", "Lcom/lotuss/oneapp/domain/model/CmsError;", "lang", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDistrict", "provinceId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDistrictByName", "district", "(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProvince", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProvinceByName", "province", "getSubDistrict", "districtID", "getSubDistrictByName", "subDistrict", "data_myPpeDebug"})
public final class AddressRepositoryImpl implements com.lotuss.oneapp.domain.repository.AddressRepository {
    private final com.lotuss.oneapp.data.model.Config config = null;
    private final com.lotuss.oneapp.data.local.database.AddressDao addressDao = null;
    private final com.lotuss.oneapp.data.remote.cms.AddressService addressService = null;
    private final com.lotuss.oneapp.data.model.mapper.AddressMapper addressMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.ProvinceMapper provinceMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.DistrictMapper districtMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.SubDistrictMapper subDistrictMapper = null;
    private final com.lotuss.oneapp.domain.repository.SharePreferencesRepository sharePreferencesRepository = null;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAddress(@org.jetbrains.annotations.NotNull
    java.lang.String lang, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.NetworkResponse<? extends java.util.ArrayList<com.lotuss.oneapp.domain.model.Address>, com.lotuss.oneapp.domain.model.CmsError>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getProvince(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.lotuss.oneapp.domain.model.Address>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getDistrict(int provinceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.lotuss.oneapp.domain.model.Address>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSubDistrict(int districtID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.lotuss.oneapp.domain.model.Address>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getProvinceByName(@org.jetbrains.annotations.Nullable
    java.lang.String province, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.Address> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getDistrictByName(@org.jetbrains.annotations.Nullable
    java.lang.Integer provinceId, @org.jetbrains.annotations.Nullable
    java.lang.String district, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.Address> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSubDistrictByName(@org.jetbrains.annotations.Nullable
    java.lang.Integer districtID, @org.jetbrains.annotations.Nullable
    java.lang.String subDistrict, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.Address> p2) {
        return null;
    }
    
    public AddressRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.Config config, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.local.database.AddressDao addressDao, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.remote.cms.AddressService addressService, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.AddressMapper addressMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.ProvinceMapper provinceMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.DistrictMapper districtMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.SubDistrictMapper subDistrictMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.domain.repository.SharePreferencesRepository sharePreferencesRepository) {
        super();
    }
}