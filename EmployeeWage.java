public class EmployeeWage{
static int wagePerHour = 20;
static int FullDayHour = 8;
static int partTime = 4;
static int ispresent=1;
static int ispartTime=1;
static double status;
static int empcheck;
static int emphrs=0;
public static double Random()
{
 status=Math.floor(Math.random()*10)%3;
return status;
}
static int salary;

	public static void main(String[] args){
        	
		for(int i=0; i<=20; i++){
			empcheck=(int)Random();
    			switch(empcheck){
				case 0:
					emphrs=0;
					System.out.println("the employee is absent wage is 0");
				break;
				case 1:
					emphrs= emphrs+8;
					salary=salary+emphrs*wagePerHour;
					System.out.println("employee is full time wage="+salary);
					
				break;
				case 2:
					emphrs=emphrs+4;
					salary=salary+emphrs*wagePerHour;
					System.out.println("employee is part time wage="+salary);
			
				break;
				default:
					System.out.println("salary cannot be calculated");
				break;
			}
		}
		
		System.out.println("total salary="+salary);
	}
}
