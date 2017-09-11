package beans;

import javax.ejb.Remote;

@Remote
public interface ValidatorRemote {

	public boolean validate(String login, String pass);

}
