package error;

public class Creds2 {

	String email,pass,err;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public Creds2(String email, String pass, String err) {
		super();
		this.email = email;
		this.pass = pass;
		this.err = err;
	}
	
	public Creds2() {
		
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
	}
	
}
