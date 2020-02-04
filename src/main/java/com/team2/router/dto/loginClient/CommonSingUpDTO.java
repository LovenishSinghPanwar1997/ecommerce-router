package com.team2.router.dto.loginClient;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonSingUpDTO {

    private String customerId;
    private String customerEmailId;
    private String customerPassword;
    private String customerName;
    private String profilePicture;
    private String locale;
    private boolean isLoggedIn;

}
