package basicprograms;
public class Calculate_Goods_ServiceTax {
    //A shopkeeper sells an article for rs 10000.If the rate of tax under GST is 10%,Calculate and display the
    // tax and amount paid by the customer
    public static void main(String[] args) {

        int pr = 10000;
        double gst;
        double amt;
        gst = pr * 10.0 / 100.0;
        amt = pr + gst;
        System.out.println("GST=" + gst);
        System.out.println("Amount to Pay=" + amt);
    }
}
