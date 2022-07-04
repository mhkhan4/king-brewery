package com.brewery.kingbrewery.services;

import com.brewery.kingbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}
