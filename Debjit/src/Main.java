import java.util.*;
public class Main {
	public static void main(String[] args) {
		//take input of students and create students
		
		//take input of notice board and create doctors
		
		//take input of appointment and create appointment
		Admin a = new Admin();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to MedC");
		String mode = "";
		while(!mode.equals("Q")) {
			mode = "";
			System.out.println("Choose mode: \n A Admin Mode \n S Student Mode\n Q Quit");
			mode = sc.nextLine();
			
			switch(mode) {
			case "A":{
				int in1=0;
				do {
				in1 = 0;
				System.out.println("Welcome Admin");
				System.out.println("Menu: \n 1 View Student records\n 2 Today's appointments\n 3 Update Notice Board \n 4 Medicine Store\n 0 Go Back");
				in1 = sc.nextInt();
				sc.nextLine();
				} while(in1!=0);
				break;
				
			}
			case "S":{
				System.out.println("Welcome Student");
				System.out.println(" 1 Login \n 2 Register");
				break;
			}
			case "Q":{
				System.out.println("Quitting");
				break;
			}
			default:
				System.out.println("Choose mode: \n A Admin Mode \n S Student Mode");
				break;
				
			}
		}
			
	}
}
