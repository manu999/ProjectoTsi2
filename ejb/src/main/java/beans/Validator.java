package beans;

import javax.ejb.Stateless;

import common.dao.LoginDAO;

/**
 * Session Bean implementation class Validator
 */
@Stateless
public class Validator implements ValidatorRemote, ValidatorLocal {

    /**
     * Default constructor. 
     */
    public Validator() {
        // TODO Auto-generated constructor stub
    }
    
    public boolean validate(String login, String pass) { 
        System.out.println("EJB LOGIN");
        boolean ret = "asd".equals(login) && "asd".equals(pass);
        //LoginDAO.validate(login, pass);

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
