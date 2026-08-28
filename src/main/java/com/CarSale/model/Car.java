package com.CarSale.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "type")
    private CarType type;

    @NotBlank
    @Column(name = "brand")
    private String brand;

    @NotBlank
    @Column(name = "year")
    private Integer year;

    @NotBlank
    @Column(name = "color")
    private String color;

    @NotBlank
    @Column(name = "price")
    private Double price;

    @Column(name = "sold")
    private boolean sold;

}
