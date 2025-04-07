package com.michalszalkowski.demo;

public class TextDto {
    
    private String text;

    public TextDto(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public String toString() {
        return "Data: " + text;
    }
}
