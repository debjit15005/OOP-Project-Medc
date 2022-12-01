import java.time.DayOfWeek;
import java.util.Map;
import java.time.*;

public class Student {
	String studID;
	private String name;
	private String email;
	private String mobile;
	static Map<String,Student> studs;
	
	
	Student (String name, String studID, String email, String mobile ){
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.studID = studID;
		
		studs.put(studID, this);
	}
	
	void takeAppointment(long timestamp, int docID, String day, String time){
		//Doctor doc = Doctor.docs.get(docID);
		DayOfWeek d=null;
		switch(day){
			case "M":
				d=DayOfWeek.MONDAY;
				break;
			case "T":
				d=DayOfWeek.TUESDAY;
				break;
			case "W":
				d=DayOfWeek.WEDNESDAY;
				break;
			case "Th":
				d=DayOfWeek.THURSDAY;
				break;
			case "F":
				d=DayOfWeek.FRIDAY;
				break;
			case "Sa":
				d=DayOfWeek.SATURDAY;
				break;
			case "Su":
				d=DayOfWeek.SUNDAY;
				break;
		}
		
		String[] t = time.split(":");
		int hour = Integer.parseInt(t[0]);
		int min = Integer.parseInt(t[1]);
		
		Doctor doc = AppData.docs.get(docID);
		
		Appointment appt = new Appointment(timestamp,this,doc,d,hour,min);
	}
	
	
	
	
}