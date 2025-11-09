package week3;

public class distance{
    public static void main(String[] args){
        double x1=4, y1=2;
        double x2=1, y2=6;
        double distance;
        distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.print("Distance Point 1 and Point 2 is: "+distance);
    }
}

