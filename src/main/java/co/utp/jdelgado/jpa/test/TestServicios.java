package co.utp.jdelgado.jpa.test;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.utp.jdelgado.jpa.modelo.Servicios;

public class TestServicios {

	private static EntityManager manager;

	private static EntityManagerFactory emf;

	public static void main(String[] args) {

		emf = Persistence.createEntityManagerFactory("persistenceJpa");
		manager = emf.createEntityManager();

		@SuppressWarnings("unchecked")
		List<Servicios> myservicios = (List<Servicios>) manager.createQuery("from servicios").getResultList();
		System.out.println(myservicios.size());
	}

}
