package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_3;

public class Point3D extends Point2D{
    float z=0.0f;

    /////////////////
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        super();
    }
    /////////////////


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),z};
    }

    public String getArrayToString(float[] lista){
        float x=lista[0];
        float y=lista[1];
        float z=lista[2];
        return "{"+x+","+y+","+z+"}";
    }
    @Override
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+z+")";
    }
}
