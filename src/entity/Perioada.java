package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the perioada database table.
 * 
 */
@Entity
@NamedQuery(name="Perioada.findAll", query="SELECT p FROM Perioada p")
public class Perioada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String data;

	//bi-directional many-to-one association to Contor
	@OneToMany(mappedBy="perioada")
	private List<Contor> contors = new ArrayList<>();

	public Perioada() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Contor> getContors() {
		return this.contors;
	}

	public void setContors(List<Contor> contors) {
		this.contors = contors;
	}

	public Contor addContor(Contor contor) {
		getContors().add(contor);
		contor.setPerioada(this);

		return contor;
	}

	public Contor removeContor(Contor contor) {
		getContors().remove(contor);
		contor.setPerioada(null);

		return contor;
	}

}