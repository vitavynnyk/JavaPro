package com.hillel.vynnyk.optionals.exceptionTryWithResource;

public class Example implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("This Example is closed");
    }
    public void process () throws MyCheckedException{
    }
    public static void main(String[] args) throws Exception {
       try (Example example = new Example()) {
           example.process() ;
       }
    }
}


