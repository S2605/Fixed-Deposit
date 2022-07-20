package Runner_Package;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Jar_Class {
	
	public static void main(String[] args) {
		
		TestNG runner = new TestNG();

		// Create a list of String
		List<String> suitefiles = new ArrayList<String>();

		// Add xml file which you have to execute
		suitefiles.add("C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\uatonline.stfc.in\\testng.xml");

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
	}

}
