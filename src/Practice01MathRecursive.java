public class Practice01MathRecursive implements Practice01Math{

    /*
    Fibonacci sequence function/method.
    Calls itself updating the value
    until base case its reached.
    returns the value of the sum of
    the previous two numbers.
     */
    public int fib(int n) throws Exception{

        // less than zero exception
        if (n < 0)
            throw new Exception("Number must be greater than 0");

        // base case
        if(n < 2)
            return n; // returns the value

        // Recursive call of n minus 2 plus n minus 1
        return fib(n - 2) + fib(n - 1);

    }

    /*
    Factorial function/method.
    Calls itself until base case its reached.
    Values are multiplied together and
    returns its total.
     */
    public int fact(int n) throws Exception {

        // less than zero exception
        if (n < 1)
            throw new Exception("Number must be greater than 0");

        // base case
        if(n == 1)
            return 1;

        // returns n multiplied by n minus 1
        return n * fact(n -1);
    }
}
