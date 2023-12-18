package com.mobi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    private Integer cid;
    private String name;
    private String email;
    private int age;

    @JsonManagedReference
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Orders> ordersList;

    public Customer() {
        this.ordersList = new ArrayList<>();
    }
}
