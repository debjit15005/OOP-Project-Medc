import java.util.*;
public class Main {
	public static void main(String[] args) {
		//take input of students and create students
		
		//take input of notice board and create doctors
		
		//take input of appointment and create appointment
		//State state = State.MODE_MENU;
//		Admin a = new Admin();
//		Thread t0 = new Thread(a);
//		t0.start();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to MedC");
		
		modeMenu(sc);
		
//		while(!mode.equals("Q")) {
//			mode = "";
//			System.out.println("Choose mode: \n A Admin Mode \n S Student Mode\n Q Quit");
//			mode = sc.nextLine();
//			
//			switch(mode) {
//			case "A":{
//				int in1=0;
//				do {
//				in1 = 0;
//				System.out.println("Welcome Admin");
//				System.out.println("Menu: \n 1 View Student records\n 2 Today's appointments\n 3 Update Notice Board \n 4 Medicine Store\n 0 Go Back");
//				in1 = sc.nextInt();
//				sc.nextLine();
//				
//				} while(in1!=0);
//				break;
//				
//			}
//			case "S":{
//				System.out.println("Welcome Student");
//				System.out.println(" 1 Login \n 2 Register");
//				break;
//			}
//			case "Q":{
//				System.out.println("Quitting");
//				break;
//			}
//			default:
//				System.out.println("Choose mode: \n A Admin Mode \n S Student Mode");
//				break;
//				
//			}
//		}
		
		
			
	}
	
	public static void modeMenu(Scanner sc) {
		
			String mode = "";
			System.out.println("Choose mode: \n A Admin Mode \n S Student Mode\n Q Quit");
			mode = sc.nextLine();
			switch(mode) {
			case "A":
				//state = State.ADMIN_MENU;
				adminMenu(sc);
				break;
			case "B":
				//state = State.STUDENT_MENU;
				studentMenu(sc);
				break;
			case "Q":
				System.exit(0);
			default:
				System.out.println("Unknown input");
				modeMenu(sc);
				break;
				
			}		
	}
	
	public static void adminMenu(Scanner sc) {
//		System.out.println("in adminMenu");
		int in1 = 0;
		Admin a = new Admin();
		Thread t0 = new Thread(a);
		t0.start();
		System.out.println("Welcome Admin");
		System.out.println("Menu: \n 1 View Student records\n 2 Today's appointments\n 3 Update Notice Board \n 4 Medicine Store\n 0 Go Back");
		in1 = sc.nextInt();
		sc.nextLine();
		switch(in1){
		case 1:
			System.out.println("Student Records");
			System.out.println(t0.isAlive());
			break;
		case 2:
			System.out.println("Today's appointments");
			System.out.println(t0.isAlive());
			break;
		case 3:
			System.out.println("Notices");
			System.out.println(t0.isAlive());
			break;
		case 4:
			System.out.println("Medicine Store");
			System.out.println(t0.isAlive());
			break;
		case 0:
//			System.out.println(t0.isAlive());
			t0.interrupt();
//			System.out.println(t0.isAlive());
			modeMenu(sc);
			break;
		}
		
	}
	public static void studentMenu(Scanner sc) {
		System.out.println("in studentMenu");
	}
	
}
