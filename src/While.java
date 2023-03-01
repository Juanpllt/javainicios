

import java.util.Scanner;

public class While {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n1=sc.nextInt();
        int i=0;
        while(n1>i){
            System.out.println(i);
            ++i;
        }
        System.out.println("\"i");
    }
}
