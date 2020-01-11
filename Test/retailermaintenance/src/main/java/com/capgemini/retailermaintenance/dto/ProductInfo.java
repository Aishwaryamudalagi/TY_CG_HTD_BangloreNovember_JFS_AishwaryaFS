package com.capgemini.retailermaintenance.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="productinfo")
public class ProductInfo {
	@Column
	@Id
	@GeneratedValue
	private int id;
	@Column
	private int user_id;
	@Column(unique=true,nullable=false)
	private String name;
	@Column
	private int quentity;
	@Column
	private String details;

}
