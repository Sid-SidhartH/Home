import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.Scanner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MainTest {
    Biggest big=new Biggest();
    Circle cr=new Circle();
    Polymorphism poly=new Polymorphism();
    Bmi bmi=new Bmi();
    Armstrong arm=new Armstrong();
    Ldate ldate=new Ldate();

    @Test
    public void checkMax() {
        assertEquals(40,big.maxElement());
    }
    @Test
    public void checkCircleArea(){
        double result=cr.AreaOfCircle(4);
        assertEquals(50.24,result,2);
    }
    @Test
    public void checkPoly(){
        assertEquals(15,poly.multiply(3,5));
        double ans=poly.multiply(3.5,5.2);
        assertEquals(18.2,ans,2);
    }
    @Test
    public void getBimi(){
//        Scanner sc=new Scanner(System.in);
        double w=55;
        double h=1.7;
        double res1=bmi.calBmi(w,h);
        assertEquals(19.03,res1,2);
    }
    @Test
    public void checkArmstrongTest(){
        assertEquals(1,arm.checkArmstrong(153));
    }
    @Test
    public void longConvertTest(){
        long number= 1346524199000l;
        assertEquals("Sat Sep 01 23:59:59 IST 2012",ldate.longConvert(number));
    }


    }

