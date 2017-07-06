package praesentation;



import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import businesslogic.ArztManager;
import data.Arzt;


@ManagedBean(name="navigationBean")
@SessionScoped
public class NavigationBean {
	
	public String meinePatienten(){
		// vorher muss noch geprüft werden, ob der User eingeloggt ist
		return "success";
	}
	
	public String neuerPatient(){
		// vorher muss noch geprüft werden, ob der User eingeloggt ist
		return "success";
	}
	
	public String aerzte(){
		return "success";
	}
	
	public String logout(){
		// vorher muss noch geprüft werden, ob der User eingeloggt ist
		return "success";
	}
	
}
