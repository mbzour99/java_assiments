package caresoftinterfaces.one;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin,HIPAACompliantUser {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    public AdminUser(Integer employeeID, String role, ArrayList<String> securityIncidents) {
		super();
		this.employeeID = employeeID;
		this.role = role;
		this.securityIncidents = securityIncidents;
	}
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters

	
//	______________________________-
	
	public AdminUser(Integer ida) {
		super(ida);
	}
   public AdminUser(Integer employeeID ,String role) {
	   super();
	   this.employeeID=employeeID;
	   this.role=role;
   }
	@Override
	public boolean assignPIN(Integer pin) {
		String x=pin+"0";
		if(x.length()<7) {
			return false;
		}
		return true; 
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
	    ArrayList<String> repo=new ArrayList<String>();
	    repo.add(authIncident("note1","PAtiontName1"));
	    
		return repo;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID != id) {
			String repo= authIncident("note1","PAtiontName1");
			return false;
		}
		return true;
	}
	
	
	public String authIncident(String notes, String patientName) {
	    String report ="";
	    report +="Patient Name:"+ patientName;
	    report +="Notes:"+notes;
	    return report;
	}
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}
     
}
