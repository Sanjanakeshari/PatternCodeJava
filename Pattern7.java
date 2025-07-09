//WAP to print diagonal
//* 
//  *
//    *
//      *
//        *
import java.util.*;
public class Pattern7 {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
      
        for(int i=1;i<=n;i++){                       //for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){               //    for(int j=1;j<=n;j++){
                System.out.print("\t");            //          if(i==j){
            }                                        //             System.out.print("*\t");
            space++;                                 //            }
            System.out.println("*\t");             //          else{
                                                     //              System.out.print("\t");
                                                     //             }
    }                                                //          }
}                                                    //      System.out.println();
}                                                    //     }
