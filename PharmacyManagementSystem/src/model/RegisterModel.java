package model;

public class RegisterModel {
    String fname,lname,email,phone,password,confirm,schoolname;

    public RegisterModel(String fname,String lname,String email, String phone,String password, String confirm,String schoolname)
    {
        this.fname=fname;
        this.lname=lname;
        this.email=email;
        this.phone=phone;
        this.password=password;
        this.confirm=confirm;
        this.schoolname=schoolname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

}
