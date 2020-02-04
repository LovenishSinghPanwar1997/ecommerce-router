package com.team2.router.clients;


import com.team2.router.base.BaseResponse;
import com.team2.router.dto.loginClient.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "loginClient" , url = "http://localhost:8082")
public interface LoginClient {

    @PostMapping("/customer/signIn")
    String customerSignIN(@RequestBody CustomerSignUpDTO customerSignUpDTO);

    @PostMapping("/customer/signUp")
    boolean customerSignUp(@RequestBody CommonSingUpDTO commonSingUpDTO);

    @PostMapping("/merchant/signUp")
    BaseResponse<String> merchantSignUp(@RequestBody MerchantSignUpDTO merchantSignUpDTO);

    @PostMapping("/merchant/signIn")
    BaseResponse<String> merchantSingIn(@RequestBody MerchantSignInDTO merchantSignInDTO);

    @PostMapping("customer/getByEmail/{email}")
    CustomerDetailsDTO getByEmailId(@PathVariable("email") String emailId);

    @GetMapping("/customer/getLoginHistory/{customerEmailId}")
    List<LoginHistory> getLoginHistoryByCustomerEmailId(@PathVariable("customerEmailId") String customerEmailId);


}