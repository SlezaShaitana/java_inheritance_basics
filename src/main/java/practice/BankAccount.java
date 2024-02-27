package practice;

public class BankAccount {

  private double balance;

  public double getAmount() {
    return balance;
  }

  public void put(double amountToPut) {
    if (amountToPut < 0) {
      System.out.println("Недопустимая сумма!" + '\n');
      return;
    }
    balance += amountToPut;
    System.out.println("Пополнение +" + amountToPut + " руб." + '\n');
  }

  public void take(double amountToTake) {
    if (amountToTake > balance) {
      System.out.println("Списание на сумму " + amountToTake + " руб. не удалось."
              + " На балансе недостаточно средств!" + " Ваш баланс " + balance + " руб." + '\n');
      return;
    }
    balance -= amountToTake;
    System.out.println("Списание -" + amountToTake + " руб." + '\n');
  }
}
