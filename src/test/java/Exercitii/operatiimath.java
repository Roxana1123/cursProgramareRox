package Exercitii;

public class operatiimath {

    public static int add(int a, int b, int c, int d, int f) {
        return a + b * c / d + f;
    }

    public static int scadereAditieAsiC(int c, int a) {
        return c - a;
    }

    public static int doarIncrement(int c) {
        return ++c;
}
    public static void main(String[] args) {
        int result = add (7, 9, 11, 2,9 );
        System.out.println("the sum is: " + result);
        int resultt = scadereAditieAsiC(2,7);
        System.out.println("the sum is" + resultt);
        int resulty = doarIncrement(11);
        System.out.println("the summ is" + resulty);
    }
}
