package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.Professor;

/**
 *
 * @author aluno
 */
public class ProfessorDAO {
    
    public ProfessorDAO() {
        
    }
    
    public EntityManager getEm() throws Exception {
        
        EntityManagerFactory emf;
        
        emf = Conexao.getConexao();
        
        return emf.createEntityManager();
        
    }
    
    public void incluir(Professor obj) throws Exception {
        
        EntityManager em = getEm();
//        cliente = em.getReference(Cliente.class,cliente.getId()); 
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();
            throw e;
        }
        finally{
            em.close();

        }
        
    }

    
    public List<Professor> listar() throws Exception {
        
        return getEm().createNamedQuery("Professor.findAll").getResultList();
        
    }
    
    public void alterar(Professor obj) throws Exception {
        
        EntityManager em = getEm();
        
        try {
            
        } catch (RuntimeException e) {
            
        } finally {
            
        }
        
    }
    
    public void excluir(Professor obj) throws Exception {
        
        EntityManager em = getEm();
        
        try {
            
        } catch (RuntimeException e) {
            
        } finally {
            
        }
        
    }
    
    public void fechaEmf() {
        
        Conexao.closeConexao();
        
    }
}