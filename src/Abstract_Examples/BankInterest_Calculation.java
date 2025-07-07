package Abstract_Examples;
//Abstract Class
abstract class Bank {
    abstract double getInterestRate();
    }
    //SBI Class Extending Bank
class SBI extends Bank {
    @Override
        double getInterestRate() {
        return 6.5;
    }
    }
    //HDFC class extending Bank
class HDFC extends Bank{
    @Override
        double getInterestRate(){
        return 7.0;
    }
    }
//Axis Class Extending Bank
class Axis extends Bank{
    @Override
    double getInterestRate() {
        return 7.1;
    }
}
public class BankInterest_Calculation {
    public static void main(String[] args) {
        Bank sbi=new SBI();
        Bank hdfc=new HDFC();
        Bank axis=new Axis();
        System.out.println("SBI Bank Interest Rate is:"+ sbi.getInterestRate()+"%");
        System.out.println("HDFC Bank Interest Rate is:"+ hdfc.getInterestRate()+"%");
        System.out.println("Axis Bank Interest Rate is "+ axis.getInterestRate()+"%");
    }
}
