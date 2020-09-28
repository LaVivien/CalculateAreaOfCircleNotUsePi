package areaOfCircle;

public class AreaOfCircle {
	
	//calculate area by add up rectangle inside the circle
	private static double circleArea(int r, int n) {
        double dx = (double)r / (double)n;
        double area = 0;
        for (int i = 0; i < n; i++) {
            double x = i * dx;
            double y = Math.sqrt(r*r - x*x);         
            area = area + dx*y;          
        }
        return area * 4;
    }
    
    public static void main(String[] args) {
        int r = 10;
        int n = 1000;
        System.out.println("sum rectangle: " + circleArea(r, n));
        double area = 3.14 * r * r;
        System.out.println("use formula : " + area);
    }
}
