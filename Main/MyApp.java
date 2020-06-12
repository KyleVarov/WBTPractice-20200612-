package Main;
import java.util.Scanner;
import Calculation.*;
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main(String[] args){
        System.out.println("자기 나이를 입력하세요:");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("DVD는 구작품인가요? 구작품이면 'true'입력하고 아니면 'false'입력하세요:");
        boolean oldMovie = scan.nextBoolean();
        DVDSaleCalculate dSC = new DVDSaleCalculate();
        int price = dSC.DVDSaleCalculate(oldMovie,age);

        System.out.println("할인가격: " + price);
    }
}
