package model;

public class DashboardSaveModel {
   int userid;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
   String name,address;
    public DashboardSaveModel(String name,String address,int userid)
    {
        this.name=name;
        this.address=address;
        this.userid = userid;
    }  
}
