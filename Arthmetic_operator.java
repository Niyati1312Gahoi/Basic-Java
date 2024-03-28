package LEC1;

public class Arthmetic_operator {
    public static void main(String[] args) {
        int a=9;
        int b=7;
        int c=a+b;
        System.out.println(c);
        c=a-b;
        System.out.println(c);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(b--);
        System.out.println(b);
        int n=9;
        int x=n++ + 8 + n-- - --n + --n + ++n;
        System.out.print(x);
    }
}
