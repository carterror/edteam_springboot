package com.edteam.exception;

public class MySpringException extends RuntimeException {
    private String description;

    public MySpringException(String message) {
        super(message);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}