package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Descricao do usuario")
public class User {
	
	private Integer id;
	
	@Size(min=2)
	private String name;
	
	@Past(message="Data de nascimento deve estar no passado")
	@ApiModelProperty(notes="nao pode estar no passado")
	private Date dateBith;
	
	protected User() {
		
	}
	
	public User(int id, String name, Date dateBith) {
		super();
		this.id = id;
		this.name = name;
		this.dateBith = dateBith;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateBith() {
		return dateBith;
	}

	public void setDateBith(Date dateBith) {
		this.dateBith = dateBith;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dateBith=" + dateBith + "]";
	}
	
	

}
