package com.mvi.data.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/mvi/data/services/DogService;", "", "getAllBreeds", "Lretrofit2/Response;", "Lcom/mvi/data/dto/DogBreedDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDogDetailsByBreedName", "Lcom/mvi/data/dto/DogDetailsDto;", "dogBreedName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface DogService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "breeds/list/all")
    public abstract java.lang.Object getAllBreeds(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mvi.data.dto.DogBreedDto>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "breed/{breed_name}/images/random")
    public abstract java.lang.Object getDogDetailsByBreedName(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "breed_name")
    java.lang.String dogBreedName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mvi.data.dto.DogDetailsDto>> continuation);
}