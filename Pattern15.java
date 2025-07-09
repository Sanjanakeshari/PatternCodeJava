//          1
//       2  2  2
//    3  3  3  3  3
//       2  2  2
//          1

import java.util.*;
public class Pattern15 {
    public static void main(String ar[]){
        Scanner sc=new Scanner((System.in));
        int n=sc.nextInt();
        int space=n/2;
        int star=1;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print(count+"\t");
            }
            if(i<=n/2){
                space--;
                star+=2;
                count++;
            }
            else{
                space++;
                star-=2;
                count--;
            }
            System.out.println();
        }
    }
}
