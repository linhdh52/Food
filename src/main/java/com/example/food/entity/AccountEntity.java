package com.example.food.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "number")
    private Long number;

    @Column(name = "sex")
    private boolean sex;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "time_create_user")
    private String timeCreateUser;

    @Column(name = "address")
    private String address;

    @Column(name = "accumulate_points")
    private Long accumulatePoints;

    @Column(name = "level")
    private Long level;

    @Column(name = "purchase_history")
    private Date purchaseHistory;
}
