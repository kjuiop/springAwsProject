package com.spring.aws.project.dto;

import lombok.Getter;

@Getter
public class HelloResponseDto {

    private String name;
    private int amount;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public HelloResponseDto(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
}
