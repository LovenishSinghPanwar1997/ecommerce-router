package com.team2.router.controller;


import com.team2.router.base.BaseResponse;
import com.team2.router.dto.loginClient.*;
import com.team2.router.service.LoginPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseCookie;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = {"*"})
public class LogInPageController {

    @Autowired
    LoginPageService loginPageService;

    @PostMapping("/customer/signin")
    public BaseResponse<String> customerSignIn(@RequestBody CustomerSignUpDTO customerSignUpDTO, HttpServletResponse response) {
        BaseResponse<String> baseResponse = new BaseResponse<>();

        baseResponse.setData(loginPageService.customerSignIn(customerSignUpDTO));
        ResponseCookie responseCookie = ResponseCookie.from("userToken", baseResponse.getData())
                .httpOnly(false)
                .secure(false)
                .sameSite("None")
                .path("/")
                .build();
        response.addHeader("set-cookie", responseCookie.toString());
        return baseResponse;
    }

    @PostMapping("/customer/signup")
    public BaseResponse<Boolean> customerSignUp(@RequestBody CommonSingUpDTO commonSingUpDTO) {
        return new BaseResponse<>(loginPageService.customerSignUp(commonSingUpDTO));
    }

    @PostMapping("/merchant/signup")
    public BaseResponse<String> merchantSignUp(@RequestBody MerchantSignUpDTO merchantSignUpDTO) {
        BaseResponse<String> baseResponse = new BaseResponse<>();
        baseResponse.setData(loginPageService.merchantSignUp(merchantSignUpDTO));
        return baseResponse;
    }

    @PostMapping("/merchant/signin")
    public BaseResponse<String> merchantSingIn(@RequestBody MerchantSignInDTO merchantSignInDTO,HttpServletResponse response) {
        BaseResponse<String> baseResponse = new BaseResponse<>();
        baseResponse.setData(loginPageService.merchantSingIn(merchantSignInDTO));

        ResponseCookie responseCookie = ResponseCookie.from("merchantToken", baseResponse.getData())
                .httpOnly(false)
                .secure(false)
                .sameSite("None")
                .path("/")
                .build();
        response.addHeader("set-cookie", responseCookie.toString());

        return baseResponse;
    }

    @GetMapping("/customer/details/{email}")
    public BaseResponse<CustomerDetailsDTO> getByEmailId(@PathVariable("email") String emailId)
    {
        return new BaseResponse<>(loginPageService.getByEmailId(emailId));
    }

    @GetMapping("/customer/loginHistory/{customerEmailId}")
    public BaseResponse<List<LoginHistory>> getLoginHistoryOfCustomer(@PathVariable("customerEmailId") String customerEmailId)
    {
        return loginPageService.getLoginHistoryOfCustomer(customerEmailId);
    }
}
