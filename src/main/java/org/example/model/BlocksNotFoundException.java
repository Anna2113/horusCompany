package org.example.model;

public class BlocksNotFoundException extends RuntimeException{
    public BlocksNotFoundException(String message){
        super(message);
    }
}
