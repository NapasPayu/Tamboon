package com.lotuss.oneapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0011\u0010#\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00182\u0006\u0010&\u001a\u00020\'H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0011\u0010+\u001a\u00020,H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/lotuss/oneapp/data/repository/ShoppingRepositoryImpl;", "Lcom/lotuss/oneapp/domain/repository/ShoppingRepository;", "shoppingBannerMapper", "Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingBannerMapper;", "shoppingCategoriesMapper", "Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingCategoriesMapper;", "shoppingCouponMapper", "Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingCouponMapper;", "shoppingSeasonalsMapper", "Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingSeasonalsMapper;", "shoppingShopNowMapper", "Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingShopNowMapper;", "shoppingSeasonalProductListMapper", "Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingSeasonalProductListMapper;", "weeklyProductListMapper", "Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingWeeklyProductListMapper;", "shoppingFeaturedBrandsMapper", "Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingFeaturedBrandsMapper;", "shoppingRecentBoughtProductMapper", "Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingRecentBoughtProductMapper;", "shoppingPromotionItemsProductMapper", "Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingPromotionItemsProductMapper;", "(Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingBannerMapper;Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingCategoriesMapper;Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingCouponMapper;Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingSeasonalsMapper;Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingShopNowMapper;Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingSeasonalProductListMapper;Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingWeeklyProductListMapper;Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingFeaturedBrandsMapper;Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingRecentBoughtProductMapper;Lcom/lotuss/oneapp/data/model/mapper/shoppping/ShoppingPromotionItemsProductMapper;)V", "getBanners", "", "Lcom/lotuss/oneapp/domain/model/shopping/Banner;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeaturedBrands", "Lcom/lotuss/oneapp/domain/model/shopping/FeaturedBrand;", "getProductSeasonals", "Lcom/lotuss/oneapp/domain/model/shopping/ProductSeasonals;", "getProductShopNow", "Lcom/lotuss/oneapp/domain/model/shopping/Product;", "getPromotionItemsProduct", "getRecentBoughtProduct", "getSeasonalProductList", "getShoppingCategories", "Lcom/lotuss/oneapp/domain/model/shopping/Category;", "isAll", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShoppingCoupons", "Lcom/lotuss/oneapp/domain/model/shopping/Coupon;", "getWeeklyProduct", "Lcom/lotuss/oneapp/domain/model/shopping/WeeklyProduct;", "Companion", "data_myPpeDebug"})
public final class ShoppingRepositoryImpl implements com.lotuss.oneapp.domain.repository.ShoppingRepository {
    private final com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingBannerMapper shoppingBannerMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingCategoriesMapper shoppingCategoriesMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingCouponMapper shoppingCouponMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingSeasonalsMapper shoppingSeasonalsMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingShopNowMapper shoppingShopNowMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingSeasonalProductListMapper shoppingSeasonalProductListMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingWeeklyProductListMapper weeklyProductListMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingFeaturedBrandsMapper shoppingFeaturedBrandsMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingRecentBoughtProductMapper shoppingRecentBoughtProductMapper = null;
    private final com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingPromotionItemsProductMapper shoppingPromotionItemsProductMapper = null;
    public static final int MAX_ITEM_CATEGORIES = 8;
    @org.jetbrains.annotations.NotNull
    public static final com.lotuss.oneapp.data.repository.ShoppingRepositoryImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getShoppingCategories(boolean isAll, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.domain.model.shopping.Category>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getProductSeasonals(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.domain.model.shopping.ProductSeasonals>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSeasonalProductList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.shopping.ProductSeasonals> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getProductShopNow(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.domain.model.shopping.Product>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getShoppingCoupons(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.domain.model.shopping.Coupon>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getBanners(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.domain.model.shopping.Banner>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getFeaturedBrands(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.domain.model.shopping.FeaturedBrand>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getWeeklyProduct(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.lotuss.oneapp.domain.model.shopping.WeeklyProduct> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getRecentBoughtProduct(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.domain.model.shopping.Product>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPromotionItemsProduct(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.lotuss.oneapp.domain.model.shopping.Product>> p0) {
        return null;
    }
    
    public ShoppingRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingBannerMapper shoppingBannerMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingCategoriesMapper shoppingCategoriesMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingCouponMapper shoppingCouponMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingSeasonalsMapper shoppingSeasonalsMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingShopNowMapper shoppingShopNowMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingSeasonalProductListMapper shoppingSeasonalProductListMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingWeeklyProductListMapper weeklyProductListMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingFeaturedBrandsMapper shoppingFeaturedBrandsMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingRecentBoughtProductMapper shoppingRecentBoughtProductMapper, @org.jetbrains.annotations.NotNull
    com.lotuss.oneapp.data.model.mapper.shoppping.ShoppingPromotionItemsProductMapper shoppingPromotionItemsProductMapper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/lotuss/oneapp/data/repository/ShoppingRepositoryImpl$Companion;", "", "()V", "MAX_ITEM_CATEGORIES", "", "data_myPpeDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}