
package com.cognizant.countryservice.service;

import com.cognizant.countryservice.entity.Country;

import java.util.List;

    public interface CountryService {

        Country getCountry(String code);

        Country addCountry(Country country);

        Country updateCountry(Country country);

        void deleteCountry(String code);

        List<Country> searchCountry(String name);

        List<Country> searchCountrySorted(String name);

        List<Country> searchCountryStartingWith(String alphabet);

    }

