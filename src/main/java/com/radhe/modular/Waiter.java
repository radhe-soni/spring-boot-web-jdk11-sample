package com.radhe.modular;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Waiter {

	@Autowired
	private FruitEntityRepository fruitrepo;
	
	@PostConstruct
	public void waiter()
	{
		FruitEntity fruit = new FruitEntity("apple", Double.valueOf("300"));
		fruitrepo.save(fruit);
	}
}
