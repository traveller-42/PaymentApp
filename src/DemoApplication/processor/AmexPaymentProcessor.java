package DemoApplication.processor;

import DemoApplication.model.IPaymentDetails;

public class AmexPaymentProcessor implements IPaymentProcessor {
    private final IPaymentDetails paymentDetails;
    public AmexPaymentProcessor(IPaymentDetails paymentDetails) {
        this.paymentDetails=paymentDetails;
    }

    @Override
    public void process() {

        System.out.println("Amex not yet implemented");
    }
}
