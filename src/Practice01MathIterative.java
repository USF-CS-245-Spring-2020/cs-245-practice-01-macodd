public class Practice01MathIterative implements Practice01Math {

    /*
    Fibonacci sequence function/method.
    Iterates from 1 to n and returns the sum of
    the sequence adding the two previous sums.
     */
    public int fib(int n) throws Exception{
        // Variables initialized
        // sum: gets the sum of num1 and num2
        // num1, num2: variables constantly updating values
        int sum, num1 = 0, num2 = 1;

        // less than zero exception
        if (n < 0)
            throw new Exception("Number must be greater than 0");

        // iteration of the n value starting from 1
        for(int i = 1; i <= n ; i++){
            sum = num1 + num2; // adds the two numbers
            num1 = num2; // saves the previous value into num1
            num2 = sum; // updates its value
        }
        return num1; // final fibonacci result
    }

    /*
    Factorial function/method.
    Iterates from 1 to n multiplying each of
    the numbers between 1 and n.
     */
    public int fact(int n) throws Exception{
        // initialized variable to store the result
        int total = 1;

        // less than zero exception
        if (n < 0)
            throw new Exception("Number must be greater than 0");

        // iteration from 1 to n multiplying its values
        for(int i = 1; i <= n; i++){
            total *= i; // total value updating its results
        }
        return total; // final result
    }
}
