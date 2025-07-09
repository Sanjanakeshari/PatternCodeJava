// WAP to print hollow diamond
//       *           2   -1
//    *     *        1    1
// *           *     0    3
//    *     *        1    1
//       *           2   -1


import java.util.*;
public class Pattern10 {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int is=-1;  //inner space
        int os=n/2;   //outer space
        for(int i=1;i<=n;i++){
            for(int j=1;j<=os;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            
            for(int j=1;j<=is;j++){
                System.out.print("\t");
            }  
            if(i>1 && i<n){
               System.out.print("*\t");
            }
            if(i<=n/2){
                os--;
                is+=2;
            }
            else{
                os++;
                is-=2;
            }
            System.out.println();

        }
    }
}
