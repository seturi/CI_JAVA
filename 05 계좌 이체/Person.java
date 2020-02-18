public class Person {
    // 저번 과제에서의 코드!
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;
    
    public void setName(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }
    
    public void setAge(int pAge) {
        if (pAge > 0) {
            age = pAge;
        }
    }

    public int getAge() {
        return age;
    }
    
    public void setCashAmount(int pCashAmount) {
        if (pCashAmount > 0) {
            cashAmount = pCashAmount;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }
    
    public void setAccount(BankAccount pAccount) {
        account = pAccount;
    }
    
    public BankAccount getAccount() {
        return account;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    public boolean transfer(Person to, int amount) {
        return getAccount().transfer(to,amount);
    } 

    public boolean transfer(BankAccount to, int amount) {
        return transfer(to.getOwner() , amount);
    }
}