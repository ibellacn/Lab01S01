package Modules;

import Services.Authenticable;

public class User implements Authenticable{

    private Integer id;
    private String name;
    private String email;
    private String password;
    
    public User() {
      
    }

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Boolean login (String email, String password) {
    	if(email == this.email && password == this.password) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public void logout () {
    	
    }
    
}
