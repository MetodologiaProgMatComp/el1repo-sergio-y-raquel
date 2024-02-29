package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_3;

public class Main {
    public static void main(String[] args){
        Point3D p1=new Point3D(3,3,3);
        p1.setXYZ(4,9.0f,34);
        System.out.println(p1);
        System.out.println(p1.getArrayToString(p1.getXYZ()));

    }
}
