package eu.sig.training.ch04;

public class Transfer {
    CheckingAccount counterAccount;

    @SuppressWarnings("unused")
    public Transfer(Account acct1, Account acct2, Money m) {}

    public CheckingAccount getCounterAccount() {
        return this.counterAccount;
    }
}
