package com.team2.router.dto.loginClient;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
public class CustomerSignUpDTO {

    private String accessToken;
    private String platform;
    private String idToken;
    private String customerEmail;
    private String customerPassword;

}
