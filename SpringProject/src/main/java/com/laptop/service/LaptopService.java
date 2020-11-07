package com.laptop.service;

import java.util.List;

import com.laptop.exception.LaptopNotFoundException;
import com.laptop.model.Laptop;




public interface LaptopService {
	Laptop addlaptop(Laptop laptop);

    boolean deletelaptop(Integer laptopid) throws LaptopNotFoundException;

    Laptop getlaptopById(Integer laptopid) throws LaptopNotFoundException;

    Laptop updatelaptop(Laptop laptop);


    List<Laptop> getAlllaptops();

    List<Laptop> getLaptopbyName(String name) throws LaptopNotFoundException;

    List<Laptop> getLaptopbyCategory(String category) throws LaptopNotFoundException;
    List<Laptop> findByModelAndName(String model,String name) ;

	List<Laptop> findlaptopsByModelAndPricelaptops(String Model,Double price);


	List<Laptop> getLaptopbyModel(String model) throws LaptopNotFoundException;

	
}