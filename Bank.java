import java.util.Scanner
public class Bank
{
	double amount;
	public Bank()
	{
		this.amount = 10000;
	}
	
	 public void withdraw(double withdrawalam) {
	        String message = (amount >= withdrawalam) ? 
	            "Withdrawal successful" : 
	            "Insufficient balance";
	        
	        if (amount >= withdrawalam) {
	            amount -= withdrawalam;
	        }
	        System.out.println(message);
	    }
	   
	    public void deposit(double depositam) {
	        amount += depositam; 
	    }
	    public double getAmount() {
	    	return amount;
	    }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = 0;
		Bank b = new Bank();
		System.out.Println("Enter amount to be withdrawn:");
		w = sc.nextDouble();
		b.withdraw(w);
		b.deposit(5000);
		System.out.println("Current Balance: Rs." + b.getAmount()); 
	}
}
