package hrprogram;

public class CourseCoordinator extends User{
    
	private String employeeNum;
	private String name;
	private String email;
	private String phone; 
	
    public CourseCoordinator(String userName, String password, String employeeNum, String args_name, String args_email, String args_phone) {
        super(userName, password, employeeNum,"CC");
     
        //System.out.println("here in CourseCoordinator");        
        name = args_name;
        email = args_email; 
        phone = args_phone; 
    }
    
    public String getName(){
    	return name; 
    }
    
    public String getEmail(){
    	return email; 
    }
    
    public String getPhone(){
    	return phone; 
    }
    
   
}
