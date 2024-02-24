package es.uah.matcomp.mp.e1.ejerciciosclases.P1.Clases;

public class InvoiceItem {
    private final String ID;
    private final String desc;
    private int qty;
    private double unitPrice;

    /////////////////////////

    public InvoiceItem(String ID, String desc, int qty, double unitPrice) {
        this.ID = ID;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    ////////////////////////

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

    public double getTotal() {
        return unitPrice * qty;
    }

    public String toString() {
        return "InvoiceItem{" + "ID= " + ID +
                ", desc= " + desc +
                ", qty= " + qty +
                ", unitPrice= " + unitPrice +
                '}';
    }
}
