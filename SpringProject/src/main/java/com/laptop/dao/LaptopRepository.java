package com.laptop.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.laptop.model.Laptop;

@Repository
	public interface LaptopRepository extends MongoRepository<Laptop, Integer> {
		
		default List<Laptop>findByModel(String model) {
			// TODO Auto-generated method stub
			return null;
		}
		default List<Laptop>findByCategoryOrderByTitleAsc(String category) {
			// TODO Auto-generated method stub
			return null;
		}
		default List<Laptop> findByModelAndname(String model,String name) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		@Query("from Laptop b where b.model=?1 and b.price>?2")
		default
		
		List<Laptop> findLaptopsByModelAndPricelaptops(String model,Double price) {
			// TODO Auto-generated method stub
			return null;
		}
		
		

	}


