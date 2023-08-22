package com.example.kufar.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.ZonedDateTime;

/**
 * Класс описывает одно сообщение в диалоге
 * messageAuthor - автор сообщения
 * dateTime - дата время сообщения
 * text - текст сообщения
 * dialogue - к какому диалогу относится сообщение
 */
@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//https://www.kufar.by/account/messaging/2aef34b5-50e3-4775-826b-917e288991ef
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    Account messageAuthor;
    @ManyToOne
    Dialogue dialogue;

    ZonedDateTime dateTime;
    String text;
}
