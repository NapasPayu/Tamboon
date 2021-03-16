package com.lotuss.oneapp.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/lotuss/oneapp/data/model/AddressEntity;", "", "code", "", "data", "", "Lcom/lotuss/oneapp/data/model/AddressEntity$Data;", "(ILjava/util/List;)V", "getCode", "()I", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Data", "data_myPpeDebug"})
public final class AddressEntity {
    @com.google.gson.annotations.SerializedName(value = "code")
    private final int code = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "data")
    private final java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data> data = null;
    
    public final int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data> getData() {
        return null;
    }
    
    public AddressEntity(int code, @org.jetbrains.annotations.NotNull
    java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data> data) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lotuss.oneapp.data.model.AddressEntity copy(int code, @org.jetbrains.annotations.NotNull
    java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data> data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J9\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/lotuss/oneapp/data/model/AddressEntity$Data;", "", "districts", "", "Lcom/lotuss/oneapp/data/model/AddressEntity$Data$District;", "id", "", "name", "", "nameTh", "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "getDistricts", "()Ljava/util/List;", "getId", "()I", "getName", "()Ljava/lang/String;", "getNameTh", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "District", "data_myPpeDebug"})
    public static final class Data {
        @org.jetbrains.annotations.NotNull
        @com.google.gson.annotations.SerializedName(value = "districts")
        private final java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data.District> districts = null;
        @com.google.gson.annotations.SerializedName(value = "id")
        private final int id = 0;
        @org.jetbrains.annotations.NotNull
        @com.google.gson.annotations.SerializedName(value = "name")
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable
        @com.google.gson.annotations.SerializedName(value = "name_th")
        private final java.lang.String nameTh = null;
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data.District> getDistricts() {
            return null;
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getNameTh() {
            return null;
        }
        
        public Data(@org.jetbrains.annotations.NotNull
        java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data.District> districts, int id, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.lang.String nameTh) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data.District> component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.lotuss.oneapp.data.model.AddressEntity.Data copy(@org.jetbrains.annotations.NotNull
        java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data.District> districts, int id, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.lang.String nameTh) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lcom/lotuss/oneapp/data/model/AddressEntity$Data$District;", "", "id", "", "name", "", "nameTh", "subdistricts", "", "Lcom/lotuss/oneapp/data/model/AddressEntity$Data$District$Subdistrict;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getNameTh", "getSubdistricts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Subdistrict", "data_myPpeDebug"})
        public static final class District {
            @com.google.gson.annotations.SerializedName(value = "id")
            private final int id = 0;
            @org.jetbrains.annotations.NotNull
            @com.google.gson.annotations.SerializedName(value = "name")
            private final java.lang.String name = null;
            @org.jetbrains.annotations.Nullable
            @com.google.gson.annotations.SerializedName(value = "name_th")
            private final java.lang.String nameTh = null;
            @org.jetbrains.annotations.NotNull
            @com.google.gson.annotations.SerializedName(value = "subdistricts")
            private final java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data.District.Subdistrict> subdistricts = null;
            
            public final int getId() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getName() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getNameTh() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data.District.Subdistrict> getSubdistricts() {
                return null;
            }
            
            public District(int id, @org.jetbrains.annotations.NotNull
            java.lang.String name, @org.jetbrains.annotations.Nullable
            java.lang.String nameTh, @org.jetbrains.annotations.NotNull
            java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data.District.Subdistrict> subdistricts) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data.District.Subdistrict> component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.lotuss.oneapp.data.model.AddressEntity.Data.District copy(int id, @org.jetbrains.annotations.NotNull
            java.lang.String name, @org.jetbrains.annotations.Nullable
            java.lang.String nameTh, @org.jetbrains.annotations.NotNull
            java.util.List<com.lotuss.oneapp.data.model.AddressEntity.Data.District.Subdistrict> subdistricts) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object p0) {
                return false;
            }
            
            @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/lotuss/oneapp/data/model/AddressEntity$Data$District$Subdistrict;", "", "id", "", "name", "", "nameTh", "postcode", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getNameTh", "getPostcode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "data_myPpeDebug"})
            public static final class Subdistrict {
                @com.google.gson.annotations.SerializedName(value = "id")
                private final int id = 0;
                @org.jetbrains.annotations.NotNull
                @com.google.gson.annotations.SerializedName(value = "name")
                private final java.lang.String name = null;
                @org.jetbrains.annotations.Nullable
                @com.google.gson.annotations.SerializedName(value = "name_th")
                private final java.lang.String nameTh = null;
                @org.jetbrains.annotations.NotNull
                @com.google.gson.annotations.SerializedName(value = "postcode")
                private final java.lang.String postcode = null;
                
                public final int getId() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String getName() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.String getNameTh() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String getPostcode() {
                    return null;
                }
                
                public Subdistrict(int id, @org.jetbrains.annotations.NotNull
                java.lang.String name, @org.jetbrains.annotations.Nullable
                java.lang.String nameTh, @org.jetbrains.annotations.NotNull
                java.lang.String postcode) {
                    super();
                }
                
                public final int component1() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.String component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.lotuss.oneapp.data.model.AddressEntity.Data.District.Subdistrict copy(int id, @org.jetbrains.annotations.NotNull
                java.lang.String name, @org.jetbrains.annotations.Nullable
                java.lang.String nameTh, @org.jetbrains.annotations.NotNull
                java.lang.String postcode) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public java.lang.String toString() {
                    return null;
                }
                
                @java.lang.Override
                public int hashCode() {
                    return 0;
                }
                
                @java.lang.Override
                public boolean equals(@org.jetbrains.annotations.Nullable
                java.lang.Object p0) {
                    return false;
                }
            }
        }
    }
}