package com.aklny.dal.entity;
// Generated Jan 7, 2020 3:26:11 AM by Hibernate Tools 4.3.1


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
@Table(name="zone"
)
public class ZoneEntity  implements java.io.Serializable {


     private Integer id;
     private CityEntity city;
     private String nameAr;
     private String nameEn;
     private Set<ConsumerAddressEntity> consumerAddresses = new HashSet<ConsumerAddressEntity>(0);
     private Set<DeliveryZoneEntity> deliveryZones = new HashSet<DeliveryZoneEntity>(0);
     private Set<OrderEntity> orders = new HashSet<OrderEntity>(0);
     private Set<BranchEntity> branches = new HashSet<BranchEntity>(0);

    public ZoneEntity() {
    }

	
    public ZoneEntity(CityEntity city, String nameAr, String nameEn) {
        this.city = city;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }
    public ZoneEntity(CityEntity city, String nameAr, String nameEn, Set<ConsumerAddressEntity> consumerAddresses, Set<DeliveryZoneEntity> deliveryZones, Set<OrderEntity> orders, Set<BranchEntity> branches) {
       this.city = city;
       this.nameAr = nameAr;
       this.nameEn = nameEn;
       this.consumerAddresses = consumerAddresses;
       this.deliveryZones = deliveryZones;
       this.orders = orders;
       this.branches = branches;
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
    @JoinColumn(name="city_id", nullable=false)
    public CityEntity getCity() {
        return this.city;
    }
    
    public void setCity(CityEntity city) {
        this.city = city;
    }

    
    @Column(name="name_ar", nullable=false, length=100)
    public String getNameAr() {
        return this.nameAr;
    }
    
    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    
    @Column(name="name_en", nullable=false, length=100)
    public String getNameEn() {
        return this.nameEn;
    }
    
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="zone")
    public Set<ConsumerAddressEntity> getConsumerAddresses() {
        return this.consumerAddresses;
    }
    
    public void setConsumerAddresses(Set<ConsumerAddressEntity> consumerAddresses) {
        this.consumerAddresses = consumerAddresses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="zone")
    public Set<DeliveryZoneEntity> getDeliveryZones() {
        return this.deliveryZones;
    }
    
    public void setDeliveryZones(Set<DeliveryZoneEntity> deliveryZones) {
        this.deliveryZones = deliveryZones;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="zone")
    public Set<OrderEntity> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<OrderEntity> orders) {
        this.orders = orders;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="zone")
    public Set<BranchEntity> getBranches() {
        return this.branches;
    }
    
    public void setBranches(Set<BranchEntity> branches) {
        this.branches = branches;
    }




}


