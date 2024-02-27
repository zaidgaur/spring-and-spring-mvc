package com.zaid.crudspringwebmaven.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.zaid.crudspringwebmaven.dto.Employee;
@Component
public class DAO {
	
	public static EntityManager persistenceConnection(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dboperation");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
		
	}

	public void save(Employee emp) {
		EntityManager entityManager = persistenceConnection();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(emp);
		entityTransaction.commit();
		entityManager.close();
	}

	public List<Employee> getEmployees() {
		EntityManager entityManager = persistenceConnection();
		Query query = entityManager.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		return list;
	}

	public 	Employee getEmpById(int id) {
		EntityManager entityManager = persistenceConnection();
		Employee find = entityManager.find(Employee.class, id);	
		return find;
		
		
	}

	public void update(Employee emp) {
		EntityManager entityManager = persistenceConnection();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	     entityManager.merge(emp);
		entityTransaction.commit();
		entityManager.close();
		
	}

	public void delete(int id) {
          EntityManager entityManager = persistenceConnection();
          Employee find = entityManager.find(Employee.class, id);
          EntityTransaction entityTransaction = entityManager.getTransaction();
          entityTransaction.begin();
          entityManager.remove(find);
          entityTransaction.commit();
          entityManager.close();
          
          
		
	}
	
	 

}
