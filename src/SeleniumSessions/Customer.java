package SeleniumSessions;

import java.util.Arrays;

public class Customer {
	int age;
	//WAF
	//getEmployeeDevices(empName : String)
	//return device list
	
//	public String[] getEmpDetails(String empName) {
//		System.out.println("Getting info for employee: " + empName);
//		if(empName == "Ramya") {
//			String devices[]= {"Macbook", "iPad", "Samsung"};
//			return devices;
//		}
//		else if(empName == "Kishore") {
//			String devices[]= {"Windows", "Oppo", "Google"};
//			return devices;
//		}
//		
//		else if(empName == "Jishna") {
//			String devices[]= {"Tab", "Galaxy", "Macbook"};
//			return devices;
//		}
//		
//		else {
//			System.out.println("Emp not found");
//		   return null;
//		}
//		
//	}
	
	public Object[] getEmpDetails(String empName) {
		System.out.println("Getting info for employee: " + empName);
		Object devices[]= new Object[3];
		if(empName == "Ramya") {
			devices[0]= "Macbook";
			devices[1]="iPad";
			devices[2]="Samsung";
			
		}
		else if(empName == "Kishore") {
			devices[0]= "Windows";
			devices[1]="Oppo";
			devices[2]="Google";
			//devices[]= {"Windows", "Oppo", "Google"};
			
		}
		
		else if(empName == "Jishna") {
			devices[0]= "Tab";
			devices[1]="Galaxy";
			devices[2]="Macbook";
			//devices[]= {"Tab", "Galaxy", "Macbook"};
			
		}
		
		else {
			System.out.println("Emp not found");
		   
		}
		return devices;
		
	}
//	public String[] getEmpDetails(String empName) {
//		System.out.println("Getting info for employee: " + empName);
//		//String devices[]= new String[3];
//		String devices[]= {"","",""};
//		if(empName == "Ramya") {
//			devices[]= {"Macbook", "iPad", "Samsung"};
//			
//		}
//		else if(empName == "Kishore") {
//			devices[]= {"Windows", "Oppo", "Google"};
//			
//		}
//		
//		else if(empName == "Jishna") {
//			devices[]= {"Tab", "Galaxy", "Macbook"};
//			
//		}
//		
//		else {
//			System.out.println("Emp not found");
//		   
//		}
//		return devices;		
//	}

	public static void main(String[] args) {
		Customer cust=new Customer();
		Object d[]=cust.getEmpDetails("Ramya1");
		System.out.println(Arrays.toString(d));
		
		
		
		
		
		
		
	}

}
