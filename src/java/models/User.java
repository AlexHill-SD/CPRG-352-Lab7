/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author BritishWaldo
 */
public class User
{
    private String email;
    private String firstName;
    private String lastName;
    protected String password;
    
    private int userRole;
    
    private boolean active;

    public User()
    {
        this.email = "-1";
        this.active = false;
        this.firstName = "-1";
        this.lastName = "-1";
        this.password = "-1";
        this.userRole = -1;
    }

    public User(String inputEmail, boolean inputActive, String inputFirstName, String inputLastName
                    , String inputPassword, int inputUserRole)
    {
        this.email = inputEmail;
        this.active = inputActive;
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.password = inputPassword;
        this.userRole = inputUserRole;
    }
    
    public User(String inputEmail, int inputActive, String inputFirstName, String inputLastName
                    , String inputPassword, int inputUserRole)
    {
        this.email = inputEmail;
        
        if (inputActive == 1)
        {
            this.active = true;
        }
        else
        {
            this.active = false;
        }
        
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.password = inputPassword;
        this.userRole = inputUserRole;
    }

    public User(String inputEmail)
    {
        this.email = inputEmail;
        this.active = false;
        this.firstName = null;
        this.lastName = null;
        this.password = null;
        this.userRole = -1;
    }

    public void setEmail(String inputEmail)
    {
        this.email = inputEmail;
    }

    public void setFirstName(String inputFirstName)
    {
        this.firstName = inputFirstName;
    }

    public void setLastName(String inputLastName)
    {
        this.lastName = inputLastName;
    }

    public void setPassword(String inputPassword)
    {
        this.password = inputPassword;
    }

    public void setUserRole(int inputUserRole)
    {
        this.userRole = inputUserRole;
    }

    public void setActive(boolean inputActive)
    {
        this.active = inputActive;
    }

    public String getEmail()
    {
        return this.email;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getPassword()
    {
        return this.password;
    }

    public int getUserRole()
    {
        return this.userRole;
    }

    public boolean isActive()
    {
        return this.active;
    }

    @Override
    public String toString()
    {
        return "User email = " + this.getEmail() + " active = " + this.isActive() 
                    + " first name = " + this.getFirstName() + " last name = " 
                    + this.getLastName() + " password = " + this.getPassword()
                    + " role = " + this.getUserRole();
    }
}