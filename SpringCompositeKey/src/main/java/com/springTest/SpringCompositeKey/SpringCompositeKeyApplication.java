package com.springTest.SpringCompositeKey;

import com.springTest.SpringCompositeKey.models.Company;
import com.springTest.SpringCompositeKey.service.CompanyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringCompositeKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringCompositeKeyApplication.class, args);
		CompanyService serv=container.getBean(CompanyService.class);
		serv.addCompany("Boat", "EarBuds", 1900.0);
		serv.addCompany("OnePlus", "Tab", 32000.0);
		Optional<Company> result=serv.getDetails("Boat", "EarBuds");
		if(result.isPresent()) {
			Company comp=result.get();
			System.out.println("Company:"+comp.getCompanyProdId().getCompName());
			System.out.println("Product:"+comp.getCompanyProdId().getProdName());
			System.out.println("Price:"+comp.getPrice());
		}else {
			System.out.println("Record not found!");
		}
	}


}
