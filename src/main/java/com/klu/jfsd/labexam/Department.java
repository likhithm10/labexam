package com.klu.jfsd.labexam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@Column(name = "did")
	private int id;
	@Column(name="dname", nullable=false,length=45)
	private String name;
	@Column(name="dlocation", nullable=false,length=45,unique=true)
	private String location;
	@Column(name="dhodname",nullable=false,length=45,unique=true)
	private String hodname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHodname() {
		return hodname;
	}
	public void setHodname(String hodname) {
		this.hodname = hodname;
	}
	
	
	

}
