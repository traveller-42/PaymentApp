package DemoApplication.paymentGateWay;

import DemoApplication.EPaymentMethod;
import DemoApplication.model.IPaymentDetails;
import DemoApplication.processor.IPaymentProcessor;
import DemoApplication.processor.PaypalPaymentProcessor;

public class PaypalPaymentGateway implements IPaymentGateway{

    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("PaypalPaymentGateway Selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new PaypalPaymentProcessor(_paymentDetails);
    }
}
