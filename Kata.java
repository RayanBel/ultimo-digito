import java.math.BigInteger;

public class Kata {
    public static int lastDigit(BigInteger base, BigInteger exp) {
        int lastBase=base.toString().charAt(base.toString().length()-1)-48;
        
        if(exp.compareTo(new BigInteger("1"))==0)
            return lastBase;
        if(exp.compareTo(new BigInteger("0"))==0)
            return 1;
      
        int lastTwoExp=Integer.parseInt((exp.toString().length()>1?
          exp.toString().charAt(exp.toString().length()-2):"")+""+
          exp.toString().charAt(exp.toString().length()-1));
      
        switch(lastBase){
        case 0:
        case 1:
        case 5:
        case 6:
            return lastBase;
        case 4:
            return lastTwoExp%2==0?6:4;
        case 9:
            return lastTwoExp%2==0?1:9;
        case 2:
            switch(lastTwoExp%4){
            case 0:
                return 6;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            }
        case 3:
            switch(lastTwoExp%4){
            case 0:
                return 1;
            case 1:
                return 3;
            case 2:
                return 9;
            case 3:
                return 7;
            }
        case 7:
            switch(lastTwoExp%4){
            case 0:
                return 1;
            case 1:
                return 7;
            case 2:
                return 9;
            case 3:
                return 3;
            }
        case 8:
            switch(lastTwoExp%4){
            case 0:
                return 6;
            case 1:
                return 8;
            case 2:
                return 4;
            case 3:
                return 2;
            }
        }
        return lastBase;
    }      
}
