package com.example.lyclebackend.Member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PutMyPageDto {
    private String nickname;
    private String profileImg;
}