package com.aklny.dal.entity;
// Generated Jan 7, 2020 3:26:11 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="branch"
)
public class BranchEntity  implements java.io.Serializable {


     private Integer id;
     private ProviderEntity provider;
     private ZoneEntity zone;
     private String nameAr;
     private String nameEn;
     private BigDecimal lat;
     private BigDecimal lng;
     private Date openAt;
     private Date closeAt;
     private String phone;
     private Set<DeliveryZoneEntity> deliveryZones = new HashSet<DeliveryZoneEntity>(0);
     private Set<ProviderUserEntity> providerUsers = new HashSet<ProviderUserEntity>(0);
     private Set<OrderEntity> orders = new HashSet<OrderEntity>(0);

    public BranchEntity() {
    }

	
    public BranchEntity(ProviderEntity provider, ZoneEntity zone, String nameAr, String nameEn, Date openAt, Date closeAt) {
        this.provider = provider;
        this.zone = zone;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.openAt = openAt;
        this.closeAt = closeAt;
    }
    public BranchEntity(ProviderEntity provider, ZoneEntity zone, String nameAr, String nameEn, BigDecimal lat, BigDecimal lng, Date openAt, Date closeAt, String phone, Set<DeliveryZoneEntity> deliveryZones, Set<ProviderUserEntity> providerUsers, Set<OrderEntity> orders) {
       this.provider = provider;
       this.zone = zone;
       this.nameAr = nameAr;
       this.nameEn = nameEn;
       this.lat = lat;
       this.lng = lng;
       this.openAt = openAt;
       this.closeAt = closeAt;
       this.phone = phone;
       this.deliveryZones = deliveryZones;
       this.providerUsers = providerUsers;
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
    @JoinColumn(name="provider_id", nullable=false)
    public ProviderEntity getProvider() {
        return this.provider;
    }
    
    public void setProvider(ProviderEntity provider) {
        this.provider = provider;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="zone_id", nullable=false)
    public ZoneEntity getZone() {
        return this.zone;
    }
    
    public void setZone(ZoneEntity zone) {
        this.zone = zone;
    }

    
    @Column(name="name_ar", nullable=false)
    public String getNameAr() {
        return this.nameAr;
    }
    
    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    
    @Column(name="name_en", nullable=false)
    public String getNameEn() {
        return this.nameEn;
    }
    
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
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

    @Temporal(TemporalType.TIME)
    @Column(name="open_at", nullable=false, length=8)
    public Date getOpenAt() {
        return this.openAt;
    }
    
    public void setOpenAt(Date openAt) {
        this.openAt = openAt;
    }

    @Temporal(TemporalType.TIME)
    @Column(name="close_at", nullable=false, length=8)
    public Date getCloseAt() {
        return this.closeAt;
    }
    
    public void setCloseAt(Date closeAt) {
        this.closeAt = closeAt;
    }

    
    @Column(name="phone", length=20)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="branch")
    public Set<DeliveryZoneEntity> getDeliveryZones() {
        return this.deliveryZones;
    }
    
    public void setDeliveryZones(Set<DeliveryZoneEntity> deliveryZones) {
        this.deliveryZones = deliveryZones;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="branch")
    public Set<ProviderUserEntity> getProviderUsers() {
        return this.providerUsers;
    }
    
    public void setProviderUsers(Set<ProviderUserEntity> providerUsers) {
        this.providerUsers = providerUsers;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="branch")
    public Set<OrderEntity> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<OrderEntity> orders) {
        this.orders = orders;
    }




}


