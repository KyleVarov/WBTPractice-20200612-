package Calculation;

/**
 * ë Œíƒˆí•˜ëŠ” DVDì?˜ í• ì?¸ì—¬ë¶€ì—? ë”°ë?¼ ìš”ê¸ˆì?„ ê³„ì‚°í•´ì£¼ëŠ” ë©”ì†Œë“œì?´ë‹¤.
 * 
 * @author (ë°•ì±„ë¦° , ì?´ì™€ì‚¬í‚¤ë©”êµ¬ë¯¸ , ë§ˆì¸ ë°”ë?¼ì¼€ì?´í† ) 
 * @version (2020.06.11)
 */
public class DVDSaleCalculate
{
    /**
     * @param
     * Date = êµ¬ìž‘(ëŒ€ì—¬ì‹œìž‘ì?¼ë¡œë¶€í„° 6ê°œì›”ì?´ìƒ? ê²½ê³¼ë?œ ìž‘í’ˆ) ì?¸ì§€ ì•„ë‹Œì§€ íŒ?ë‹¨í•œ ê°’
     * (True = êµ¬ìž‘ì?¼ ê²½ìš° / False = êµ¬ìž‘ì?´ ì•„ë‹?ê²½ìš°)
     * age = ë‚˜ì?´ê°’
     * charge = ìš”ê¸ˆ
     * @return = í• ì?¸ì?´ ì ?ìš©ë?œ í›„ì?˜ ìš”ê¸ˆ
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
