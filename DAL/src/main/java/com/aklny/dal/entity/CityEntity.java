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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="city"
    , uniqueConstraints = {@UniqueConstraint(columnNames="name_ar"), @UniqueConstraint(columnNames="name_en")} 
)
public class CityEntity  implements java.io.Serializable {


     private Integer id;
     private String nameAr;
     private String nameEn;
     private Set<ZoneEntity> zones = new HashSet<ZoneEntity>(0);

    public CityEntity() {
    }

	
    public CityEntity(String nameAr, String nameEn) {
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }
    public CityEntity(String nameAr, String nameEn, Set<ZoneEntity> zones) {
       this.nameAr = nameAr;
       this.nameEn = nameEn;
       this.zones = zones;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name_ar", unique=true, nullable=false, length=100)
    public String getNameAr() {
        return this.nameAr;
    }
    
    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    
    @Column(name="name_en", unique=true, nullable=false, length=100)
    public String getNameEn() {
        return this.nameEn;
    }
    
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="city")
    public Set<ZoneEntity> getZones() {
        return this.zones;
    }
    
    public void setZones(Set<ZoneEntity> zones) {
        this.zones = zones;
    }




}


