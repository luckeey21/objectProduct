package com.objProd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objProd.model.ItemMng;

public interface ItemMngRepository extends JpaRepository<ItemMng, Integer>{
	
}
