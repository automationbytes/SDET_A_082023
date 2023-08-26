package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    public static int count = 0;
    public static int max = 2;
    @Override
    public boolean retry(ITestResult iTestResult) {

        if(iTestResult.getThrowable() != null && count < max){
            if(count<max){
                count++;
                return true;
            }
        }
        return false;
    }

    public static int getCount(){
        return count;
    }
}
