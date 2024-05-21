import java.util.Scanner;

class Line{
    private double x1, x2, y1, y2;
    
    public Line(double x1, double y1, double x2, double y2){
        this.x1=x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length(){
        // length of line get from Pythagorean theorem
        return Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
    }
}

public class LineComparison {
    public static double setCordinates() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First line x1  cordinate: ");
        int x1 = scan.nextInt();
        System.out.print("Enter First line y1  cordinate: ");
        int y1 = scan.nextInt();
        System.out.print("Enter Second line x1 cordinate: ");
        int x2 = scan.nextInt();
        System.out.print("Enter Second line y2 cordinate: ");
        int y2 = scan.nextInt();
        scan.close();
        return new Line(x1, y1, x2, y2).length();
    }
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program");
        double lineLength1 = setCordinates();
        System.out.println("Length of the line segment: " + lineLength1);
        double lineLength2 = setCordinates();
        System.out.println("Length of the line segment: " + lineLength2);
        if (lineLength1 == lineLength2){
            System.out.println("Length of  both lines are equal");
        }
    }
}