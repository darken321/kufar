package com.example.kufar.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/** Описывает диалог
 *  product - по какому продукту идет диалог
 *  buyer - какой покупатель ведет диалог с продавцом
 *  */
@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//https://www.kufar.by/account/messaging/2aef34b5-50e3-4775-826b-917e288991ef
public class Dialogue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    Product product;
    @ManyToOne
    Account buyer;
}
