package praesentation;

import java.io.Serializable;
import java.sql.SQLException;

import data.Patient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import businesslogic.PatientenManager;

@ManagedBean(name="updatePatientenBean")
@SessionScoped
public class UpdatePatientenBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	PatientenManager patientenManager=new PatientenManager();
	
	private String name;
	private String neueDiagnose;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getDiagnose(){
		return neueDiagnose;
	}
	
	public void setDiagnose(String neueDiagnose){
		this.neueDiagnose = neueDiagnose;
	}
	

	public String updatePatient(){
		if(patientenManager.updatePatient(this.name, this.neueDiagnose))
			return "success";
		else
			return "failure";
	}
}