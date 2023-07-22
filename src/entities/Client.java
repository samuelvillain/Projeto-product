package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;
    private Date bithDate;
    public Client(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBithDate() {
        return bithDate;
    }

    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
    }

    public Client(String name, String email, Date bithDate) {
        this.name = name;
        this.email = email;
        this.bithDate = bithDate;
    }
    @Override
    public String toString() {
        return name + " (" + fmt2.format(bithDate) + ") - " + email;
    }


}
