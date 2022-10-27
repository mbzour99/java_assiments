package caresoftinterfaces.one;

import java.util.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser{
	private ArrayList<String> patientNotes;
	public Physician(Integer pid) {
		super(pid);
	}

	@Override
	public boolean assignPin(int pin) {
//		if(this.pin=pin) {
//			return true;
//		}
		return true;
	}

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID == id) {
			return true;
		}
		return false;
	}

	@Override
	public boolean assignPIN(Integer pin) {
		String x=pin+"0";
		if(x.length()<5) {
			return false;
		}
		return true; 
	}
	
	public void newPatientNotes(String notes, String patientName, Date date) {
	    String report = String.format(
	        "Datetime Submitted: %s \n", date);
	    report += String.format("Reported By ID: %s\n", this.id);
	    report += String.format("Patient Name: %s\n", patientName);
	    report += String.format("Notes: %s \n", notes);
	    this.patientNotes.add(report);
	}

}


//... imports class definition...

// Inside class:    


// TO DO: Constructor that takes an ID
// TO DO: Implement HIPAACompliantUser!



// TO DO: Setters & Getters

