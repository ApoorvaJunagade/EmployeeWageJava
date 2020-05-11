public class EmployeeWage{
static int WagePerHour = 20;
static int FullDayHour = 8;
static int partTime = 4;
static int ispresent=1;
static int ispartTime;
static double status;
public static double random()
{
 status=Math.floor(Math.random()*10)%2;
return status;
}
static int salary;

	public static void main(String[] args){
		System.out.println("Welcome to employee wage computation program!");
                if ( random() == ispresent ){
			if( random() == ispartTime){
				salary=WagePerHour*partTime;
				System.out.println("employee is part time wage for one day="+salary);
			}
			else{
				salary=WagePerHour*FullDayHour;
				System.out.println("employee is full time wage for one day="+salary);
			}
		}
		else
 			System.out.println("employee is absent");
		}
}
