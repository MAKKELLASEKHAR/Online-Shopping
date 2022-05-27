package com.cg.onlineshopping.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineshopping.entities.Item;
import com.cg.onlineshopping.service.ItemServiceImpl;

@RestController
@RequestMapping
public class ItemController {
	
	@Autowired
	ItemServiceImpl service;
	
	@PostMapping
	public ResponseEntity<String> addItem(@RequestBody Item item){
		service.addItem(item);
		return new ResponseEntity<String>("inserted",HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Item>> getAllItems(){
		List<Item> itemlist = service.viewAllItems();
		return new ResponseEntity<List<Item>>(itemlist,HttpStatus.OK);
		
	}
	

}
