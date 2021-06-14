package DemoApplication.processor;

import DemoApplication.model.IPaymentDetails;

public class VisaPaymentProcessor implements IPaymentProcessor {
    public VisaPaymentProcessor(IPaymentDetails paymentDetails) {

    }

    @Override
    public void process() {
        System.out.println("Visa Payment Successful");
    }
}
