package test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TestServicios {
	
	@PersistenceContext(unitName = "persistenceJpa")
	private static EntityManager manager;

	public static void main(String[] args) {
		
		


	}

}
