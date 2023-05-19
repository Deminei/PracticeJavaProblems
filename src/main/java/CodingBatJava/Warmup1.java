package CodingBatJava;

public class Warmup1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {//I figured if it's not! a weekday or|| vacation
            return true;           // then its true or defaults to false. Thankfully I remembered
        }                          // these operators.
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile) {//If both monkeys doing the same thing, we are truly in trouble lol
            return true;      //I feel like I understand if-else statements
        }else{                //and comparison operators to a decent degree,
            return false;     //I tend to default to them.
        }
    }

    public int sumDouble(int a, int b) {
        if(a == b){     //This one made me think real hard about why I can't use
            int c = a+b;//certain arithmetic operators on data types or because I was using
            return c*2; //the wrong kind of 'wrapper', thank goodness  I recalled some
        }else{          //method variable usage! Declared a new integer c that equals
            return a+b; //the sum of a+b THEN I could return the double sum. Ah, math and stuff.
        }

    }
    public int diff21(int n) {
        if(n>21) {
            int c = 21-n;
            return c*-2;//*I kept trying c*2 until I noticed the
        } else {        //only tests not passed should have resulted in negative numbers.
            return 21-n;//Math is hard sometimes lol
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour <7 || hour >20));//Honestly could not figure this one out on my own,
    }                               // I folded and had to show the solution, but now I feel silly for not using extra().

    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10){//I like comparison operators, but if a or b are 10
            return true;       //it's true
        }else if(a+b ==10){     //or if the sum of a and b is 10 also true
            return true;        //default if none of those arguments are valid, false
        }
        return false;
    }

    public boolean nearHundred(int n) {       // Another example of me
        return ((Math.abs(100 - n) <= 10) ||  //NOT using parantheses right at first,
                (Math.abs(200 - n) <= 10));   //I had to show the solution for this one too.
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {             //Did I mention how comparison operators
            return (a < 0 && b < 0);//treat me so good? I love em, I understand them
        }                           //Why am I bad at math? I wish I knew.
        return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }

    public String notString(String str) {
        if(str.equals("not") || str.equals("not bad")){
            return str;     //Well they were kind enough to provide
        }                   //the suggestion to use .equals()
        return "not "+str;  //from there it was easy-peasy comparison operators lol
    }

}
