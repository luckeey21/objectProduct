package com.objProd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.objProd.exception.ResourceNotFoundException;
import com.objProd.model.ItemMng;
import com.objProd.repository.ItemMngRepository;

@Service
public class ItemMngServiceImpl implements ItemMngService{
	
	@Autowired
	private ItemMngRepository itemMngRepository;
	
	@Override
	public List<ItemMng> findAll() {
		List<ItemMng> itemMngs = new ArrayList<>();
		itemMngRepository.findAll().forEach(e -> itemMngs.add(e));
		
		return itemMngs;
		
	}

	@Override
	public ItemMng findByKey(int objKey) {
		ItemMng itemMng = itemMngRepository.findById(objKey).orElseThrow(() -> new ResourceNotFoundException("TB_OBJ_ITEM", "objKey", objKey));		
		
		return itemMng;
		
	}

	@Override
	public void deleteByKey(int objKey) {
		itemMngRepository.deleteById(objKey);
	}

	@Override
	public ItemMng save(ItemMng itemMng) {
		itemMngRepository.save(itemMng);
		return itemMng;
	}

	/*
	@Override
	public List<ItemMng> findByKeyBetween(int objKey1,int objKey2) {
		List<ItemMng> itemMng = itemMngRepository.findByKeyBetween(objKey1, objKey2);
		System.out.println(itemMng.size() + ">>>>>>>>>>>>>>>>" + objKey1 + objKey);
		if (itemMng.size() > 0)
			return itemMng;
		else
			return null;
	}
	*/

	@Override
	public void updateByKey(int objKey, ItemMng itemMng) {
		ItemMng ietm = itemMngRepository.findById(objKey).orElseThrow(() -> new ResourceNotFoundException("TB_OBJ_ITEM", "objKey", objKey));

		itemMngRepository.save(itemMng);
	}
}
