package com.lotuss.oneapp.data.model.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/lotuss/oneapp/data/model/mapper/BiMapper;", "E", "D", "", "mapFromEntity", "input", "(Ljava/lang/Object;)Ljava/lang/Object;", "mapToEntity", "data_myPpeDebug"})
public abstract interface BiMapper<E extends java.lang.Object, D extends java.lang.Object> {
    
    public abstract D mapFromEntity(E input);
    
    public abstract E mapToEntity(D input);
}