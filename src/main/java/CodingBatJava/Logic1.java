package CodingBatJava;

public class Logic1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(cigars >= 40 && cigars <= 60){  //Well if you don't know how much I like
            return true;                   //comparison operators, you do know.
        }else if(cigars > 40 && isWeekend){//I realize there is better or shorter ways
            return true;                   //of logicing this logic, but it worked!
        }else if(cigars < 40){              //that's what counts right? ...right!?
            return false;
        }
        return false;
    }
}
