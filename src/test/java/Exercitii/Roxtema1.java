package Exercitii;

public class Roxtema1 {
    static boolean bo = true;
    static double d = 23.4;
    static float f = 23.f;
    String st = "Nu merge, il sparg";
    String paragraf_din_pdf = "Hello world";
    // mor de nervi imi da eroare "java: non-static variable bo cannot be referenced from a static context"
    public static void main(String[] args) {
        System.out.println("paragraf_din_pdf");
        System.out.println("st");
        System.out.println(bo);
        System.out.println(d);
        System.out.println("Hello world");
        System.out.println(f);
        //aceeasi eroare ":16:28 java: non-static variable f cannot be referenced from a static context"
        //!!!!!daca "make roxtema1 static merge !!!!!!!!!!
    }
}