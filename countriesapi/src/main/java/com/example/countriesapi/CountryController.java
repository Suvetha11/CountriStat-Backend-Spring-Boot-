package com.example.countriesapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("rest/v2/")
public class CountryController {
    @Autowired
    private CountryService service;

    @GetMapping("countries")
    public List<Country> getCountries() {
        return service.getCountries();
    }

    @PostMapping("countries/addnew")
    public void addCountry(@RequestBody Country country) {
        service.addCountries(country);
    }

    @PutMapping("countries/{id}/edit")
    public void updateCountries(@PathVariable("id") Integer id,@RequestBody Country country) {
        service.updateCountries(country);
    }

    @DeleteMapping("countries/{id}/delete")
    public void deleteCountry(@PathVariable("id") Integer id) {
        service.deleteCountries(id);
    }
}
