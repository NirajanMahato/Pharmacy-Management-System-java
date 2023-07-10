package model;

public class ForgetPasswordModel {
    String username,password,schoolname;
    public ForgetPasswordModel(String username,String password,String schoolname)
    {
        this.username=username;
        this.password=password;
        this.schoolname=schoolname;    
    }
    //getter setter method
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

}
