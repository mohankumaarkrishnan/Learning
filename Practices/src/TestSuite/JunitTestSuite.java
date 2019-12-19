package TestSuite;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Test.TestComparingLists;
import Test.TestLargestSubString;
import Test.TestMergingArray;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestMergingArray.class, 
	TestComparingLists.class,
	TestLargestSubString.class })
public class JunitTestSuite {

	public static void main(String[] args) {
		JUnitCore.runClasses(JunitTestSuite.class);
	}

}
