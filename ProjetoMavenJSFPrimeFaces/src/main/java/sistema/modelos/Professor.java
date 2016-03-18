package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {

	@Id
	private int matricula;
	private String nome;
	private String horadachamadinha;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHoradachamadinha() {
		return horadachamadinha;
	}
	public void setHoradachamadinha(String horadachamadinha) {
		this.horadachamadinha = horadachamadinha;
	}
	
	
}
