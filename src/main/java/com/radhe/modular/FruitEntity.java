package com.radhe.modular;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class FruitEntity {

	@Field
	private String name;
	@Field
	private Double price;
	public FruitEntity(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
}
