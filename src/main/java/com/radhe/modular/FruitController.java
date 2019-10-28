package com.radhe.modular;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {
	@Autowired
	private FruitEntityRepository fruitrepo;
	@GetMapping("/fruits")
	public List<FruitEntity> getFruits()
	{
		return fruitrepo.findAll();
	}
	
}
