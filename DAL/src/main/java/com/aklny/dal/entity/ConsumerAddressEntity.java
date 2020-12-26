package com.aklny.dal.entity;
// Generated Jan 7, 2020 3:26:11 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="consumer_address"
)
public class ConsumerAddressEntity  implements java.io.Serializable {


     private Integer id;
     private ConsumerEntity consumer;
     private ZoneEntity zone;
     private String street;
     private String building;
     private String floor;
     private String flat;
     private byte active;
     private String landmark;
     private BigDecimal lat;
     private BigDecimal lng;
     private String label;
     private Set<OrderEntity> orders = new HashSet<OrderEntity>(0);

    public ConsumerAddressEntity() {
    }

	
    public ConsumerAddressEntity(ConsumerEntity consumer, ZoneEntity zone, String street, String building, String floor, String flat, byte active) {
        this.consumer = consumer;
        this.zone = zone;
        this.street = street;
        this.building = building;
        this.floor = floor;
        this.flat = flat;
        this.active = active;
    }
    public ConsumerAddressEntity(ConsumerEntity consumer, ZoneEntity zone, String street, String building, String floor, String flat, byte active, String landmark, BigDecimal lat, BigDecimal lng, String label, Set<OrderEntity> orders) {
       this.consumer = consumer;
       this.zone = zone;
       this.street = street;
       this.building = building;
       this.floor = floor;
       this.flat = flat;
       this.active = active;
       this.landmark = landmark;
       this.lat = lat;
       this.lng = lng;
       this.label = label;
       this.orders = orders;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="consumer_id", nullable=false)
    public ConsumerEntity getConsumer() {
        return this.consumer;
    }
    
    public void setConsumer(ConsumerEntity consumer) {
        this.consumer = consumer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="zone_id", nullable=false)
    public ZoneEntity getZone() {
        return this.zone;
    }
    
    public void setZone(ZoneEntity zone) {
        this.zone = zone;
    }

    
    @Column(name="street", nullable=false, length=100)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="building", nullable=false, length=100)
    public String getBuilding() {
        return this.building;
    }
    
    public void setBuilding(String building) {
        this.building = building;
    }

    
    @Column(name="floor", nullable=false, length=100)
    public String getFloor() {
        return this.floor;
    }
    
    public void setFloor(String floor) {
        this.floor = floor;
    }

    
    @Column(name="flat", nullable=false, length=100)
    public String getFlat() {
        return this.flat;
    }
    
    public void setFlat(String flat) {
        this.flat = flat;
    }

    
    @Column(name="active", nullable=false)
    public byte getActive() {
        return this.active;
    }
    
    public void setActive(byte active) {
        this.active = active;
    }

    
    @Column(name="landmark")
    public String getLandmark() {
        return this.landmark;
    }
    
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    
    @Column(name="lat", precision=10, scale=8)
    public BigDecimal getLat() {
        return this.lat;
    }
    
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    
    @Column(name="lng", precision=11, scale=8)
    public BigDecimal getLng() {
        return this.lng;
    }
    
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    
    @Column(name="label", length=100)
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="consumerAddress")
    public Set<OrderEntity> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<OrderEntity> orders) {
        this.orders = orders;
    }




}


