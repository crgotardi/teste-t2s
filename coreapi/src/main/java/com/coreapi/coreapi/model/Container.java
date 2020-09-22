package com.coreapi.coreapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="containers")
public class Container {

    @Id
    private long id;
    private String client;
    private String contract;
    private String type;
    private Boolean containerIsFull;
    private String category;

    public Container(){

    }

    public Container(String client, String contract, String type, Boolean containerIsFull, String category) {
		this.client = client;
		this.contract = contract;
        this.type = type;
        this.containerIsFull = containerIsFull;
        this.category = category;
	}

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getContainerIsFull() {
        return containerIsFull;
    }
    
    public void setContainerIsFull(Boolean containerIsFull) {
        this.containerIsFull = containerIsFull;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}