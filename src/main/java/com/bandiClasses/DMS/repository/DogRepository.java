package com.bandiClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

/*
 * @author S566602 Sneha Kancharla
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
