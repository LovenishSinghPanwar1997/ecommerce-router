package com.team2.router.dto.loginClient;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerchantSignInDTO {

    private String merchantEmailId;
    private String merchantPassword;

}
