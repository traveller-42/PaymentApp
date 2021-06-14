package DemoApplication.paymentGateWay;

import DemoApplication.EPaymentMethod;
import DemoApplication.model.IPaymentDetails;
import DemoApplication.processor.IPaymentProcessor;
import DemoApplication.processor.AmexPaymentProcessor;

public class AmexPaymentGateway implements IPaymentGateway{

    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("AmexPaymentGateway Selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new AmexPaymentProcessor(_paymentDetails);

    }
}
