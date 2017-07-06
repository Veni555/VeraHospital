package praesentation;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import businesslogic.PatientenManager;
import data.Patient;


@ManagedBean(name="neuerPatientBean")
@SessionScoped
public class NeuerPatientBean {
	private Patient patient = new Patient();
	PatientenManager patientenManager=new PatientenManager();
	public void setPatient(Patient patient){
		this.patient = patient;
	}
	
	public Patient getPatient(){
		return this.patient;
	}
	
	public String save(){
		// neuen Patienten erstellen
		/*try {
			if(patientenManager.addPatient(patient)){
				return "success";
			} else {
				return "failure";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failure":
		}*/
		// zurück zur Übersicht
		return "success";
	}
	
	public String reset(){
		return "newPatient.xhtml";
	}
}
