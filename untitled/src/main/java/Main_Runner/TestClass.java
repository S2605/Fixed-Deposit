package Main_Runner;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {


        TestNG runner = new TestNG();

        // Create a list of String
        List<String> suitefiles = new ArrayList<String>();

        // Add xml file which you have to execute
        suitefiles.add("C:/Users/s2605/IdeaProjects/untitled\\testng.xml");

        // now set xml file for execution
        runner.setTestSuites(suitefiles);

        // finally execute the runner using run method
        runner.run();


    }


}
