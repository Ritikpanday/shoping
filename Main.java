package Shoping;

import java.util.Scanner;

public class Main {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 Item it=new Item();
		boolean admin=true;
		while(admin) {
		System.out.println("1 for admin 2 for user");
		int t=sc.nextInt();
		if(t==1) {
			System.out.println("Enter no item you want to add");
			
			int no=sc.nextInt();
			for(int i=0;i<no;i++) {
				//System.out.println("Enter "+(i+1)+" item");
				System.out.println("Enter item name");
				   sc.nextLine();
				String itm=sc.nextLine();
				it.item[i]=itm;
				System.out.println("Enter item price");
				int pr=sc.nextInt();
				it.price[i]=pr;
				System.out.println("Enter item quantity");
				int qu=sc.nextInt();
				it.quantity[i]=qu;
			}
		}
		if(t==2) {
          Profile pr=new Profile();
          
          System.out.println("Enter name");
          sc.nextLine();
          String name=sc.nextLine();
          System.out.println("Enter phone no");
          long phoneno=sc.nextLong();
         
          System.out.println("Enter address");
          sc.nextLine();
          String add=sc.nextLine();
          pr.Set(name, phoneno, add);
         
          while(true) {
          System.out.println("Enter 1 for seeing profile and  2  for purchasing item and 3 for seeing ordr");
          int x=sc.nextInt();
          
          if(x==1) {
        	  pr.show();
          }
          else if(x==2){
        	  boolean y=true;
        	  while(y) {
        	  System.out.println("available item");
        	  it.show();
        	  System.out.println("select item for order");
        	  int item=sc.nextInt();
        	  System.out.println("select item quantity");
        	  int quant=sc.nextInt();
        	  it.order(item,quant);
        	  System.out.println("enter -1 for not ordering");
        	  int z=sc.nextInt();
        	  if(z==-1) {
        		  y=false;
        	  }
        	  }
          }
          else if(x==3){
        	  it.seeorder();
          }
          else if(x==4) {
        	  
        	  System.out.println("Name: "+pr.name);
        	  System.out.println("Phone No: "+pr.phoneno);
        	  System.out.println("address "+pr.address);
        	  it.seeorder();
        	  
          }
          System.out.println("Enter -1 for exit");
          int a=sc.nextInt();
          if(a==-1)
          {
        	  break;
          }
          }
	}
		System.out.println("Enter -1 exit");
		int a=sc.nextInt();
        if(a==-1)
        {
      	  break;
        }

}
}
}