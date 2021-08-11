package com.example.countriesapi;

import lombok.*;

import javax.persistence.*;

@Table(name = "COUNTRIES")
@Data
@NoArgsConstructor
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "COUNTRY_NAME")
    private String country_name;
    @Column(name = "CAPITAL_NAME")
    private String capital_name;

    public Country(Integer id, String country_name, String capital_name) {
        this.id = id;
        this.country_name = country_name;
        this.capital_name = capital_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCapital_name() {
        return capital_name;
    }

    public void setCapital_name(String capital_name) {
        this.capital_name = capital_name;
    }

    @Override
    public String toString() {
        return "Country{" +
            "id=" + id +
            ", country_name='" + country_name + '\'' +
            ", capital_name='" + capital_name + '\'' +
            '}';
    }
}
