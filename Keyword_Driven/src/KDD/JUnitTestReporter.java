package KDD;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Rule;
import org.junit.runner.Description;
import org.junit.rules.TestWatcher;

public class JUnitTestReporter {
@Test
	public void failed(Exception e) {

		System.out.println("FAILED: " +e.getMessage());
	}
@Test
	public void succeeded(String d) {
		System.out.println("PASSED: " +d);
	}

}