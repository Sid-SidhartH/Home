import java.util.*;
public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("area of circle is "+ circle.AreaOfCircle(4));
        Armstrong armstrong=new Armstrong();
        int res1=armstrong.checkArmstrong(370);
        if(res1==1){
            System.out.println("given no is Armstrong");
        }
        else{
            System.out.println("not a armstrong no");
        }
        Biggest big=new Biggest();
        System.out.println("max element is "+big.maxElement());
        Bmi bmi=new Bmi();
        System.out.println("input weight and height");
        Scanner sc=new Scanner(System.in);
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        System.out.println("bmi of given input person is "+bmi.calBmi(w,h)+" kg/m2");
        Polymorphism poly=new Polymorphism();
        System.out.println("multiply of int is "+poly.multiply(3,5));
        System.out.println("multiply of float is "+poly.multiply(3.5,5.2));
        Ldate obj=new Ldate();
        long lnumber=1346524199000l;
        obj.longConvert(lnumber);
    }

}
