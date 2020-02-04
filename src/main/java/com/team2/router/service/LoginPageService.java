package com.team2.router.service;

import com.team2.router.base.BaseResponse;
import com.team2.router.dto.loginClient.*;

import java.util.List;

public interface LoginPageService {

    String customerSignIn(CustomerSignUpDTO customerSignUpDTO);
    boolean customerSignUp(CommonSingUpDTO commonSingUpDTO);
    String merchantSignUp(MerchantSignUpDTO merchantSignUpDTO);
    String merchantSingIn(MerchantSignInDTO merchantSignInDTO);

    CustomerDetailsDTO getByEmailId(String emailId);


    BaseResponse<List<LoginHistory>> getLoginHistoryOfCustomer(String customerEmailId);
}
