//*
//* *
//* * *
//* * * * 
//* * * * *
import java.util.*;
public class Pattern1 {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
