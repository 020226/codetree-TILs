import java.util.Scanner;

public class Main {
    public static void p(int n, int m){
        int answer=0;
        int min=0;

        if(n>=m){
            min=m;
        } else {
            min=n;
        }

        for(int i=1;i<=min;i++){
            if(n%i==0 && m%i==0){
                answer = i;
            }
        }

        System.out.println(answer);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        p(a, b);
    }
}