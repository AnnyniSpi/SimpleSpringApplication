package dev.annyni.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Single JavaBean domain object that represents Customer.
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity{

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    private String address;

    private BigDecimal budget;
}
