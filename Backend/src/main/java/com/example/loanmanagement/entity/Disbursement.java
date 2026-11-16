package com.example.loanmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "disbursements")
@Data 
public class Disbursement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disbursement_id")
    private Long disbursementId;

    @Column(name = "disbursement_amount")
    private BigDecimal disbursementAmount;

    @Column(name = "disbursement_date")
    private LocalDate disbursementDate;

    @Column(name = "transaction_reference", unique = true)
    private String transactionReference;

    @Column(name = "disbursement_status")
    private String disbursementStatus;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "loan_id")
    private Loan loan;


}
