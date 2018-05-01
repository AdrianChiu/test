package manager;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import entity.Perioada;

@Named
@SessionScoped
public class PerioadaManagerBean implements Serializable{

	private static final long serialVersionUID = 6733178954206125259L;
	
	private static EntityManager em = Persistence.createEntityManagerFactory("AsociatiaProprietariRevolutiei63").createEntityManager();

	public void persist(Perioada perioada) {
		em.getTransaction().begin();
		em.persist(perioada);
		em.getTransaction().commit();
	}
	
	public void delete(Perioada perioada) {
		em.getTransaction().begin();
		em.remove(perioada);
		em.getTransaction().commit();
	}
}
