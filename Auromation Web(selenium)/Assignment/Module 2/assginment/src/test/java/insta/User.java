package insta;

import org.testng.annotations.Test;

public class User {
    @Test
	public void CA() {
		System.out.println("create account");
	}
    @Test(groups = {"check story"})
	public void Login() {
		System.out.println("Login");
	}
    @Test
	public void profile() {
		System.out.println("manage profile");
	}
    @Test
	public void ChangePassword() {
		System.out.println("Change password");
	}
    @Test
	public void Logout() {
		System.out.println("Logout");
	}
}
