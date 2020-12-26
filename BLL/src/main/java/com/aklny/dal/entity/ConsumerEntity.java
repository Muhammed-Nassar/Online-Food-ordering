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
@Table(name="consumer"
    , uniqueConstraints = {@UniqueConstraint(columnNames="email"), @UniqueConstraint(columnNames="phone")} 
)
public class ConsumerEntity  implements java.io.Serializable {


     private Integer id;
     private String fullname;
     private String email;
     private String password;
     private String phone;
     private String gender;
     private Set<ConsumerAddressEntity> consumerAddresses = new HashSet<ConsumerAddressEntity>(0);
     private Set<OrderEntity> orders = new HashSet<OrderEntity>(0);

    public ConsumerEntity() {
    }

	
    public ConsumerEntity(String fullname, String email, String password, String phone) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }
    public ConsumerEntity(String fullname, String email, String password, String phone, String gender, Set<ConsumerAddressEntity> consumerAddresses, Set<OrderEntity> orders) {
       this.fullname = fullname;
       this.email = email;
       this.password = password;
       this.phone = phone;
       this.gender = gender;
       this.consumerAddresses = consumerAddresses;
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

    
    @Column(name="fullname", nullable=false)
    public String getFullname() {
        return this.fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    
    @Column(name="email", unique=true, nullable=false, length=100)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="phone", unique=true, nullable=false, length=20)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="gender", length=20)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="consumer")
    public Set<ConsumerAddressEntity> getConsumerAddresses() {
        return this.consumerAddresses;
    }
    
    public void setConsumerAddresses(Set<ConsumerAddressEntity> consumerAddresses) {
        this.consumerAddresses = consumerAddresses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="consumer")
    public Set<OrderEntity> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<OrderEntity> orders) {
        this.orders = orders;
    }




}


