package Announcement;
import Model.Model;
import Account.Account;
import java.util.Calendar;

public class Announcement {
    private String title;
    private Model motor;
    private Account seller;
    private String sellerRegister;
    private Calendar postedDay;

    public Announcement(String title, Model motor, Account seller, String sellerRegister, Calendar postedDay) {
        this.title = title;
        this.motor = motor;
        this.seller = seller;
        this.sellerRegister = sellerRegister;
        this.postedDay = postedDay;
    }
}
