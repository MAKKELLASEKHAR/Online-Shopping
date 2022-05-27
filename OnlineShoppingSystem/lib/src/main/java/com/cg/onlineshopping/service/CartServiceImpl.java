package com.cg.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineshopping.dto.CartDto;
import com.cg.onlineshopping.entities.Cart;
import com.cg.onlineshopping.entities.Item;
import com.cg.onlineshopping.repository.CartRepository;
import com.cg.onlineshopping.repository.ItemRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository cartrepo;
	
	@Autowired
	ItemRepository itemrepo;

//	@Override
//	public void updateCart(CartDto cartdto) {
//		Item item = itemrepo.getById(cartdto.getItem_id());
//		Cart cart = new Cart();
//		cart.setTotal(cartdto.getTotal());
//		cart.setItemCount(cartdto.getItemCount());
//		cart.setBuyingPrice(cartdto.getBuyingPrice());
//		cart.setItem(item);
//		cartrepo.save(cart);
//	}

	@Override
	public void addCart(CartDto cartdto) {
		Item item = itemrepo.getById(cartdto.getItem_id());
		Cart cart = new Cart();
		cart.setTotal(cartdto.getTotal());
		cart.setItemCount(cartdto.getItemCount());
		cart.setBuyingPrice(cartdto.getBuyingPrice());
		cart.setItem(item);
		cartrepo.save(cart);
	}

}
