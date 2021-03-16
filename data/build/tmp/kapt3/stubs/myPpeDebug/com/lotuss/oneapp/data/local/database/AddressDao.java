package com.lotuss.oneapp.data.local.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\'J\b\u0010\u0005\u001a\u00020\u0003H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u0019\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J;\u0010\u001c\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ;\u0010\u001e\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/lotuss/oneapp/data/local/database/AddressDao;", "", "deleteAll", "", "deleteDistrict", "deleteProvince", "deleteSubDistrict", "gerDistrict", "", "Lcom/lotuss/oneapp/data/model/DistrictEntity;", "provinceID", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gerDistrictByName", "district", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProvince", "Lcom/lotuss/oneapp/data/model/ProvinceEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProvinceByName", "province", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubDistrict", "Lcom/lotuss/oneapp/data/model/SubDistrictEntity;", "districtId", "getSubDistrictByName", "subDistrict", "insertAddress", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAddress", "data_myPpeDebug"})
public abstract interface AddressDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM Province")
    public abstract java.lang.Object getProvince(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.data.model.ProvinceEntity>> p0);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM Province WHERE id LIKE :province OR name LIKE :province")
    public abstract java.lang.Object getProvinceByName(@org.jetbrains.annotations.NotNull
    java.lang.String province, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.data.model.ProvinceEntity> p1);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM District WHERE parentId LIKE :provinceID")
    public abstract java.lang.Object gerDistrict(int provinceID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.data.model.DistrictEntity>> p1);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM District WHERE parentId LIKE :provinceID AND (name LIKE :district OR nameTh LIKE :district)")
    public abstract java.lang.Object gerDistrictByName(int provinceID, @org.jetbrains.annotations.NotNull
    java.lang.String district, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.data.model.DistrictEntity> p2);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM SubDistrict WHERE parentId LIKE :districtId")
    public abstract java.lang.Object getSubDistrict(int districtId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.data.model.SubDistrictEntity>> p1);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM SubDistrict WHERE parentId LIKE :districtId AND (name LIKE :subDistrict OR nameTh LIKE :subDistrict)")
    public abstract java.lang.Object getSubDistrictByName(int districtId, @org.jetbrains.annotations.NotNull
    java.lang.String subDistrict, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.data.model.SubDistrictEntity> p2);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Transaction
    public abstract java.lang.Object saveAddress(@org.jetbrains.annotations.NotNull
    java.util.List<com.lotuss.oneapp.data.model.ProvinceEntity> province, @org.jetbrains.annotations.NotNull
    java.util.List<com.lotuss.oneapp.data.model.DistrictEntity> district, @org.jetbrains.annotations.NotNull
    java.util.List<com.lotuss.oneapp.data.model.SubDistrictEntity> subDistrict, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertAddress(@org.jetbrains.annotations.NotNull
    java.util.List<com.lotuss.oneapp.data.model.ProvinceEntity> province, @org.jetbrains.annotations.NotNull
    java.util.List<com.lotuss.oneapp.data.model.DistrictEntity> district, @org.jetbrains.annotations.NotNull
    java.util.List<com.lotuss.oneapp.data.model.SubDistrictEntity> subDistrict, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3);
    
    @androidx.room.Query(value = "DELETE FROM Province")
    public abstract void deleteProvince();
    
    @androidx.room.Query(value = "DELETE FROM District")
    public abstract void deleteDistrict();
    
    @androidx.room.Query(value = "DELETE FROM SubDistrict")
    public abstract void deleteSubDistrict();
    
    public abstract void deleteAll();
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable
        @androidx.room.Transaction
        public static java.lang.Object saveAddress(@org.jetbrains.annotations.NotNull
        com.lotuss.oneapp.data.local.database.AddressDao $this, @org.jetbrains.annotations.NotNull
        java.util.List<com.lotuss.oneapp.data.model.ProvinceEntity> province, @org.jetbrains.annotations.NotNull
        java.util.List<com.lotuss.oneapp.data.model.DistrictEntity> district, @org.jetbrains.annotations.NotNull
        java.util.List<com.lotuss.oneapp.data.model.SubDistrictEntity> subDistrict, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> p4) {
            return null;
        }
        
        public static void deleteAll(@org.jetbrains.annotations.NotNull
        com.lotuss.oneapp.data.local.database.AddressDao $this) {
        }
    }
}