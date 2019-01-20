package com.sky.task.shopping.cart.repository;

import java.util.Collection;

/**
 * Domain repositories extending this interface can expose basic repository methods
 *
 * @param <T> the domain type the repository manages
 * @author Mian Mahmood
 */
public interface Repository<T> {

	/**
	 * Returns all instances of the domain type.
	 * 
	 * @return all domain objects
	 */
	Collection<T> findAll();

	/**
	 * Retrieves a domain object by its identifying name.
	 * 
	 * @param description
	 * @return the domain object with the given name or null if none found
	 */
	T findByName(String description);

	/**
	 * Saves a given domain object
	 * 
	 * @param domain object
	 */
	void save(T t);
	
	/**
	 * Purges the data from the repository
	 * 
	 */
	void purge();

}