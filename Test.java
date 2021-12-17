package Square;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,chuvi,dientich;
        System.out.println("Nhap chieu dai : ");
        a = scanner.nextFloat();
        System.out.println("Nhap chieu rong : ");
        b = scanner.nextFloat();
        chuvi = (a+b)*2;
        dientich= a*b;
        System.out.println("Chu vi la :"+chuvi);
        System.out.println("Dien tich la :"+dientich);
        if (a == b){
            System.out.println("Day la hinh vuong");
        }else {
            System.out.println("Day khong phai hinh vuong");
        }
    }
}
