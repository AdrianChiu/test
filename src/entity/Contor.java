package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the contor database table.
 * 
 */
@Entity
@NamedQuery(name="Contor.findAll", query="SELECT c FROM Contor c")
public class Contor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int consum;

	private int indexCurent;

	private int indexVechi;

	//bi-directional many-to-one association to Perioada
	@ManyToOne
	@JoinColumn(name="data")
	private Perioada perioada;

	public Contor() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getConsum() {
		return this.consum;
	}

	public void setConsum(int consum) {
		this.consum = consum;
	}

	public int getIndexCurent() {
		return this.indexCurent;
	}

	public void setIndexCurent(int indexCurent) {
		this.indexCurent = indexCurent;
	}

	public int getIndexVechi() {
		return this.indexVechi;
	}

	public void setIndexVechi(int indexVechi) {
		this.indexVechi = indexVechi;
	}

	public Perioada getPerioada() {
		return this.perioada;
	}

	public void setPerioada(Perioada perioada) {
		this.perioada = perioada;
	}

}