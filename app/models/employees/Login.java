package models.employees;

import play.data.validation.Constraints.*;



public class Login{
    private String email;
    private String password;

    public String validate(){

        if (Employee.authenticate(email, password) == null){
            return "Invalid user or password.";
        }
        return null;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

}