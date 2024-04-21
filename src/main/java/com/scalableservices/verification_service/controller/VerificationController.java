package com.scalableservices.verification_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scalableservices.verification_service.service.VerificationService;


@RestController
public class VerificationController {

    @Autowired
    private VerificationService verificationService;

    @GetMapping("vrf/add/credit_score")
    public String addCreditScore(@RequestParam("userId") String userId, @RequestParam("creditScore") String creditScore) {
        return verificationService.addCreditScore(Integer.valueOf(userId), Integer.valueOf(creditScore));
    }

    @GetMapping("/vrf/verify/credit_score")
    public boolean verifyCreditScore(@RequestParam("userId") String userId) {
        return verificationService.verifyCreditScore(Integer.valueOf(userId));
    }
}
