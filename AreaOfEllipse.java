package areaOfCircle;

public class AreaOfEllipse {
	
	//calculate by add rectangle inside the ellipse
	private static double ellipseArea(int a, int b, int n) {
        double dx = (double)a / (double)n;
        double area = 0;
        for (int i = 1; i < n; i++) {
            double x = (double)i * dx;
            double y = Math.sqrt((1-(x*x)/(a*a))*b*b);       
            area = area + dx*y;   
        }
        return area * 4;
    }
    
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int n = 1000;
        System.out.println("Sum rectangle: " + ellipseArea(a, b, n));
        double area = 3.14 * a * b;
        System.out.println("Use formula: " + area);
    }
}
