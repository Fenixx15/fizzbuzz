package org.example;

public class FizzBuzz {
    public String doFizzBuzz(int nbr){
        if (nbr % 3 == 0 && nbr % 5 == 0) {
            return "FizzBuzz";
        }
        if (nbr % 3 == 0) {
            return "Fizz";
        }
        if (nbr % 5 == 0) {
            return "buzz";
        }
        return.String.valueOf(nbr);
        //return nombre % 3 == 0 ? "Fizz" : "";
    }
}
