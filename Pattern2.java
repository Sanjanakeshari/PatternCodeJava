//* * * * *
//* * * *
//* * *
//* *
//* 
import java.util.*;
public class Pattern2 {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
