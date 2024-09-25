package insta;

import org.testng.annotations.Test;

public class Story {
	@Test(groups = "check story")
	public void Create() {
		System.out.println("Create Story");
	}
	@Test(groups = "check story")
	public void remove() {
		System.out.println("Remove Story");
	}
	@Test
	public void Edit() {
		System.out.println("Edit a Stroy");
	}
	@Test
	public void ShareWithPriority() {
		System.out.println("Show Story based on priority");
	}
	@Test
	public void Location() {
		System.out.println("Location");
	}
}
