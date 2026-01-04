package com.springTest.SpringCompositeKey.repository;

import com.springTest.SpringCompositeKey.models.Company;
import com.springTest.SpringCompositeKey.models.CompanyProdId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company, CompanyProdId> {
}
