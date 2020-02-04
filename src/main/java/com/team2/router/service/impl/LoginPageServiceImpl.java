package com.team2.router.service.impl;

import com.team2.router.base.BaseResponse;
import com.team2.router.clients.LoginClient;
import com.team2.router.dto.loginClient.*;
import com.team2.router.service.LoginPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginPageServiceImpl implements LoginPageService {


    @Autowired
    LoginClient loginClient;

    @Override
    public String customerSignIn(CustomerSignUpDTO customerSignUpDTO) {

        return loginClient.customerSignIN(customerSignUpDTO);

    }

    @Override
    public boolean customerSignUp(CommonSingUpDTO commonSingUpDTO) {
        return loginClient.customerSignUp(commonSingUpDTO);
    }

    @Override
    public String merchantSignUp(MerchantSignUpDTO merchantSignUpDTO) {
        BaseResponse<String> baseResponse = loginClient.merchantSignUp(merchantSignUpDTO);

        return baseResponse.getData();
    }

    @Override
    public String merchantSingIn(MerchantSignInDTO merchantSignInDTO) {
        BaseResponse<String> baseResponse = loginClient.merchantSingIn(merchantSignInDTO);
        return baseResponse.getData();
    }

    @Override
    public CustomerDetailsDTO getByEmailId(String emailId) {
       return loginClient.getByEmailId(emailId);
    }

    @Override
    public BaseResponse<List<LoginHistory>> getLoginHistoryOfCustomer(String customerEmailId) {
        return new BaseResponse<>(loginClient.getLoginHistoryByCustomerEmailId(customerEmailId));
    }
}
