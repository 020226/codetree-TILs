import java.util.Scanner;

public class Main {
    public static void printRect(int n){
        int cnt = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(cnt + " ");
                cnt++;
                if(cnt==10)
                    cnt = 1;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printRect(num);


    }
}