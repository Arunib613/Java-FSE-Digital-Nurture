package com.cognizant.countryservice.repository;

import com.cognizant.countryservice.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
    Country findByCode(String code);

    List<Country> findByNameContainingIgnoreCase(String name);

    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String name);

    List<Country> findByNameStartingWithIgnoreCase(String alphabet);

}