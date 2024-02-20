import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,centerAngle;
        double pi=3.14, area, environment, slicearea;

        Scanner input=new Scanner(System.in);
        System.out.print("Yarıçap Değerini Giriniz : ");
        r=input.nextInt();

        area=pi * r * r;
        environment= 2 * pi * r;


        System.out.println("Lütfen Daire açısını giriniz:  ");
        centerAngle = input.nextInt();

        slicearea = (pi * (r*r) * centerAngle)/360;

        System.out.println("Dairenin alanı: "+area);
        System.out.println("Dairenin Çvresi : "+environment);
        System.out.println("Daire Dilim Parçası : " + slicearea);
    }
}