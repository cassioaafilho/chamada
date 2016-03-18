package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Professor;

public class ProfessorService {
	private EntityManagerFactory emf;
	
	public ProfessorService()
	{
	      emf = Persistence.createEntityManagerFactory("ProjetoMavenJSFPrimeFaces");
	}
	
	public void salvar(Professor professor)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(professor);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Professor> getProfessors()
	{
		
		List <Professor >professors;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Professor a");
		professors = q.getResultList();
		em.close();
		
		return professors;
		
	}
}
