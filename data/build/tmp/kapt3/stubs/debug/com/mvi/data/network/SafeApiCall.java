package com.mvi.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jc\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0005*\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00050\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/mvi/data/network/SafeApiCall;", "", "()V", "call", "Lcom/mvi/domain/result/ApiResult;", "R", "T", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "mapper", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class SafeApiCall {
    @org.jetbrains.annotations.NotNull
    public static final com.mvi.data.network.SafeApiCall INSTANCE = null;
    
    private SafeApiCall() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final <T extends java.lang.Object, R extends java.lang.Object>java.lang.Object call(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, ? extends R> mapper, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mvi.domain.result.ApiResult<? extends R>> continuation) {
        return null;
    }
}