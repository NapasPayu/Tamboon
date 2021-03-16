package com.lotuss.oneapp.data.local.database;

import java.lang.System;

@androidx.room.Database(entities = {com.lotuss.oneapp.data.model.ProvinceEntity.class, com.lotuss.oneapp.data.model.DistrictEntity.class, com.lotuss.oneapp.data.model.SubDistrictEntity.class}, version = 2)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/lotuss/oneapp/data/local/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "addressDao", "Lcom/lotuss/oneapp/data/local/database/AddressDao;", "Companion", "data_myPpeDebug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String DATABASE_NAME = "oneapp-db";
    private static volatile com.lotuss.oneapp.data.local.database.AppDatabase instance;
    @org.jetbrains.annotations.NotNull
    public static final com.lotuss.oneapp.data.local.database.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public abstract com.lotuss.oneapp.data.local.database.AddressDao addressDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/lotuss/oneapp/data/local/database/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "instance", "Lcom/lotuss/oneapp/data/local/database/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "data_myPpeDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull
        public final com.lotuss.oneapp.data.local.database.AppDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final com.lotuss.oneapp.data.local.database.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}