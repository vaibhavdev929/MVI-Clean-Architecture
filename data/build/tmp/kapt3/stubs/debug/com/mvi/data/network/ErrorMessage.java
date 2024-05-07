package com.mvi.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/mvi/data/network/ErrorMessage;", "", "()V", "DEFAULT_MESSAGE", "", "IO_EXCEPTION", "JSON_PARSE_EXCEPTION", "MESSAGE_500", "MESSAGE_501", "MESSAGE_502", "MESSAGE_503", "MESSAGE_504", "MESSAGE_505", "UNEXPECTED_ERROR", "data_debug"})
public final class ErrorMessage {
    @org.jetbrains.annotations.NotNull
    public static final com.mvi.data.network.ErrorMessage INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MESSAGE_500 = "Oops! Something went wrong on our end. Our team has been notified, and we\'re working to fix it as soon as possible.";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MESSAGE_501 = "We\'re sorry, but this feature isn\'t available right now. We\'re working to add it soon!";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MESSAGE_502 = "Uh-oh! It seems there\'s a hiccup connecting to our servers. Please try again in a few moments.";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MESSAGE_503 = "Our servers are currently overloaded or undergoing maintenance. ";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MESSAGE_504 = "It looks like our servers are taking too long to respond. Please check your internet connection and try again.";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MESSAGE_505 = "We\'re sorry, but the version of the website you\'re trying to access isn\'t supported. Please make sure you\'re using the latest version of your browser.";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UNEXPECTED_ERROR = "An unexpected error occurred";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String JSON_PARSE_EXCEPTION = "JSON parsing error";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IO_EXCEPTION = "Couldn\'t reach server. Check your internet connection.";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEFAULT_MESSAGE = "Something went wrong";
    
    private ErrorMessage() {
        super();
    }
}