package beans;

import javax.ejb.Stateless;

import common.dao.LoginDAO;

/**
 * Session Bean implementation class LoginEJB
 */
@Stateless
public class LoginEJB implements LoginEJBRemote {

    /**
     * Default constructor. 
     */
    public boolean LoginEJB(String login, String pass) {
        System.out.println("EJB LOGIN");
        boolean valid = LoginDAO.validate(login, pass);
//        "asd".equals(login) && "asd".equals(pass);
        return valid;
    }

}
