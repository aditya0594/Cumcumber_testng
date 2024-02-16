package stepDefinitions;


import io.cucumber.java.Before;

public class TaggedHooksStepDefinition {
	
	@Before(order=0)
	public void setUP(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}

}
