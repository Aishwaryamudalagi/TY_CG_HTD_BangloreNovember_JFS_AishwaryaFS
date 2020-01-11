package com.capgemini.retailermaintenance.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="orderinfo")
public class OrderInfo {
	@Column
	@Id
	@GeneratedValue
	private int id;
	@Column
	private int product_id;
	@Column
	private int user_id;

}
