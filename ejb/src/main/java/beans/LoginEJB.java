package beans;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import common.dao.LoginDAO;
import common.entity.User;

/**
 * Session Bean implementation class LoginEJB
 */
@Stateless
public class LoginEJB implements LoginEJBRemote {

//	@PersistenceContext(unitName = "Users")
//    private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public boolean LoginEJB(String login, String pass) {
        System.out.println("EJB LOGIN");
        boolean ret = true;
//      LoginDAO.validate(login, pass);

//		try {
//			// Select del usuario
//	        Query q = em.createQuery("SELECT u FROM User u");
//	        List<User> userList = q.getResultList();
//	        
//			if (userList.isEmpty()) {
//				// Create new user
//				em.getTransaction().begin();
//				User u = new User();
//				u.setLogin(login);
//				u.setPassword(pass);
//				em.persist(login);
//				em.getTransaction().commit();
//				
//			}else{
//				User u = userList.get(0);
//				if(!u.getPassword().equals(pass)){
//					ret = false;
//				}
//			}
//		} catch (Exception ex) {
//			System.out.println("Login error -->" + ex.getMessage());
//			return false;
//		} finally {
//			em.close();
//		}
        return ret;
    }

}
