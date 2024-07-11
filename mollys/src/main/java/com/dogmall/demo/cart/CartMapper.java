package com.dogmall.demo.cart;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CartMapper {
	
	void cart_add(CartVO vo);
	
	List<CartProductVO> cart_list(String mbl_id);
	
	void cart_del(Long cart_code);
	
	void cart_change(@Param("cart_code") Long cart_code, @Param("cart_amount") int cart_amount);
	
	void cart_empty(String mbl_id);

}
