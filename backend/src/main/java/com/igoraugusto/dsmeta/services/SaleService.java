package com.igoraugusto.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igoraugusto.dsmeta.entities.Sale;
import com.igoraugusto.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> fiandSales(){
		return repository.findAll();
	}
}
