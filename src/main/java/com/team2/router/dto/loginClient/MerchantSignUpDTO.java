package com.team2.router.dto.loginClient;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MerchantSignUpDTO {

    private String merchantId;
    private String merchantEmailId;
    private String merchantPassword;
    private String merchantName;
    private String merchantProfilePicture;
    private String locale;
    private boolean isLoggedIn;

}
