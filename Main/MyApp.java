package Main;
import java.util.Scanner;
import DVDSaleCalculate;
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        boolean oldMovie = scan.nextBoolean();
        int price = DVDSaleCalculate(oldMovie,age);
    }
}
