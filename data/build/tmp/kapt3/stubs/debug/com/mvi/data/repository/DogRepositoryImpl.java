package com.mvi.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/mvi/data/repository/DogRepositoryImpl;", "Lcom/mvi/domain/repository/DogRepository;", "dogApi", "Lcom/mvi/data/services/DogService;", "dogDetailsMappers", "Lcom/mvi/data/mappers/DogDetailsMappers;", "dogListMappers", "Lcom/mvi/data/mappers/DogListMappers;", "(Lcom/mvi/data/services/DogService;Lcom/mvi/data/mappers/DogDetailsMappers;Lcom/mvi/data/mappers/DogListMappers;)V", "getDogBreeds", "Lcom/mvi/domain/result/ApiResult;", "Lcom/mvi/domain/model/DogBreed;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDogDetailsByBreedName", "Lcom/mvi/domain/model/DogDetails;", "dogBreedName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class DogRepositoryImpl implements com.mvi.domain.repository.DogRepository {
    private final com.mvi.data.services.DogService dogApi = null;
    private final com.mvi.data.mappers.DogDetailsMappers dogDetailsMappers = null;
    private final com.mvi.data.mappers.DogListMappers dogListMappers = null;
    
    @javax.inject.Inject
    public DogRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.mvi.data.services.DogService dogApi, @org.jetbrains.annotations.NotNull
    com.mvi.data.mappers.DogDetailsMappers dogDetailsMappers, @org.jetbrains.annotations.NotNull
    com.mvi.data.mappers.DogListMappers dogListMappers) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getDogBreeds(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mvi.domain.result.ApiResult<com.mvi.domain.model.DogBreed>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getDogDetailsByBreedName(@org.jetbrains.annotations.NotNull
    java.lang.String dogBreedName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mvi.domain.result.ApiResult<com.mvi.domain.model.DogDetails>> continuation) {
        return null;
    }
}