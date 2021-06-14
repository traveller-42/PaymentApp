package DemoApplication;
import DemoApplication.model.BkashPaymentDetails;
import DemoApplication.model.IPaymentDetails;
import DemoApplication.model.MasterCardPaymentDetails;
import java.util.Scanner;
public class Application extends  AbstractPaymentProcessor{
    @Override
    void run() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Select Payment Method");
        System.out.println("1 - BKASH");
        System.out.println("2 - MASTER_CARD");
        System.out.println("3 - VISA");
        System.out.println("4- AMEX");
        System.out.println("5 - PAYPAL");

        int i = scanner.nextInt();
        IPaymentDetails  paymentDetails;
        switch (i){
            case 1:
                System.out.println("Enter fromMobile");
                String fromMobile=scanner.next();
                System.out.println("Enter toMobileNo");
                String toMobileNo=scanner.next();
                System.out.println("Enter Pin");
                String pin=scanner.next();
                paymentDetails=new BkashPaymentDetails(fromMobile,toMobileNo,pin);
                break;
            default:
                System.out.println("Enter fromCardNo");
                String fromCardNo=scanner.next();
                System.out.println("Enter toAccountNo");
                String toAccountNo=scanner.next();
                System.out.println("Enter expirationDate");
                String expirationDate=scanner.next();
                System.out.println("Enter cvv");
                String cvv=scanner.next();
                paymentDetails = new MasterCardPaymentDetails(fromCardNo,toAccountNo,expirationDate,cvv);
                break;
        }
        this.setPaymentDetails(paymentDetails);
        this.process(i);
    }

    public static void main(String[] args) {
        Application application=new Application();
        application.run();
    }
}
