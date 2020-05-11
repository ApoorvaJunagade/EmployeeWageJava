public class EmployeeWage{
static int WagePerHour = 20;
static int FullDayHour = 8;
static int ispresent=1;
static double status=Math.floor(Math.random()*10)%2;
static int salary;

	public static void main(String[] args){
		System.out.println("Welcome to employee wage computation program!");
                 

		if ( status == ispresent ){
			salary=WagePerHour*FullDayHour;
			System.out.println("employee is present wage for one day= "+salary);
		}
		else
 			System.out.println("employee is absent");
		}
}
