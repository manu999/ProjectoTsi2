package beans;

import javax.ejb.Local;

@Local
public interface ValidatorLocal {

	public boolean validate(String login, String pass);

}
