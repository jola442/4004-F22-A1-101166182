package com.piratenKapern;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({GameUnitTest.class, AcceptanceTestPart1.class, AcceptanceTestPart2.class, AcceptanceTestPart3.class})

public class TestSuite {

}
