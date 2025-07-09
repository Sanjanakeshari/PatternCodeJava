//0
//1 1
//2 3 5
//8 13 21
import java.util.*;
public class Pattern12 {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(first+"\t");
                int next=first+second;
                first=second;
                second=next;

            }
            System.out.println();
        }
    }
}
