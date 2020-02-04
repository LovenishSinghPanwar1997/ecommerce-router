package com.team2.router.dto.loginClient;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDetailsDTO {

    private String customerId;
    private String customerEmailId;
    private String customerPassword;
    private String customerName;
    private String profilePicture;
    private String locale;
    private boolean isLoggedIn;

}
