public class Account
{
    private int accountId;
    private String accountType;
    private int balance;
    
    public Account(int accountId,String accountType,int balance)
    {
        this.accountId=accountId;
        this.accountType=accountType;
        this.balance=balance;
    }
    public boolean deposit(int depositAmount){
        if(depositAmount<= 0)
        {
        	 return false;
        }
        else
        {
	        balance=balance+depositAmount; 
	        return true;
        }
    }
}
