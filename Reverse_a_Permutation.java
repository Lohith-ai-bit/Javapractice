import java.util.*;
 class Reverse_a_Permutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int col=sc.nextInt();
            ArrayList<Integer> cols= new ArrayList<>();
            for(int j=0;j<col;j++){
                int value = sc.nextInt();
                cols.add(value);
            }
            Collections.reverse(cols);
            arr.add(cols);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
