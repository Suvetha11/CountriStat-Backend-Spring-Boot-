package com.example.countriesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository repository;

    public List<Country> getCountries(){
        return repository.findAll();
    }

    public void addCountries(Country country){
        repository.save(country);
    }

    public void updateCountries(Country country){
        repository.save(country);
    }

    public void deleteCountries(Integer id){
        repository.deleteById(id);
    }

}
