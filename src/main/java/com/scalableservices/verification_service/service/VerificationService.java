package com.scalableservices.verification_service.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalableservices.verification_service.model.CreditScore;
import com.scalableservices.verification_service.repository.VerificationRepository;

@Service
public class VerificationService {

    @Autowired
    private VerificationRepository verificationRepository;

    public String addCreditScore(int userId, int score) {
        CreditScore creditScore = new CreditScore();
        Random rand = new Random();
        creditScore.setId(rand.nextInt(3000));
        creditScore.setUserId(userId);
        creditScore.setScore(score);
        verificationRepository.save(creditScore);
        return "Credit score added successfully";
    }

    public boolean verifyCreditScore(int userId) {
        String scoreStr = verificationRepository.findByUserId(userId);
        if (scoreStr == null) {
            return false;
        }
        int score = Integer.valueOf(scoreStr);
        if (score < 1000) {
            return false;
        }
        return true;
    }
    
}
