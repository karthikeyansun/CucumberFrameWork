package stepDefinitions;

import cucumber.api.java.en.Given;

public class RegularExpressionExampleDefinitions {
	
	@Given("^i have (\\d+) laptop$")
	public void i_have_laptop(int arg1) throws Throwable {
	    System.out.println("I have " +arg1+ " laptop");
	    
	}
	
	@Given("^i have a (\\d+\\.\\d+) GPA$")
	public void i_have_a_GPA(float num) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("i have a "+num+" GPA");
	}

	@Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_to_and(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1+ " " +arg2+" " +arg3);
	}

}
