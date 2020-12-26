package com.aklny.dal.entity;
// Generated Jan 7, 2020 3:26:11 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="delivery_zone"
)
public class DeliveryZoneEntity  implements java.io.Serializable {


     private Integer id;
     private BranchEntity branch;
     private ZoneEntity zone;
     private float deliveryFees;
     private int deliverInMinutes;

    public DeliveryZoneEntity() {
    }

    public DeliveryZoneEntity(BranchEntity branch, ZoneEntity zone, float deliveryFees, int deliverInMinutes) {
       this.branch = branch;
       this.zone = zone;
       this.deliveryFees = deliveryFees;
       this.deliverInMinutes = deliverInMinutes;
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
    @JoinColumn(name="branch_id", nullable=false)
    public BranchEntity getBranch() {
        return this.branch;
    }
    
    public void setBranch(BranchEntity branch) {
        this.branch = branch;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="zone_id", nullable=false)
    public ZoneEntity getZone() {
        return this.zone;
    }
    
    public void setZone(ZoneEntity zone) {
        this.zone = zone;
    }

    
    @Column(name="delivery_fees", nullable=false, precision=12, scale=0)
    public float getDeliveryFees() {
        return this.deliveryFees;
    }
    
    public void setDeliveryFees(float deliveryFees) {
        this.deliveryFees = deliveryFees;
    }

    
    @Column(name="deliver_in_minutes", nullable=false)
    public int getDeliverInMinutes() {
        return this.deliverInMinutes;
    }
    
    public void setDeliverInMinutes(int deliverInMinutes) {
        this.deliverInMinutes = deliverInMinutes;
    }




}


