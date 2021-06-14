package DemoApplication.paymentGateWay;

import DemoApplication.EPaymentMethod;
import DemoApplication.model.IPaymentDetails;
import DemoApplication.processor.IPaymentProcessor;
import DemoApplication.processor.BkashPaymentProcessor;

public class BkashPaymentGateway implements IPaymentGateway{

    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("BkashPaymentGateway Selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new BkashPaymentProcessor(_paymentDetails);
    }
}
