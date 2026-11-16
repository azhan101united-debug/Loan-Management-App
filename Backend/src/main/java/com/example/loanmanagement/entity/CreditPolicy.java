package com.example.loanmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "credit_policies")
@Data 
public class CreditPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_id")
    private Long policyId;

    @Column(name = "policy_name")
    private String policyName;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "minimum_income")
    private BigDecimal minimumIncome;

    @Column(name = "minimum_credit_score")
    private Integer minimumCreditScore;

    @Column(name = "minimum_age")
    private Integer minimumAge;

    @Column(name = "maximum_age")
    private Integer maximumAge;

    @Column(name = "minimum_interest_rate")
    private BigDecimal minimumInterestRate;

    @Column(name = "maximum_interest_rate")
    private BigDecimal maximumInterestRate;

    @Column(name = "maximum_loan_amount")
    private BigDecimal maximumLoanAmount;

    @Column(name = "maximum_tenure_months")
    private Integer maximumTenureMonths;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "policy")
    private List<Application> applications = new ArrayList<>();

}
