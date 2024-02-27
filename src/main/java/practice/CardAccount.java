package practice;

public class CardAccount extends BankAccount {
    public static final double COMMISSION = 0.01;


    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);

    @Override
    public void take(double amountToTake) {
        double commissionSum = amountToTake * COMMISSION;
        amountToTake += commissionSum;
        super.take(amountToTake);
        System.out.println("Комиссия составила " + commissionSum + (commissionSum < 1 ? " коп." : " руб.") + '\n');
    }
}
