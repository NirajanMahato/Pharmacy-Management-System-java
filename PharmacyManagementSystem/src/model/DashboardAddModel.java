package model;

public class DashboardAddModel {
   int rate, quantity, total;
   String medicinename;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename;
    }
    public DashboardAddModel(String medicinename,int rate , int quantity , int total)
    {
        this.medicinename=medicinename;
        this.rate=rate;
        this.quantity=quantity;
        this.total=total;      
    }  
}
