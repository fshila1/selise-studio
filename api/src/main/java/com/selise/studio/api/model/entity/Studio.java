package com.selise.studio.api.model.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studio")
public class Studio {
    @Id
    @Column(name = "studio_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private StudioTypeEnum type = StudioTypeEnum.photography;

    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "contact_id")
    private Long contactId;

    private String description;

    @Column(precision = 7, scale = 2, name = "price_per_hour")
    private BigDecimal pricePerHour;

    @Enumerated(EnumType.STRING)
    private CurrencyEnum currency;

    @Column(precision = 2, scale = 1)
    private BigDecimal rating;

    public Studio() {}

    public Studio(String name, StudioTypeEnum type, Long locationId, long contactId, String description, 
        BigDecimal pricePerHour, CurrencyEnum currency, BigDecimal rating) {
        
        this.name = name;
        this.type = type != null ? type : StudioTypeEnum.photography;
        this.locationId = locationId;
        this.contactId = contactId;
        this.description = description;
        this.pricePerHour = pricePerHour;
        this.currency = currency;
        this.rating = rating;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public StudioTypeEnum getType() { return type; }
    public Long getLocationId() { return locationId; }
    public Long getContactId() { return contactId; }
    public String getDescription() { return description; }
    public BigDecimal getPricePerHour() { return pricePerHour; }
    public CurrencyEnum getCurrency() { return currency; }
    public BigDecimal getRating() { return rating; }
}
