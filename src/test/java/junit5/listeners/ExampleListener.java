package junit5.listeners;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.jupiter.api.Test;

public class ExampleListener extends RunListener {
    @Override
    public void testRunStarted(Description description) throws Exception{
        System.out.println("----Listener-----");
        System.out.println("Before tests run:  "+ description);
        System.out.println("----------------");
    }

    @Override
    public void testRunFinished(Result result) throws Exception{
        System.out.println("-----Listener ------");
        System.out.println("Result of the test run:");
        System.out.println("Run time:  "+ result.getRunTime() + " ms");
        System.out.println("Run count: " + result.getRunCount());
        System.out.println("Failure count :" + result.getFailureCount());
        System.out.println("Ignored count" + result.getIgnoreCount());
        System.out.println("-----------------------------------------");
    }

    @Override
    public void testStarted(Description description)throws Exception{
        System.out.println("--------Listener-------");
        System.out.println("Test starts: "+ description);
        System.out.println("------------------------");
    }

    @Override
    public void testFinished(Description description) throws Exception{
        System.out.println("------- Listener--------");
        System.out.println("Test finished: "+ description);
        System.out.println("----------------");
    }

    @Override
    public void testFailure(Failure failure) throws Exception{
        System.out.println("------Listener------");
        System.out.println("Test failed with: " + failure.getException());
        System.out.println("----------------------");
    }
/*
@Override
public void testAssumptionFailure(Failure failure) throws Exception{
    System.out.println("--------Listener--------");
    System.out.println("Test assumes "+ failure.getException());
    System.out.println("--------------------------");
}
*/


    @Override
    public void testIgnored(Description description) throws Exception{
        System.out.println("-----------Listener-----------");
        System.out.println("Test ignored: "+description);
        System.out.println("----------------------------");
    }
}
