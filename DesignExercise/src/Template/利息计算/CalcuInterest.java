package Template.利息计算;

public abstract class CalcuInterest {
    String account;
    String psw;
    double interest;
    public CalcuInterest(String account, String psw){
        this.account = account;
        this.psw = psw;
    }
    public boolean verifyUserInfo(){
        if(account == "Howie" && psw == "123456")
            return true;
        else
            return false;
    }
    public abstract void calInterest();
    public void display(){
        System.out.println("The total interest: " + interest);
    }

    public void process(){
        if(verifyUserInfo()){
            calInterest();
            display();
        }
        else{
            System.out.println("user information error...");
        }
    }
}
