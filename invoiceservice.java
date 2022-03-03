package com.company.varnaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.varnaa.controller.invoice;
import com.company.varnaa.repository.invoiceRepository;

@Service
@Transactional
public class invoiceservice {

	@Autowired
	private invoiceRepository rep;
	
	
	public void save(invoice entity) {
		rep.save(entity);
	}
	
	public List<invoice> view(){
		return rep.findAll();
	}
}
