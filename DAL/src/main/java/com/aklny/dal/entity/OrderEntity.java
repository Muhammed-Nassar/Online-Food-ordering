package com.aklny.dal.entity;
// Generated Jan 7, 2020 3:26:11 AM by Hibernate Tools 4.3.1


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
@Table(name="order"
    
)
public class OrderEntity  implements java.io.Serializable {


     private Integer id;
     private BranchEntity branch;
     private ConsumerEntity consumer;
     private ConsumerAddressEntity consumerAddress;
     private ZoneEntity zone;
     private Date orderAt;
     private float deliveryFees;
     private String status;
     private Set<OrderItemEntity> orderItems = new HashSet<OrderItemEntity>(0);

    public OrderEntity() {
    }

	
    public OrderEntity(BranchEntity branch, ConsumerEntity consumer, ZoneEntity zone, Date orderAt, float deliveryFees, String status) {
        this.branch = branch;
        this.consumer = consumer;
        this.zone = zone;
        this.orderAt = orderAt;
        this.deliveryFees = deliveryFees;
        this.status = status;
    }
    public OrderEntity(BranchEntity branch, ConsumerEntity consumer, ConsumerAddressEntity consumerAddress, ZoneEntity zone, Date orderAt, float deliveryFees, String status, Set<OrderItemEntity> orderItems) {
       this.branch = branch;
       this.consumer = consumer;
       this.consumerAddress = consumerAddress;
       this.zone = zone;
       this.orderAt = orderAt;
       this.deliveryFees = deliveryFees;
       this.status = status;
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
    @JoinColumn(name="branch_id", nullable=false)
    public BranchEntity getBranch() {
        return this.branch;
    }
    
    public void setBranch(BranchEntity branch) {
        this.branch = branch;
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
    @JoinColumn(name="consumer_address_id")
    public ConsumerAddressEntity getConsumerAddress() {
        return this.consumerAddress;
    }
    
    public void setConsumerAddress(ConsumerAddressEntity consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="zone_id", nullable=false)
    public ZoneEntity getZone() {
        return this.zone;
    }
    
    public void setZone(ZoneEntity zone) {
        this.zone = zone;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="order_at", nullable=false, length=19)
    public Date getOrderAt() {
        return this.orderAt;
    }
    
    public void setOrderAt(Date orderAt) {
        this.orderAt = orderAt;
    }

    
    @Column(name="delivery_fees", nullable=false, precision=12, scale=0)
    public float getDeliveryFees() {
        return this.deliveryFees;
    }
    
    public void setDeliveryFees(float deliveryFees) {
        this.deliveryFees = deliveryFees;
    }

    
    @Column(name="status", nullable=false, length=50)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="order")
    public Set<OrderItemEntity> getOrderItems() {
        return this.orderItems;
    }
    
    public void setOrderItems(Set<OrderItemEntity> orderItems) {
        this.orderItems = orderItems;
    }




}


