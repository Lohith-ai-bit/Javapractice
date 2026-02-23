 public class Reverse_a_Permutation {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n= sc.nextInt();
        java.util.ArrayList<java.util.ArrayList<Integer>> arr = new java.util.ArrayList<>();
        for(int i=0;i<n;i++){
            int col=sc.nextInt();
            java.util.ArrayList<Integer> cols= new java.util.ArrayList<>();
            for(int j=0;j<col;j++){
                int value = sc.nextInt();
                cols.add(value);
            }
            java.util.Collections.reverse(cols);
            arr.add(cols);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
		sc.close();
    }
}
