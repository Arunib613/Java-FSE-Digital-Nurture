package com.cognizant.countryservice;

import com.cognizant.countryservice.entity.Country;
import com.cognizant.countryservice.service.CountryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CountryserviceApplicationTests {

    @Autowired
    private CountryService countryService;
    @Test
    public void testGetCountry() {

        Country country = countryService.getCountry("IN");

        System.out.println(country);

    }
    @Test
    public void testAddCountry() {

        Country country = new Country("NP", "Nepal");

        countryService.addCountry(country);

        System.out.println("Country Added");

    }

    @Test
    public void testUpdateCountry() {

        Country country =
                new Country("NP",
                        "Federal Democratic Republic of Nepal");

        countryService.updateCountry(country);

        System.out.println("Country Updated");

    }

    @Test
    public void testDeleteCountry() {

        countryService.deleteCountry("NP");

        System.out.println("Country Deleted");

    }

    @Test
    public void testSearchCountry() {

        System.out.println(

                countryService.searchCountry("Ind")

        );

    }

    @Test
    public void testSearchCountryContaining() {

        List<Country> countries =
                countryService.searchCountry("ou");

        countries.forEach(System.out::println);

    }

    @Test
    public void testSearchCountrySorted() {

        List<Country> countries =
                countryService.searchCountrySorted("ou");

        countries.forEach(System.out::println);

    }

    @Test
    public void testSearchCountryStartingWith() {

        List<Country> countries =
                countryService.searchCountryStartingWith("Z");

        countries.forEach(System.out::println);

    }

}