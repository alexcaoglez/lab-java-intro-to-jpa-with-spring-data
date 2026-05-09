package com.example.airline.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = \"customers\")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    private Integer totalMilesFlown;

    public Customer(String name, CustomerStatus status, Integer totalMilesFlown) {
        this.name = name;
        this.status = status;
        this.totalMilesFlown = totalMilesFlown;
    }
}