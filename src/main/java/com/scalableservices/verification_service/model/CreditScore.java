package com.scalableservices.verification_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="credit_score")
@Data
public class CreditScore {

    @Id
	@Column(name="id")
    private int id;

    @Column(name="user_id")
    private int userId;

    @Column(name="score")
    private int score;
}
