package Main_Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Executable_jar {

	public static void main(String[] args) {
		System.out.println("hii");
			TestNG runner = new TestNG();
			List<String> suitefiles = new ArrayList<String>();
			suitefiles.add("C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FixedDeposit_Automation\\testng.xml");
			runner.setTestSuites(suitefiles);
			runner.run();
	}
}
