package com.mobi.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Orders {
    @Id
    private Integer oid;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name ="cid",referencedColumnName = "cid")
    private Customer customer;

}
