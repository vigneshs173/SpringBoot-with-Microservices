package com.mobi.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    private Integer pid;
    private String pname;
    private int price;
    private String color;
}
