package beans;

import javax.ejb.Remote;

@Remote
public interface LoginEJBRemote {
	public boolean LoginEJB(String login, String pass);
}
