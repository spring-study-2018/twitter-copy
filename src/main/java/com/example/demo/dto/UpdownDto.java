package com.example.demo.dto;

import javax.validation.constraints.Size;

public class UpdownDto {
    @Size(min = 0)
    private int like;

    @Size(min = 0)
    private int unlike;
}
