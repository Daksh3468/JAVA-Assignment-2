// Name :- Daksh Bangoria
// Roll-no :-21ce007
// Aim :-Design a class named Circle containing following attributes and behavior.
// • One double data field named radius. The default value is 1.
// • A no-argument constructor that creates a default circle.
// • A Single argument constructor that creates a Circle with the specified radius.
// • A method named getArea() that returns area of the Circle.
// • A method named getPerimeter() that returns perimeter of it.
// Git-hub repository: https://github.com/Daksh3468/JAVA-Assignment-2
import java.util.*;
public class Daksh2_1main {
    public static void main(String[] args) {
        double radius,area,peri;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the radius of the circle  :");
        radius = s.nextDouble();
        Daksh2_1 d1 = new Daksh2_1(radius);//creatint object of the Daksh2_1 package.
        area = Daksh2_1.getArea();//calls the area method of the Daksh2_1 package
        peri = Daksh2_1.getPerimeter();//calls the area method of the Daksh2_1 package
        System.out.println("The area of the given circle is  :"+area);
        System.out.println("The perimeter of the given circle is  :"+peri);
    }
}