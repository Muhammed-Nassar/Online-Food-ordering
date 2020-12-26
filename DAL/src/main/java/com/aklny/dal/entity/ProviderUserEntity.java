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
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="provider_user"
    , uniqueConstraints = @UniqueConstraint(columnNames="username") 
)
public class ProviderUserEntity  implements java.io.Serializable {


     private Integer id;
     private BranchEntity branch;
     private ProviderEntity provider;
     private String username;
     private String password;
     private byte active;

    public ProviderUserEntity() {
    }

	
    public ProviderUserEntity(ProviderEntity provider, String username, String password, byte active) {
        this.provider = provider;
        this.username = username;
        this.password = password;
        this.active = active;
    }
    public ProviderUserEntity(BranchEntity branch, ProviderEntity provider, String username, String password, byte active) {
       this.branch = branch;
       this.provider = provider;
       this.username = username;
       this.password = password;
       this.active = active;
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
    @JoinColumn(name="branch_id")
    public BranchEntity getBranch() {
        return this.branch;
    }
    
    public void setBranch(BranchEntity branch) {
        this.branch = branch;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="provider_id", nullable=false)
    public ProviderEntity getProvider() {
        return this.provider;
    }
    
    public void setProvider(ProviderEntity provider) {
        this.provider = provider;
    }

    
    @Column(name="username", unique=true, nullable=false, length=100)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="active", nullable=false)
    public byte getActive() {
        return this.active;
    }
    
    public void setActive(byte active) {
        this.active = active;
    }




}


