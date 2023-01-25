package com.project.BorrowingsService.service.Dto;

public class CustomMessage extends BorrowingDto{
    private String message;

    public CustomMessage(String m){
        this.message = m;
    }

    public String getMessage() {
        return message;
    }
}
