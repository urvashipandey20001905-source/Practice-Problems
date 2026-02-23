public class UniversityFeeDiscount {

    public static void main(String[] args) {

        double fee = 125000;           // Original course fee
        double discountPercent = 10;   // Discount percentage

        double discount = (fee * discountPercent) / 100;   // Calculate discount
        double finalAmount = fee - discount;               // Fee after discount

        System.out.println(
                "The Original Fee is INR " + fee + "\n" +
                "The Discount Amount is INR " + discount + "\n" +
                "The Discounted Price to Pay is INR " + finalAmount
        );
    }
}