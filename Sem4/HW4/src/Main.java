import exception.*;
public class Main {
    public static void main(String[] args) {
        try {
            Service account = Service.create(900);
            account.printBalance();
            System.out.println();
            account.makeDebit(5000);
            account.printBalance();
            System.out.println();
            account.makeWithdrawal(100);
            account.printBalance();

        } catch (CustomIllegalArgumentException ex){
            System.out.println(ex.getMessage());
        } catch (CustomInsufficientFundsException e) {
            System.out.printf(e.getMessage(), e.getFirstArgument(), e.getSecondArgument());
        }

    }
}