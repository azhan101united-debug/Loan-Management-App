package com.example.loanmanagement.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "credit_policies")
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


    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }


    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }


    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }


    public BigDecimal getMinimumIncome() {
        return minimumIncome;
    }

    public void setMinimumIncome(BigDecimal minimumIncome) {
        this.minimumIncome = minimumIncome;
    }


    public Integer getMinimumCreditScore() {
        return minimumCreditScore;
    }

    public void setMinimumCreditScore(Integer minimumCreditScore) {
        this.minimumCreditScore = minimumCreditScore;
    }


    public Integer getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(Integer minimumAge) {
        this.minimumAge = minimumAge;
    }


    public Integer getMaximumAge() {
        return maximumAge;
    }

    public void setMaximumAge(Integer maximumAge) {
        this.maximumAge = maximumAge;
    }


    public BigDecimal getMinimumInterestRate() {
        return minimumInterestRate;
    }

    public void setMinimumInterestRate(BigDecimal minimumInterestRate) {
        this.minimumInterestRate = minimumInterestRate;
    }


    public BigDecimal getMaximumInterestRate() {
        return maximumInterestRate;
    }

    public void setMaximumInterestRate(BigDecimal maximumInterestRate) {
        this.maximumInterestRate = maximumInterestRate;
    }


    public BigDecimal getMaximumLoanAmount() {
        return maximumLoanAmount;
    }

    public void setMaximumLoanAmount(BigDecimal maximumLoanAmount) {
        this.maximumLoanAmount = maximumLoanAmount;
    }


    public Integer getMaximumTenureMonths() {
        return maximumTenureMonths;
    }

    public void setMaximumTenureMonths(Integer maximumTenureMonths) {
        this.maximumTenureMonths = maximumTenureMonths;
    }


    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

}
