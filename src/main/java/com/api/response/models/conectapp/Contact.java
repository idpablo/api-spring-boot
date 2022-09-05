package com.api.response.models.conectapp;

import javax.validation.constraints.NotBlank;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contact")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Getter
@Setter
public class Contact implements Serializable {

    private static final long serialVersionUID = 4048798961366546485L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private String phone;
    private String email;
    private String address1;
    private String address2;
    private String address3;
    private String postalCode;

    @Column(length = 4000)
    private String note;

    public void setName(String name) {
    }

    public void setPhone(String s) {
    }

    public void setEmail(String email){

    }

    public Long getId() {
        return id;
    }

    public Object getName() {
        return name;
    }

    public String getEmail() {
        return null;
    }
}