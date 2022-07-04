package com.brewery.kingbrewery.services;

import com.brewery.kingbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDTO getBeerById(UUID beerId){
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerName("corse light")
                .beerStyle("Pale Ale")
                .build();
    }
}
