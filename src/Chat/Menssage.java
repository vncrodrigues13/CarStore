package Chat;

import Account.Account;

import java.util.Calendar;

public class Menssage {
    private String menssage;
    private Calendar menssageTime;
    private Account menssageOwner;

    public Menssage(String menssage, Account menssageOwner){
        menssageTime = Calendar.getInstance();
        this.menssage = menssage;
        this.menssageOwner = menssageOwner;
    }

    public String getMenssage() {
        return menssage;
    }

    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }

    public Calendar getMenssageTime() {
        return menssageTime;
    }

    public void setMenssageTime(Calendar menssageTime) {
        this.menssageTime = menssageTime;
    }

    public Account getMenssageOwner() {
        return menssageOwner;
    }

    public void setMenssageOwner(Account menssageOwner) {
        this.menssageOwner = menssageOwner;
    }
}
