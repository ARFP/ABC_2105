package increments;

public class App {
    
    public static void main(String[] args) {
        
        int a, b, c;

        a = 0;
        b = a++;
        c = ++a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
