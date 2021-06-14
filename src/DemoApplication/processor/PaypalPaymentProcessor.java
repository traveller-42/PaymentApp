package DemoApplication.processor;

import DemoApplication.model.IPaymentDetails;

public class PaypalPaymentProcessor implements IPaymentProcessor {
    private final IPaymentDetails paymentDetails;
    public PaypalPaymentProcessor(IPaymentDetails paymentDetails) {
      this.paymentDetails=paymentDetails;
    }

    @Override
    public void process() {
        System.out.println("Paypal Doesn't Support Your Region");
    }
}
