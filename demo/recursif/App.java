package recursif;

public class App {

    public static long fib(long n) 
    {
        if ((n == 0) || (n == 1))
           return n;
        else
           return fib(n - 1) + fib(n - 2);
     }

     public static void main(String[] args) 
     {
        System.out.println("3ème nombre: " + fib(3));
        System.out.println("5ème nombre: " + fib(5));
        System.out.println("99ème nombre: " + fib(20));
     }
}

