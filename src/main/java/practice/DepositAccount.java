package practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        lastIncome = LocalDate.now();
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        if (lastIncome.until(LocalDate.now(), ChronoUnit.MONTHS) >= 1) {
            super.take(amountToTake);

        } else {
            System.out.println("Нельзя снимать деньги в течение одного месяца после пополнения" + amountToTake + '\n');
        }

    }
}
