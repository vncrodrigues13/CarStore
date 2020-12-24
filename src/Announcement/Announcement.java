package Announcement;
import Model.Model;
import Account.Account;
import java.util.Calendar;

public class Announcement {
    private String title;
    private String description;
    private String announcementRegister;
//  announcementRegister would be the primary key for the table
    private float price;
    private Model motor;
    private Account seller;
    // seller register would be the foreign key
    private Calendar postedDay;

    public Announcement(String title, String description, String announcementRegister, float price, Model motor, Account seller, Calendar postedDay) {
        this.title = title;
        this.description = description;
        this.announcementRegister = announcementRegister;
        this.price = price;
        this.motor = motor;
        this.seller = seller;
        this.postedDay = postedDay;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnnouncementRegister() {
        return announcementRegister;
    }

    public void setAnnouncementRegister(String announcementRegister) {
        this.announcementRegister = announcementRegister;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Model getMotor() {
        return motor;
    }

    public void setMotor(Model motor) {
        this.motor = motor;
    }

    public Account getSeller() {
        return seller;
    }

    public void setSeller(Account seller) {
        this.seller = seller;
    }

    public Calendar getPostedDay() {
        return postedDay;
    }

    public void setPostedDay(Calendar postedDay) {
        this.postedDay = postedDay;
    }
}
