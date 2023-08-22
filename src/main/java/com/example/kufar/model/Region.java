package com.example.kufar.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * Класс описывает регион
 */

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String RegionName;
}
