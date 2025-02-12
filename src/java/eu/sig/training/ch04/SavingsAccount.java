package eu.sig.training.ch04;

public class SavingsAccount extends Account {
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private CheckingAccount registeredCounterAccount;

    @Override
    public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
        Transfer result = super.makeTransfer(counterAccount, amount); // <2>

        if (!result.getCounterAccount().equals(this.registeredCounterAccount))
            throw new BusinessException("Counter-account not registered!");

        return result;
    }
}
