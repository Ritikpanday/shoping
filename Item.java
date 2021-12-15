

package Shoping;

import java.sql.Date;
import java.util.Calendar;

public class Item {
	 String item[]=new String[100];
       
         int price[]= new int[100];
        int quantity[]= new int[100];
        int seeorder[]= new int [100];
         public void show() {
        	 int i=0;
        	 int j=0;
        	 while(j<quantity.length) {
        		 if(quantity[j]!=0) {
        			 System.out.println((j+1)+"  item  "+item[j]+" Price "+price[j]+"quantity"+quantity[j]);
        			 i++;
        		 }
        		 j++;
        		 
        	 }
         }
         public void order(int i,int quant) {
        	 if(i<price.length && quantity[i-1]>=quant) {
        	 System.out.println(item[i-1]+"price"+price[i-1]+"order successfull");
        	 quantity[i-1]-=quant;
        	 seeorder[i-1]+=quant;
        	 }
        	 
        	
         }
        
         public void seeorder()
         {
        	 int i=0;
        	 int totalprice=0;
        	 while(i<price.length ) {
        		 if(seeorder[i]>0) {
        			 System.out.println(seeorder[i]+"  item  "+item[i]+" Price "+price[i]);
        			
        			 System.out.print("Delivery date"+" ");
        			 Calendar calendar = Calendar.getInstance();
        		     // System.out.println("Current Date = " + calendar.getTime());
        		      // Adding 2 weeks
        		      calendar.add(Calendar.WEEK_OF_YEAR, 2);
        		      System.out.println(calendar.getTime());
        		      totalprice+=seeorder[i]*price[i];
        		    
        		      
        		      
        		 }
        		 
        		 i++;
        	 }
        	 
        	 System.out.println("toal payable price= "+totalprice);
         }

}
