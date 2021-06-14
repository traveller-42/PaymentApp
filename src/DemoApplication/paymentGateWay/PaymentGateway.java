package DemoApplication.paymentGateWay;

import DemoApplication.EPaymentMethod;
import DemoApplication.model.IPaymentDetails;
import DemoApplication.processor.IPaymentProcessor;

public class PaymentGateway implements IPaymentGateway{
    IPaymentGateway currentPaymentGateway ;
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        switch (_ePaymentMethod){
            case BKASH:
                currentPaymentGateway=new BkashPaymentGateway();
                return currentPaymentGateway;
            case MASTER_CARD:
                currentPaymentGateway=new MasterCardPaymentGateway();
                return currentPaymentGateway;
            case VISA:
                currentPaymentGateway=new VisaPaymentGateway();
                return  currentPaymentGateway;
            case AMEX:
                currentPaymentGateway=new AmexPaymentGateway();
                return currentPaymentGateway;
            case PAYPAL:
                currentPaymentGateway=new PaypalPaymentGateway();
                return currentPaymentGateway;
            default:
                 throw new RuntimeException("Payment GateWay NOt FOUnd .Invalid");
        }
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        if(currentPaymentGateway!=null){
            return this.currentPaymentGateway.withPaymentDetails(_paymentDetails);
        }
        else{
            throw new RuntimeException("Invalid Payment Gateway");
        }
    }
}
