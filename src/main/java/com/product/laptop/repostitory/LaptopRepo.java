package com.product.laptop.repostitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.laptop.model.Laptop;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,Integer> {
	public List<Laptop> findByPrice(int price);
}
