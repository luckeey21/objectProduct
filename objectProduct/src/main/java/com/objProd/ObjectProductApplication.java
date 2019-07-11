package com.objProd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.objProd.model.ItemMng;
import com.objProd.repository.ItemMngRepository;

@SpringBootApplication
public class ObjectProductApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Override    
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ObjectProductApplication.class);
    }
	
	@Autowired
	ItemMngRepository  itemMngRepository;
	

	public static void main(String[] args) throws Exception {
        SpringApplication.run(ObjectProductApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		ItemMng item = new ItemMng();
		
		item.setInsDate("20190101");
		item.setInsId("insId");
		item.setInsIp("111.111.111.11");
		item.setItemKey("itmkdy1");
		item.setItemKeyDesc("설명");
		item.setItemkeyNm("아이템키");
		item.setModDate("20190101");
		item.setItemInsYmd("20190101");
		item.setModId("modId");
		
//		itemMngRepository.save(new ItemMng("20190101", "insId", "111.111.111.11","itmkdy1","설명","아이템키","20190101","modId"));
		
		itemMngRepository.save(item);
	}

}
