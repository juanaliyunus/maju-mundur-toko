package com.enigma.majumundur.entity;

import com.enigma.majumundur.constant.TableName;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = TableName.TRANSACTION)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "trans_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date transDate;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "transaction", cascade = CascadeType.PERSIST)
    private List<TransactionDetail> transactionDetails;
}
