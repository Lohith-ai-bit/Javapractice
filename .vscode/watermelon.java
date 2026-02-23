import java.util.Scanner;
public class watermelon {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
            if(i%2==0 && i!=2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
    }
    
}
