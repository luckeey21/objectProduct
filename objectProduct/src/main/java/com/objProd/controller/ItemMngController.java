package com.objProd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.objProd.model.ItemMng;
import com.objProd.service.ItemMngService;

@RestController
@RequestMapping("objProd")
public class ItemMngController {

	@Autowired
	private ItemMngService itemMngService;

	// 모든 사원 조회
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<ItemMng>> getAllItems() {
		List<ItemMng> itemMngs = itemMngService.findAll();
		return new ResponseEntity<List<ItemMng>>(itemMngs, HttpStatus.OK);
	}

	// empno로 한명의 사원 조회
	@GetMapping(value = "/{objKey}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ItemMng> getObjKey(@PathVariable("objKey") int objKey) {
		return new ResponseEntity<ItemMng>(itemMngService.findByKey(objKey), HttpStatus.OK);
	}

	// empno로 사원 삭제
	@DeleteMapping(value = "/{objKey}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> deleteEmp(@PathVariable("objKey") int objKey) {
		itemMngService.deleteByKey(objKey);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	// empno로 사원 수정(empno로 사원 찾아 인자로 넘어오는 을 Emp 객체의 ename, sal로 수정함)
	@PutMapping(value = "/{ogjKey}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ItemMng> updateEmp(@PathVariable("ogjKey") int ogjKey, @RequestBody ItemMng itemMng) {
		itemMngService.updateByKey(ogjKey, itemMng);
		return new ResponseEntity<ItemMng>(itemMng, HttpStatus.OK);
	}

	// 사원 입력
	@PostMapping
	public ResponseEntity<ItemMng> save(@RequestBody ItemMng itemMng) {
		return new ResponseEntity<ItemMng>(itemMngService.save(itemMng), HttpStatus.OK);
	}

	// 급여를 기준으로 사원 검색 (sal > sal1 and sal < sal2)
	/*
	@GetMapping(value = "/{sal1}/{sal2}")
	public ResponseEntity<List<ItemMng>> getEmpByKeyBetween(@PathVariable int sal1, @PathVariable int sal2) {
		List<ItemMng> itemMngs = itemMngService.findByKeyBetween(sal1, sal2);
		return new ResponseEntity<List<ItemMng>>(itemMngs, HttpStatus.OK);
	}
	*/
	
}
