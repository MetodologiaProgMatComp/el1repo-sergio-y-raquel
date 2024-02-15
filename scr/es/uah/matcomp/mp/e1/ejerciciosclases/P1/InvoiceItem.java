package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class InvoiceItem {
    String ID;
    String desc;
    int qty;
    double unitPrice;
    public void invoiceItem(String ID,String desc,int qty,double uP){
        this.desc=desc;
        this.ID=ID;
        this.qty=qty;
        this.unitPrice=uP;
    }

    public String getID() {
        return ID;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }

    public String toString() {
        return "InvoiceItem{" +
                "ID='" + ID + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
