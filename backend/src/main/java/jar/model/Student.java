//model/Student.java 
package jar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String email;
    String ip;

    public void setName(String n) {
        this.name = n;
    }

    public void setEmail(String e) {
        this.email = e;

    }

    public void setIp(String ip) {

        this.ip = ip;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getIp() {
        return this.ip;
    }

}
