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
    private int count;

    public Announcement(String title, String description, float price, Model motor, Account seller, Calendar postedDay) {
        this.title = title;
        this.description = description;
        defineAnnouncementRegister();
        this.price = price;
        this.motor = motor;
        this.seller = seller;
        this.postedDay = postedDay;
        motor.setVehicleRegister(announcementRegister);
    }

    public void sendMenssage(String name, String email, String telefone, String menssage){

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

    public void defineAnnouncementRegister(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(postedDay.get(Calendar.DATE)).append(postedDay.get(Calendar.MONTH)).append(postedDay.get(Calendar.YEAR)).append(count);
        this.announcementRegister = stringBuilder.toString();
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
        motor.setVehicleRegister(announcementRegister);
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
