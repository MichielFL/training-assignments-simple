package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends Account {
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private CheckingAccount registeredCounterAccount;

    public SavingsAccount(CheckingAccount registeredCounterAccount) {
        super(INTEREST_PERCENTAGE);
        this.registeredCounterAccount = registeredCounterAccount;
    }

    @Override
    public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
        Transfer result = super.makeTransfer(counterAccount, amount); // <2>

        if (!result.getCounterAccount().equals(this.registeredCounterAccount))
            throw new BusinessException("Counter-account not registered!");

        return result;
    }

    public void addInterest() {
        super.addInterest(INTEREST_PERCENTAGE);
    }
}
// end::SavingsAccount[]
