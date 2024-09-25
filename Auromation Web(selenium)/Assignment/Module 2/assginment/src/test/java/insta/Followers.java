package insta;

import org.testng.annotations.Test;

public class Followers {
    @Test
	public void SendRequest() {
		System.out.println("Send request");
	}
    @Test
	public void AccecptRequest() {
		System.out.println("Accecpt Request");
	}
    @Test
	public void unfollow() {
		System.out.println("Unfollow");
	}
    @Test
	public void Block() {
		System.out.println("block");
	}
}
