import java.time.*;

public class Appointment {
	long timestamp;
	String studID;
	int docID;
	DayOfWeek day;
	LocalTime time;
	
	public Appointment(long timestamp, Student stud, Doctor doc, DayOfWeek day, int hour, int min){
		this.timestamp = timestamp;
		this.studID=stud.studID;
		this.docID=doc.getID();
		this.day=day;
		this.time = LocalTime.of(hour, min);
		
		doc.getAppts().add(time);
	}
	
	



}
