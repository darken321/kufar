package com.example.kufar.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
/**
 * Класс описывает город
 */

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String cityName;
    @ManyToOne
    Region region;
}
