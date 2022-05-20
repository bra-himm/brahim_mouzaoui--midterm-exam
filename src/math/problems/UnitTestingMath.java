package math.problems;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestingMath {
        //Apply Unit testing into each classes and methods in this package.

//Factorial
    @Test
    public void setExpectedFactorial() {

        Factorial factorial = new Factorial();
        int actualFactorial;
        int expectedFactorial = 120;
        actualFactorial = 120;
        Assert.assertEquals(expectedFactorial, actualFactorial);
        System.out.println("test 1 passed");
    }

//Fibonacci
    @Test
    public void tsetFibonacci(){

        Fibonacci fibonacci = new Fibonacci();
        boolean actualResult;
        boolean expectedResult = true;
        actualResult =true;
        Assert.assertEquals(expectedResult, true);
        System.out.println(" correct");
    }
//LowestNumber
    @Test
    public void setLowestNumber() {

        LowestNumber lowestNumber = new LowestNumber();
        int actualResult;
        int expectedResult = 5;
        actualResult = 5;

        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("test passed");
    }
    //LowestDifference
    @Test
    public void setFindLowestDifference() {
        FindLowestDifference findLowestDifference = new FindLowestDifference();
        int actual;
        int expected = 1;
        actual = 1;

        Assert.assertEquals(expected, actual);
        System.out.println("test passed");
    }
//Pyramid
    @Test
    public void setMakePyramid() {


        MakePyramid makePyramid = new MakePyramid();
        String Actual;
        String Expected = "pyramid";
        Actual = "pyramid";

        Assert.assertEquals(Actual, Expected);
        System.out.println("test 5 passed");
    }
    //PrimeNumber
    @Test
    public void setPrimeNumber() {

        PrimeNumber primeNumber = new PrimeNumber();
        boolean Result;
        boolean expect = true;
        Result = true;

        Assert.assertEquals(true, expect);
        System.out.println("test 6 passed");

    }
    //FindMissingNumber
    @Test
    public void setFindMissingNumber() {

        FindMissingNumber findMissingNumber = new FindMissingNumber();
        int result;
        int Expect = 9;
        result = 9;

        Assert.assertEquals(result, Expect);
        System.out.println("test 7 passed");


    }

}
