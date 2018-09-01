package com.example.demo.web;

import com.example.demo.dto.FeedDto;
import com.example.demo.dto.FeedsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/feeds")
@RestController
public class FeedController {

    @GetMapping("")
    public FeedsDto GetFeedsController(){
        FeedDto feed = new FeedDto("jeff", "hello world!");
        List<FeedDto> list = new ArrayList<>();
        list.add(feed);
        return new FeedsDto(list);
    }
}
