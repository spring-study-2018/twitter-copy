package com.example.demo.dto;

import java.util.List;

public class FeedsDto {
    private List<FeedDto> feedList;
    public FeedsDto(List<FeedDto> feedList){
        this.feedList = feedList;
    }

    public List<FeedDto> getFeedList() {
        return feedList;
    }

    public void setFeedList(List<FeedDto> feedList) {
        this.feedList = feedList;
    }
}
