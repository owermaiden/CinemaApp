package com.ower.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Location extends BaseEntity{

    private String name;
    private BigDecimal latitude;
    private BigDecimal langitude;
    private Integer postalCode;
    private String country;
    private String city;
    private String address;

    // Adding @OnetoMany is not a best practice... We have to drop the table with mappedBy.. anyway.. So there is no need...


    public Location(String name, BigDecimal latitude, BigDecimal langitude, Integer postalCode, String country, String city, String address) {
        this.name = name;
        this.latitude = latitude;
        this.langitude = langitude;
        this.postalCode = postalCode;
        this.country = country;
        this.city = city;
        this.address = address;
    }
}
