package com.notify.test_notify_API.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Notif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float value;
    private String title;
    private boolean isComplete;

}
