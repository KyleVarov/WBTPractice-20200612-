package Calculation;

/**
 * 렌탈하는 DVD�?� 할�?�여부�? 따�?� 요금�?� 계산해주는 메소드�?�다.
 * 
 * @author (박채린 , �?�와사키메구미 , 마츠바�?�케�?�토) 
 * @version (2020.06.11)
 */
public class DVDSaleCalculate
{
    /**
     * @param
     * Date = 구작(대여시작�?�로부터 6개월�?��? 경과�?� 작품) �?�지 아닌지 �?단한 값
     * (True = 구작�?� 경우 / False = 구작�?� 아�?경우)
     * age = 나�?�값
     * charge = 요금
     * @return = 할�?��?� �?용�?� 후�?� 요금
     */
    boolean Date = true;
    int age = 0;
    int charge = 5000;
    
    public int DVDSaleCalculate(boolean Date, int age){
        if (Date == true){
             charge = charge / 2;
        }
        else{
            if(age < 19){
                charge = charge / 10 * 9;
            }
            else if(age > 64){
               charge = charge / 5 * 4;
            }
            else{
               charge = charge;
            }
        }
        return charge;
    }
}
