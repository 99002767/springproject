package com.laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptop.dao.LaptopRepository;
import com.laptop.exception.LaptopNotFoundException;
import com.laptop.model.Laptop;
@Service
public class LaptopServiceImpl implements LaptopService {
	
	@Autowired
	LaptopRepository laptopRepository;

//	@Override
//	public Laptop addlaptop(Laptop laptop) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean deletelaptop(Integer laptopid) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Laptop getlaptopById(Integer laptopid) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Laptop updatelaptop(Laptop laptop) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Laptop> getAlllaptops() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Laptop> getLaptopbyName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Laptop> getLaptopbyCategory(String category) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Laptop> findByModelAndName(String model, String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Laptop> findlaptopsByModelAndPricelaptops(String Model, Double price) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//

	@Override
	public Laptop addlaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		Laptop newlaptop=laptopRepository.save(laptop);
		return newlaptop;
	}

	@Override
	public boolean deletelaptop(Integer laptopid) throws LaptopNotFoundException {
		laptopRepository.deleteById(laptopid);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Laptop getlaptopById(Integer laptopid) throws LaptopNotFoundException {
		return laptopRepository.findById(laptopid)
		.orElseThrow(()->new LaptopNotFoundException("Id not available"));
		
	}

	@Override
	public Laptop updatelaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public List<Laptop> getAlllaptops() {
		// TODO Auto-generated method stub
		return laptopRepository.findAll();
	}

	@Override
	public List<Laptop> getLaptopbyModel(String model) throws LaptopNotFoundException {
		// TODO Auto-generated method stub
		return laptopRepository.findByModel(model);
	}

	@Override
	public List<Laptop> getLaptopbyCategory1(String category) throws LaptopNotFoundException {
		// TODO Auto-generated method stub
		return laptopRepository.findByCategoryOrderByTitleAsc(category);
	}

	@Override
	public List<Laptop> findByModelAndName(String model, String name) {
		// TODO Auto-generated method stub
		return laptopRepository.findByModelAndname(model, name);
	}
	@Override
	

	public List<Laptop> findLaptopsByModelAndPricelaptops(String model, Double price) {
		// TODO Auto-generated method stub
		return laptopRepository.findLaptopsByModelAndPricelaptops(model,price);
	}

	@Override
	public List<Laptop> getLaptopbyName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Laptop> getLaptopbyCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Laptop> findlaptopsByModelAndPricelaptops(String Model, Double price) {
		// TODO Auto-generated method stub
		return null;
	}
}

