package com.springTest.SpringCompositeKey.service;

import com.springTest.SpringCompositeKey.models.Company;
import com.springTest.SpringCompositeKey.models.CompanyProdId;
import com.springTest.SpringCompositeKey.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    CompanyRepo repo;

    @Autowired
    public CompanyService(CompanyRepo companyRepo){
        this.repo = companyRepo;
    }

    public void addCompany(String compName,String prodName,Double price) {
        CompanyProdId comPr=new CompanyProdId(compName,prodName);
        Company company=new Company(comPr, price);
        repo.save(company);
    }
    public Optional<Company> getDetails(String compName, String prodName) {
        CompanyProdId comPr=new CompanyProdId(compName,prodName);
        return repo.findById(comPr);
    }

}
