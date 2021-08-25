package Services;

public interface Authenticable {
	public Boolean login (String email, String password);
	public void logout ();
}
