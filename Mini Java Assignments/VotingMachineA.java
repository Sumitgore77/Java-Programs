import java.util.*;
class Voter{

	private int Vid;
	private String Vname;
	
	public Voter(int Vid,String Vname){
	
		this.Vid=Vid;
		this.Vname=Vname;
	}
	
	public int getVid(){
		return Vid;
	}
	public String getVname(){
		return Vname;
	}
}
class Ward{

	private int Wid;
	private String Wname;
	
	public Ward(int Wid,String Wname){
		this.Wid=Wid;
		this.Wname=Wname;
	}
	
	public int getWid(){
		return Wid;
	}
	public String getWname(){
		return Wname;
	}
}
class VotingMachin{

	private Voter v[];
	private Ward w[];

	public VotingMachin(Voter v[],Ward w[]){
			this.v=v;
			this.w=w;
	}
	
	public void show(){
	
	System.out.println("========VotingMachin App=======");
	System.out.println();

		for(int i=0; i<w.length;i++)
		{
			System.out.println();
			System.out.println("Ward Id:"+w[i].getWid()+"\tWard Name:"+w[i].getWname());

			System.out.println("============================");
			System.out.println("Voter Id:\t"+"Voter Name:\t");
			System.out.println("----------------------------");

			for(int j=0; j<v.length;j++)
			{
				System.out.println(v[j].getVid()+"\t\t"+v[j].getVname());
			}
		   System.out.println("---------------------------------");
		}
	}
}

public class VotingMachineA{

  public static void main(String x[])
  {

	Scanner sc=new Scanner(System.in);	

	System.out.println("Enter how many wards");
	int wSize=sc.nextInt();
	Ward w[]=new Ward[wSize];

	Voter[] allVoters = null;

	for(int i=0; i<wSize;i++)
	{
		
		System.out.println("Enter Ward ID:");
		int Wid=sc.nextInt();
		
		sc.nextLine();	

		System.out.println("Enter Ward Name:");
		String Wname=sc.nextLine();
			
	
		System.out.println("How many voters in this ward ID:"+(i+1));
		int vSize=sc.nextInt();		

		Voter v[]=new Voter[vSize];

		w[i]=new Ward(Wid,Wname);
		
		for(int j=0; j<vSize; j++)
		{

			System.out.println("Enter Voter ID:");
			int Vid=sc.nextInt();
			
			sc.nextLine();	

			System.out.println("Enter Voter Name:");
			String Vname=sc.nextLine();
			

			v[j]=new Voter(Vid,Vname);
		}
	   allVoters=v;
	}
	VotingMachin vm=new VotingMachin(allVoters,w);
	vm.show();
	
  }
}