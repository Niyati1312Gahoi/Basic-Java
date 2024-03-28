package LEC1;

public class HALO {
    public static void main(String[] args) {

        int a = 2348;
        int sum = 0;
        int r=0;
        while (a > 0){
            r=a%10;
            sum=sum+r;
            a=a/10;
        }
        System.out.println(sum);


    }
}
