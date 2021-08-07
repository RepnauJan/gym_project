package model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "transaction_id")
    private int transactionId;

    @Column(name = "amount")
    private float amount;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "member_id")
    private int memberId;
}
