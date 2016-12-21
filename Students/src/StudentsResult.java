import java.util.Scanner;
public class StudentsResult {
	int rollno,num;
	String name;
	String sub1,sub2,result;
	
	
	
	public StudentsResult(int i)
	{
		
		System.out.println("............Students Report : "+ i );
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rollno,num;
		String name,sub1,sub2,result;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total no of students ?");
		num=Integer.parseInt(s.nextLine());
		for(int i=1;i<=num;i++)
		{
			
			StudentsResult st=new StudentsResult(i);
			
			System.out.println("Enter roll No for student"+i);
			st.rollno=Integer.parseInt(s.nextLine());
			System.out.println("Enter name for student"+i);
			st.name=s.nextLine();
			System.out.println("Subject 1 grade?");
			st.sub1=s.nextLine();
			System.out.println("Subject 2 grade?");
			st.sub2=s.nextLine();
			System.out.println("Result?");
			st.result=s.nextLine();
			st.display(st.rollno,st.name,st.sub1,st.sub2,st.result);
			
		}
		
		
		
	}
	public void display(int rollno,String name,String sub1,String sub2,String result)
	{
		System.out.println("Roll NO : "+rollno);
		System.out.println("Name    : "+name);
		System.out.println("Sub 1   : "+sub1);
		System.out.println("Sub2    : "+sub2);
		System.out.println("Result  : "+result);
		
	}
}
