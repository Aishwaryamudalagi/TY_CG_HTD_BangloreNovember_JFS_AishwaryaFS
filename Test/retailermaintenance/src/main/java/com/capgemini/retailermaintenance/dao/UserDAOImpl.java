package com.capgemini.retailermaintenance.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.capgemini.retailermaintenance.dto.UserInfo;
import com.capgemini.retailermaintenance.exceptions.CustomException;
@Repository
public class UserDAOImpl implements UserDAO{
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean register(UserInfo account) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(account);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new CustomException("Account does not exist");
		}
	}

	@Override
	public UserInfo login(UserInfo credentials) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Authentication where email=:email";
		TypedQuery<UserInfo> query = manager.createQuery(jpql, UserInfo.class);
		query.setParameter("email", credentials.getEmail());
		try {
			UserInfo account = query.getSingleResult();
			if (account.getPassword().equals(credentials.getPassword())) {
				return account;
			} else {
				System.out.println("credentials are invalid");
				return null;
			}
		} catch (Exception e) {
			throw new CustomException("Account does not exist");
	 }
	}

	@Override
	public boolean addUser(UserInfo user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public UserInfo getUser(int id) {
		EntityManager manager = factory.createEntityManager();
		UserInfo product = manager.find(UserInfo.class, id);
		return product;
	}

	@Override
	public List<UserInfo> getAllUsers() {
		EntityManager manager = factory.createEntityManager();
		String getall = "from Product";
		TypedQuery<UserInfo> query = manager.createQuery(getall, UserInfo.class);
		return query.getResultList();

	}

	@Override
	public boolean deleteUser(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		UserInfo user = manager.find(UserInfo.class, id);
		if (user != null) {
			transaction.begin();
			manager.remove(user);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean modifyUser(int id, String Password) {
		EntityManager manager = factory.createEntityManager();
		UserInfo user = manager.find(UserInfo.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if (user != null) {
			transaction.begin();
			user.setPassword(Password);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
