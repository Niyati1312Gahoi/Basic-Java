package LEC1;

public class assignment_operator {
    public static void main(String[] args) {
        int a=7;
        int b=3;
        int c=11;
        if(a>=b && a>=c){
            System.out.println(a);
        }else if(b>=a && b>=c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
