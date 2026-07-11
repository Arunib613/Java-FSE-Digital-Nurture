package com.cognizant.countryservice.service.impl;


import com.cognizant.countryservice.entity.Country;
import com.cognizant.countryservice.repository.CountryRepository;
import com.cognizant.countryservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public Country getCountry(String code) {
        return repository.findByCode(code);

    }

    @Override
    public Country addCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public void deleteCountry(String code) {
        repository.deleteById(code);

    }

    @Override
    public List<Country> searchCountry(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Country> searchCountrySorted(String name) {

        return repository.findByNameContainingIgnoreCaseOrderByNameAsc(name);

    }

    @Override
    public List<Country> searchCountryStartingWith(String alphabet) {

        return repository.findByNameStartingWithIgnoreCase(alphabet);

    }
}


