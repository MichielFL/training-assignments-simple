package eu.sig.training.ch04;

// tag::CheckingAccount[]
public class CheckingAccount extends Account {
    private static final float INTEREST_PERCENTAGE = 0.01f;
    private int transferLimit = 100;

    public CheckingAccount() {
        super(INTEREST_PERCENTAGE);
    }
}
// end::CheckingAccount[]
