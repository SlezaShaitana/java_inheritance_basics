package practice;

public class BankAccount {

  private double balance;

  public double getAmount() {
    //TODO: реализуйте метод и удалите todo
    // верните значение количества денег не счету
    return balance;
  }

  public void put(double amountToPut) {
    //TODO: реализуйте метод и удалите todo
    // метод зачисляет деньги на счет
    if (amountToPut < 0) {
      System.out.println("Недопустимая сумма!" + '\n');
      return;
    }
    balance += amountToPut;
    System.out.println("Пополнение +" + amountToPut + " руб." + '\n');
  }

  public void take(double amountToTake) {
    //TODO: реализуйте метод и удалите todo
    // метод списывает деньги со счета
    if (amountToTake > balance) {
      System.out.println("Списание на сумму " + amountToTake + " руб. не удалось."
              + " На балансе недостаточно средств!" + " Ваш баланс " + balance + " руб." + '\n');
      return;
    }
    balance -= amountToTake;
    System.out.println("Списание -" + amountToTake + " руб." + '\n');
  }
}
