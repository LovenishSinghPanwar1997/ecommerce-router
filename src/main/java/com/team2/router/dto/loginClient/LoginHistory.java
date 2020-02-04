package com.team2.router.dto.loginClient;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginHistory {


    private String id;
    private String customerEmailId;
    private String timeStamp;

}
