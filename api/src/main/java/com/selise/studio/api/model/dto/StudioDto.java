package com.selise.studio.api.model.dto;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.selise.studio.api.model.entity.CurrencyEnum;
import com.selise.studio.api.model.entity.StudioTypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class StudioDto {
    private Long id;
    private String name;
    private StudioTypeEnum type;
    private Long locationId;

    // private String city;
    // private String area;
    // private String address;
    // private double lat;
    // private double lng;

    private Long contactId;

    // private String phoneNo;
    // private String email;

    private String description;
    private BigDecimal pricePerHour;
    private CurrencyEnum currency;
    private BigDecimal rating;

    // private ArrayList<String> amenity;
    // private ArrayList<String> images;

    public StudioDto(Long id, String name, StudioTypeEnum type, Long locationId, Long contactId, 
        String description, BigDecimal pricePerHour, CurrencyEnum currency, BigDecimal rating) {
            
        this.id = id;
        this.name = name;
        this.type = type;
        this.locationId = locationId;
        this.contactId = contactId;
        this.description = description;
        this.pricePerHour = pricePerHour;
        this.currency = currency;
        this.rating = rating;
    }

    public Long getId(){ return id; }
    public String getName(){ return name; }
    public StudioTypeEnum getType(){ return type; }
    public Long getLocationId(){ return locationId; }
    public Long getContactId(){ return contactId; }
    public String getDescription(){ return description; }
    public BigDecimal getPricePerHour(){ return pricePerHour; }
    public CurrencyEnum getCurrency(){ return currency; }
    public BigDecimal getRating(){ return rating; }
}
