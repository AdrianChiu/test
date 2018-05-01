package manager;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import entity.Contor;

@Named
@SessionScoped
public class ContorManagerBean implements Serializable{
	
	private static final long serialVersionUID = 2134819368554531481L;

	private static EntityManager em = Persistence.createEntityManagerFactory("AsociatiaProprietariRevolutiei63").createEntityManager();
	
	public void persist(Contor contor) {
		em.getTransaction().begin();
		em.persist(contor);
		em.getTransaction().commit();
	}
	
	public void delete(Contor contor) {
		em.getTransaction().begin();
		em.remove(contor);
		em.getTransaction().commit();
	}
}
