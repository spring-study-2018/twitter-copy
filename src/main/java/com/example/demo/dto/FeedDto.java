package com.example.demo.dto;


//MEMO : should have getter, setter in DTO
public class FeedDto {
    private String author;
    private String content;
    //private UpdownDto updown;

    public FeedDto(){
    }

    public FeedDto(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
