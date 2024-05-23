package com.ssafy.petpal.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OauthResponseDto {
    private String accessToken;
    private String refreshToken;
    private long homeId;
}