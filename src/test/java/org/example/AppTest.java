package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testDoFizzBuzz_NumberDividibleBy3_ShouldReturnFizz()
    {
        //Arrange
        int nbr =9;
        String outputExpected ="Fizz";
        FizzBuzz fb = new FizzBuzz();

        //Act
        String result = fb.doFizzBuzz(nbr);

        //Assert
        Assert.assertEquals(outputExpected, result);
    }

    @Test
    public void testDoFizzBuzz_NumberDivisibleBy5_ShouldReturnBuzz(){
        int nbr = 15;
        String outputExpected= "Fizzbuzz";
        FizzBuzz fb = new FizzBuzz();

        String result = fb.doFizzBuzz(nbr);

        Assert.assertEquals(outputExpected, result);

    }

    @Test
    public void testDoFizzBuzz_NumberDivisibleBy5or5_ShouldReturnBuzz(){
        int nbr = 15;
        String outputExpected= "Fizzbuzz";
        FizzBuzz fb = new FizzBuzz();

        String result = fb.doFizzBuzz(nbr);

        Assert.assertEquals(outputExpected, result);

    }
}
