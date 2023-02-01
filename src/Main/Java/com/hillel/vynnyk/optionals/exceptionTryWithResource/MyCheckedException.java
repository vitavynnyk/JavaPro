package com.hillel.vynnyk.optionals.exceptionTryWithResource;

import java.io.IOException;

public class MyCheckedException extends IOException {
    public MyCheckedException(String message) {
        super(message);
    }
}
