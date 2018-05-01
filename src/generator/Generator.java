package generator;



import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import entity.Contor;
import entity.Perioada;
import manager.ContorManagerBean;
import manager.PerioadaManagerBean;

public class Generator {

	@Inject
	private static ContorManagerBean contorManagerBean;
	
	@Inject
	private static PerioadaManagerBean perioadaManagerBean;
	
	private static EntityManager em = Persistence.createEntityManagerFactory("AsociatiaProprietariRevolutiei63").createEntityManager();
	
	public static void main(String[] args) {

		Contor c = new Contor();
		c.setIndexVechi(100);
		c.setIndexCurent(50);
		c.setConsum(c.getIndexCurent() + c.getIndexVechi());
		
		Contor c1 = new Contor();
		c1.setIndexVechi(110);
		c1.setIndexCurent(12);
		c1.setConsum(c.getIndexCurent() + c.getIndexVechi());
		
		Perioada p = new Perioada();
		p.setData("data1");
		p.addContor(c);
		
		Perioada p1 = new Perioada();
		p1.setData("data2");
		p.addContor(c1);

		contorManagerBean.persist(c);
		contorManagerBean.persist(c1);
		
		perioadaManagerBean.persist(p);
		perioadaManagerBean.persist(p1);
	}

	public static ContorManagerBean getContorManagerBean() {
		return contorManagerBean;
	}

	public static void setContorManagerBean(ContorManagerBean contorManagerBean) {
		Generator.contorManagerBean = contorManagerBean;
	}

	public static PerioadaManagerBean getPerioadaManagerBean() {
		return perioadaManagerBean;
	}

	public static void setPerioadaManagerBean(PerioadaManagerBean perioadaManagerBean) {
		Generator.perioadaManagerBean = perioadaManagerBean;
	}



}
