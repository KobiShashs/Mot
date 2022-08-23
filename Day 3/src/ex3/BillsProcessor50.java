package families.behavioral.demo8_chain_of_responsibility.ex2;

public class BillsProcessor50 extends MoneyProcessor {

    public BillsProcessor50(MoneyProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void processWithdrawRequest(int amount) {
        int bills = amount / 50;
        if (bills > max)
            bills = max;
        amount -= bills * 50;
        System.out.println("50 NIS bills - " + bills);
        if (amount > 0 && nextProcessor != null) {
            nextProcessor.processWithdrawRequest(amount);
        }
    }

}
