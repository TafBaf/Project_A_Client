package jsfBean;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.namespace.QName;

import controller.InfoProvider;
import controller.InfoProviderService;
import data.Employee;

@ManagedBean
@SessionScoped
public class ViewEmployeesManagedBean {
	
	private List<Employee> employees = new ArrayList<Employee>();
    private static final QName SERVICE_NAME = new QName("http://controller/", "InfoProviderService");
    
	public ViewEmployeesManagedBean(){
	}

	@PostConstruct
	public void populateEmployeeList(){

        URL wsdlURL = InfoProviderService.WSDL_LOCATION;
        InfoProviderService ss = new InfoProviderService(wsdlURL, SERVICE_NAME);
        InfoProvider port = ss.getInfoProviderPort();  
        
        // System.out.println("Invoking getInfo...");
	
		for(int i = 1 ; i <= 10 ; i++){
	        java.lang.String _getInfo__return = port.getInfo("<-" + i + "->");
			Employee emp = new Employee();
			emp.setEmployeeId(String.valueOf(i));
			emp.setEmployeeName(_getInfo__return + i);
			this.employees.add(emp);
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
