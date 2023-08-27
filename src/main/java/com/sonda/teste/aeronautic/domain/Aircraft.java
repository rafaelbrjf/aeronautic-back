package com.sonda.teste.aeronautic.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;


@Entity
@Table(name = "aircraft")
@SequenceGenerator(name = "aircraft_id_seq", allocationSize = 1)
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aircraft_id_seq")
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String brand;
    @NotNull
    private Integer year;
    @NotNull
    private String description;
    @NotNull
    private Boolean sold;
    private Instant created = Instant.now();
    private Instant updated = Instant.now();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public Instant getUpdated() {
        return updated;
    }

    public void setUpdated(Instant updated) {
        this.updated = updated;
    }
}
