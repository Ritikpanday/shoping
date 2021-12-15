package Shoping;

public class Profile {
	 String name;
	 static int count = 0; 
	 int jobid;
	 long phoneno;
	 String address;
	
	public void Set(String name,long phoneno,String address) {
		this.name=name;
		this.phoneno=phoneno;
		this.address=address;
		this.jobid=++count;
	}
	public void show() {
		System.out.println("name is "+name+" phone no is "+phoneno+" address is "+address+"jobid is"+jobid);
	}

}
