package com.sonda.teste.aeronautic.dto;

import jakarta.validation.constraints.NotNull;

public class AircraftEditDTO {
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
}
