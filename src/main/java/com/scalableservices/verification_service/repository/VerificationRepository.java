package com.scalableservices.verification_service.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.scalableservices.verification_service.model.CreditScore;

@Repository
public interface VerificationRepository extends CrudRepository<CreditScore,Integer> {

     @Query("select score from CreditScore where userId=:userId")
    String findByUserId(@Param("userId") int userId);
}
