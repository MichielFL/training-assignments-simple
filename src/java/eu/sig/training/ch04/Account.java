package eu.sig.training.ch04;

public class Account {
    @SuppressWarnings("unused")
    private final Money balance = new Money();
    private float interestPercentage;

    public Account(float interestPercentage) {
        this.interestPercentage = interestPercentage;
    }

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

    public void addInterest(float interestPercentage) {
        Money interest = balance.multiply(interestPercentage);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
