package com.example.kufar.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//https://www.kufar.by/account/settings/
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @OneToMany(mappedBy = "seller", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    List<Product> saleListing;
    @ManyToMany
    List<Product> favorites;
    String phoneNumber;
    String email;
    String name;
    LocalDate dateOfBirth;
    @ManyToOne
    Region location;
}