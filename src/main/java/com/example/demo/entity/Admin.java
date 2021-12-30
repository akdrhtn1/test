package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Admin {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long aId;
    private long aRid;
    private String aLoginId;
    private String aPassword;
    private String aEmail;

}
