package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer carid;
	private String carplatenumber;
	private String serviceticket;
	private String mechanicname;
	private String services;

	
	@OneToOne(mappedBy ="cardetails")
	Customer customer;
	public Integer getCarid() {
		return carid;
	}
	public void setCarid(Integer carid) {
		this.carid = carid;
	}
	public String getCarplatenumber() {
		return carplatenumber;
	}
	public void setCarplatenumber(String carplatenumber) {
		this.carplatenumber = carplatenumber;
	}
	public String getServiceticket() {
		return serviceticket;
	}
	public void setServiceticket(String serviceticket) {
		this.serviceticket = serviceticket;
	}
	public String getMechanicname() {
		return mechanicname;
	}
	public void setMechanicname(String mechanicname) {
		this.mechanicname = mechanicname;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
}
