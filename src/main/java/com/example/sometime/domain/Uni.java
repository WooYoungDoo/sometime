package com.example.sometime.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;


public class Uni {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uni_id")
    private Long id;
    private String name;


    private List<User> userList;

    private List<Category> categoryList;
}
