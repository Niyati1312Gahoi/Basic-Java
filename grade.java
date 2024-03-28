package LEC1;

public class grade {
    public static void main(String[] args) {
        int m=67;
        if(m>=75){
            System.out.println("grade A");
        }else if(m>=65 && m<75){
            System.out.println("grade B");
        }else if(m>=55 && m<65){
            System.out.println("grade C");
        }else if(m>=45 && m<55){
            System.out.println("pass");
        }else{
            System.out.println("fail");

        }
    }
}
