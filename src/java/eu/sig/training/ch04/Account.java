package eu.sig.training.ch04;

public class Account {
    private static final float INTEREST_PERCENTAGE = 0.00f;
    private final Money balance = new Money();

    public static CheckingAccount findAcctByNumber(String number) {
        return new CheckingAccount();
    }

    // tag::isValid[]
    public static boolean isValid(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum = sum + (9 - i) * Character.getNumericValue(number.charAt(i));
        }
        return sum % 11 == 0;
    }
    // end::isValid[]

    public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
        if (!isValid(counterAccount)) throw new BusinessException("Invalid account number!");

        CheckingAccount acct = Account.findAcctByNumber(counterAccount);
        return new Transfer(this, acct, amount);
    }
    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
