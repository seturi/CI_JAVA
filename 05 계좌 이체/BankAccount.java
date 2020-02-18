public class BankAccount {
    // 저번 과제에서의 코드!
    private int balance;
    private Person owner;
    
    public void setBalance(int bBalance) {
        balance = bBalance;
    }

    public int getBalance() {
        return balance;
    }
    
    public void setOwner(Person bOwner) {
        owner = bOwner;
    }

    public Person getOwner() {
        return owner;
    }
    
     boolean deposit(int amount){
        if (amount < 0 || owner.getCashAmount() < amount){
            System.out.println("입금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
            return false;
        }
        else{
            balance += amount;
            owner.setCashAmount(owner.getCashAmount()-amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
            
        }
         
    }
    boolean withdraw(int amount){
        if ( amount < 0 || getBalance() < amount) {
            System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
            return false;
        }
        else{
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount()+amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: "+ balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        if (amount < 0 || balance < amount) {
            System.out.println(false + " - from: " + owner.getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + balance);
            return false;
        }
        else {
            balance -= amount;
            to.getAccount().setBalance(to.getAccount().getBalance() + amount);
            System.out.println(true + " - from: " + owner.getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + balance);
            return true;
        }
    }

    public boolean transfer(BankAccount to, int amount) {
        return transfer(to.getOwner(), amount);
    }
}