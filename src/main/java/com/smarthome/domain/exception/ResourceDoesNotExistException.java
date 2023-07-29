package com.smarthome.domain.exception;

public class ResourceDoesNotExistException extends RuntimeException{
    public ResourceDoesNotExistException(String message)
    {
        super(message);
    }
    public ResourceDoesNotExistException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
}
