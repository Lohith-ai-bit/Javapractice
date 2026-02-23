import java.util.*;
class Student{
	int RollNo;
	String name;
	String Branch;
    static HashMap<String,Integer> Students= new HashMap<>();
	Student(int n,String m,String b){
		this.RollNo=n;
		this.name=m;
		this.Branch=b.toUpperCase();
        if(!hm.containsKey(branch))
            hm.put(branch,1);
        else{
            int tem=hm.get(branch)+1;
            hm.put(branch,cnt)
        }
        show();
	}
	void show(){
		System.out.println();
		System.out.println("IT:"+It);
		System.out.println("CSE:"+Cse);
		System.out.println("AIML:"+Aiml);
		
	}
	public static void main(String args[]){
		Student arr[];
		int n=4;
		arr=new Student[n];
		arr[0]= new StudentScan(12,"Raju","CSE");
        arr[1]= new StudentScan(13,"Raju1","AIML");
        arr[2]= new StudentScan(14,"Raju2","CSE");
        arr[3]= new StudentScan(15,"Raju3","IT");
	}
	}
