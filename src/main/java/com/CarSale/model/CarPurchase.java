package com.CarSale.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "sales")
public class CarPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @NotNull
    @ManyToOne
    @JsonBackReference("costumer_purchase")
    @JoinColumn(name = "client_id")
    private Client client;

    @NotNull
    @OneToOne
    @JoinColumn(name = "car_id")
    @JsonManagedReference("car_purchase")
    private Car car;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private SaleStatus saleStatus;
    

}
