import exception.CustomIllegalArgumentException;
import exception.CustomInsufficientFundsException;

public class Service extends Account {


    public Service(int balance) {
        super(balance);
    }

    /**
     * Метод создания объекта класса
     *
     * @param balance
     * @return
     * @throws CustomIllegalArgumentException
     */
    public static Service create(int balance) throws CustomIllegalArgumentException {
        if (balance < 0) {
            throw new CustomIllegalArgumentException("Попытка создать счет с отрицательным начальным балансом!");
        }
        return new Service(balance);
    }

    /**
     * Метод, описывающий внесение средств на счёт
     *
     * @param amount сумма внесения
     * @throws CustomIllegalArgumentException
     */
    public void makeDebit(int amount) throws CustomIllegalArgumentException {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new CustomIllegalArgumentException("Попытка внести депозит с отрицательной суммой!");
        }
    }


    /**
     * Метод, описывающий снятие денежных средств
     *
     * @param amount сумма снятия
     * @throws CustomInsufficientFundsException
     */
    public void makeWithdrawal(int amount) throws CustomInsufficientFundsException {
        if (amount < this.balance) {
            this.balance -= amount;
        } else {
            throw new CustomInsufficientFundsException("Недостаточно средств! Попытка снять средства, сумма которых превышает текущий баланс!");
        }
    }


    @Override
    public void printBalance() {
        System.out.printf("Баланс счета: " + balance);
    }

}
