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
@Table(name="product")
public class ProductEntity  implements java.io.Serializable {


     private Integer id;
     private CategoryEntity category;
     private String nameAr;
     private String nameEn;
     private float price;
     private byte active;
     private String imagePath;
     private String decriptionAr;
     private String descriptionEn;
     private Set<OrderItemEntity> orderItems = new HashSet<>(0);

    public ProductEntity() {
    }

	
    public ProductEntity(CategoryEntity category, String nameAr, String nameEn, float price, byte active) {
        this.category = category;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.price = price;
        this.active = active;
    }
    public ProductEntity(CategoryEntity category, String nameAr, String nameEn, float price, byte active, String imagePath, String decriptionAr, String descriptionEn, Set<OrderItemEntity> orderItems) {
       this.category = category;
       this.nameAr = nameAr;
       this.nameEn = nameEn;
       this.price = price;
       this.active = active;
       this.imagePath = imagePath;
       this.decriptionAr = decriptionAr;
       this.descriptionEn = descriptionEn;
       this.orderItems = orderItems;
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
    @JoinColumn(name="category_id", nullable=false)
    public CategoryEntity getCategory() {
        return this.category;
    }
    
    public void setCategory(CategoryEntity category) {
        this.category = category;
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

    
    @Column(name="price", nullable=false, precision=12, scale=0)
    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }

    
    @Column(name="active", nullable=false)
    public byte getActive() {
        return this.active;
    }
    
    public void setActive(byte active) {
        this.active = active;
    }

    
    @Column(name="image_path")
    public String getImagePath() {
        return this.imagePath;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    @Column(name="decription_ar", length=65535)
    public String getDecriptionAr() {
        return this.decriptionAr;
    }
    
    public void setDecriptionAr(String decriptionAr) {
        this.decriptionAr = decriptionAr;
    }

    
    @Column(name="description_en", length=65535)
    public String getDescriptionEn() {
        return this.descriptionEn;
    }
    
    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<OrderItemEntity> getOrderItems() {
        return this.orderItems;
    }
    
    public void setOrderItems(Set<OrderItemEntity> orderItems) {
        this.orderItems = orderItems;
    }




}


