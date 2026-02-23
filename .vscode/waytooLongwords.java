import java.util.Scanner;
public class waytooLongwords {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        for (int i=0;i<=count;i++){
            String s=sc.nextLine();
            if(s.length()<=10){
                System.out.println(s);
            }
            else{
                System.out.println(""+s.charAt(0)+(s.length()-2)+s.charAt(s.length()-1));
            }
        }
    }
}