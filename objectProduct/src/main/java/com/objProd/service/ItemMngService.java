package com.objProd.service;

import java.util.List;

import com.objProd.model.ItemMng;

public interface ItemMngService {

	List<ItemMng> findAll();

	ItemMng findByKey(int objKey);
	
	void deleteByKey(int objKey);
	
	ItemMng save(ItemMng itemMng);
	
//	List<ItemMng> findByKeyBetween(int ObjKey1, int ObjKey2);

	void updateByKey(int objKey,ItemMng itemMng);

}
