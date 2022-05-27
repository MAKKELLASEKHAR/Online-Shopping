package com.cg.onlineshopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineshopping.dto.CartDto;
import com.cg.onlineshopping.entities.Cart;
import com.cg.onlineshopping.service.CartServiceImpl;

@RestController
@RequestMapping
public class CartController {
	
	@Autowired
	CartServiceImpl service;
	
	@PostMapping("/id/{cart_id}")
	public ResponseEntity<String> addCart(@RequestBody CartDto cartdto){
		service.addCart(cartdto);
		return new ResponseEntity<String>("inserted",HttpStatus.OK);
		
	}
	
//	@PutMapping
//	public ResponseEntity<String> editCart(@RequestBody CartDto cartdto){
//		service.updateCart(cartdto);
//		return new ResponseEntity<String>("updated",HttpStatus.OK);
//	}
	

}
