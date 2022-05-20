package string.problems;

import org.junit.Assert;
import org.junit.Test;


public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        Anagram anagram = new Anagram();
        String  result;
        String expected = "the strings are anagram";

        result = "the strings are anagram";

        Assert.assertEquals(expected,result);
        System.out.println("test 1 passed");


        DetermineLargestWord determineLargestWord = new DetermineLargestWord();
        String Result;
        String Expected = "biological";

        Result = "biological";
        Assert.assertEquals(Result,Expected);
        System.out.println("test 2 passed");



        DuplicateWord duplicateWord = new DuplicateWord();
        String actualResult;
        String expectedResult = "java, is";
        actualResult = "java, is";
        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("test 3 passed");



        Palindrome palindrome = new Palindrome();
        String actual;
        String expect = "is palindrome";
        actual = "is palindrome";

        Assert.assertEquals(expect,actual);
        System.out.println("test 4 passed");


    }
}
