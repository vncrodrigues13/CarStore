package Account;

public class Address {
    private String country;
    private String city;
    private String street;
    private int number;
    private String postal_code;
    private String description;

    public Address(String country, String city, String street, int number, String postal_code, String description) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
        this.postal_code = postal_code;
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
