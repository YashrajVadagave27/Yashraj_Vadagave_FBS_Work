abstract class Payment {
    int paymentId;
    double amount;
    String payerName;
    String status = "PENDING";
    
    Payment() {
        this.paymentId = 103;
        this.amount = 2000;
        this.payerName = "Raj";
    }
    
    Payment(int paymentId, double amount, String payerName) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.payerName = payerName;
    }

    
    int getPaymentId() {
		return this.paymentId;
	}

	void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	double getAmount() {
		return this.amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}

	String getPayerName() {
		return this.payerName;
	}

	void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	void printSummary() {
        System.out.println("---- Payment Summary ----");
        System.out.println("Payment ID: " + this.paymentId);
        System.out.println("Payer Name: " + this.payerName);
        System.out.println("Amount: " + this.amount);
        System.out.println("Status: " + this.status);
        System.out.println("\n");
        
    }

    final void process() {
        if (validate()) {
            deductAmount();
            sendNotification();
            this.status = "SUCCESS";
        } else {
            this.status = "FAILED";
        }
    }

    abstract boolean validate();
    abstract void deductAmount();
    abstract void sendNotification();
    
}//payment ends here

class CardPayment extends Payment {
    String cardNumber;
    String cvv;
    
    CardPayment() {
        super();
        this.cardNumber = "7856912365153245";
        this.cvv = "277";
    }
    
    CardPayment(int paymentId, double amount, String payerName, String cardNumber, String cvv) {
        super(paymentId, amount, payerName);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }    
    
    String getCardNumber() {
		return this.cardNumber;
	}

	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	String getCvv() {
		return this.cvv;
	}

	void setCvv(String cvv) {
		this.cvv = cvv;
	}

	boolean validate() {
        if (this.cardNumber.length() == 16 && this.cvv.length() == 3 && this.amount > 0) {
            return true;
        }
        System.out.println("Card Payment Validation Failed!");
        return false;
    }

    void deductAmount() {
        System.out.println("Amount Rs." + this.amount + " deducted from Card.");
    }

    void sendNotification() {
        System.out.println("SMS: Card Payment Successful for " + this.payerName);
    }
}//card payment ends here

class UPIPayment extends Payment {
    String upiId;

    UPIPayment() {
        super();
        this.upiId = "yash@oksbi";
    }
    
    UPIPayment(int paymentId, double amount, String payerName, String upiId) {
        super(paymentId, amount, payerName);
        this.upiId = upiId;
    }
    
    String getUpiId() {
		return this.upiId;
	}

	void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	boolean validate() {
        if (this.upiId.contains("@") && this.amount >= 1 && this.amount <= 100000) {
            return true;
        }
        System.out.println("UPI Payment Validation Failed!");
        return false;
    }

    void deductAmount() {
        System.out.println("Amount Rs." + this.amount + " deducted via UPI.");
    }

    void sendNotification() {
        System.out.println("SMS: UPI Payment Successful for " + this.payerName);
    }
}//upipayment ends here

public class PaymentMain {
    public static void main(String[] args) {
    	
    	Payment[] p = new Payment[4];
    	
    	p[0] = new CardPayment();
        p[1] = new CardPayment(101, 2500, "Yashraj", "1234567890123456", "123");
        p[2] = new UPIPayment();
        p[3] = new UPIPayment(102, 999, "Akash", "akash@oksbi");
        
        for(int i=0; i<p.length; i++) {
        	p[i].process();
            p[i].printSummary();
        }

    }
}