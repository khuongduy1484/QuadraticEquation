import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public  QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b*b -4*a*c;
    }
    public double getRoot1(double delta){
        return (-b+Math.sqrt(delta))/ (2*a);
    }
    public double getRoot2(double delta){
        return (-b-Math.sqrt(delta))/ (2*a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c : ");
        System.out.print("Enter a ");
        double a = scanner.nextDouble();
        System.out.print("Enter b ");
        double b = scanner.nextDouble();
        System.out.print("Enter c ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation =new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta> 0){
            double root1 = quadraticEquation.getRoot1(delta);
            double root2 = quadraticEquation.getRoot2(delta);
            System.out.printf("Equation has two root : %f and %f",root1,root2);
        }
        else if (delta ==0){
             double root = quadraticEquation.getRoot1(delta);
            System.out.printf("Equation has one root : %f",root);
        }
        else {
            System.out.println("Equation has no root");
        }

    }
}
