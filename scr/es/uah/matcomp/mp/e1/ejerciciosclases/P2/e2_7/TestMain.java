package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_7;

public class TestMain {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(1,2,3,4);
        int[] lBegin = l1.getBeginXY();
        int[] lEnd = l1.getEndXY();
        System.out.println(l1+"\n"+
                l1.getBegin()+ "\n"+
                l1.getEnd()+ "\n"+
                l1.getBeginX()+ "\n"+
                l1.getBeginY()+"\n"+
                l1.getEndX()+"\n"+
                l1.getEndY()+"\n"+
                l1.getArrayToString(lBegin)+"\n"+
                l1.getArrayToString(lEnd)+"\n");

        l1.setBegin(new MyPoint(5,6));
        l1.setEnd(new MyPoint(7,8));
        System.out.println(l1.getBegin()+ "\n"+
                l1.getEnd()+ "\n");

        l1.setBeginX(9);
        l1.setBeginY(10);
        l1.setEndX(11);
        l1.setEndY(12);
        System.out.println(l1.getBegin()+ "\n"+
                l1.getEnd()+ "\n");

        l1.setBeginXY(13,14);
        l1.setEndXY(15,16);
        System.out.println(l1.getBegin()+ "\n"+
                l1.getEnd()+ "\n");

        MyLine l2 = new MyLine(new MyPoint(4,0),new MyPoint(4,4));
        System.out.println(l2);
        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
    }
}
