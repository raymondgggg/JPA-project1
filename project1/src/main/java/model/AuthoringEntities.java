package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuthoringEntities {
    @Id
    @Column(name = "email", nullable = false, length = 30)
    private String email;

    @Column(nullable = false, length = 80)
    private String name;

    @Column(nullable = false, length = 80)
    private String headWriter;

    @Column(nullable = false, length = 4)
    private int yearFormed;

    public AuthoringEntities() {
    }

    public AuthoringEntities(String email, String name, String headWriter, int yearFormed) {
        this.email = email;
        this.name = name;
        this.headWriter = headWriter;
        this.yearFormed = yearFormed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadWriter() {
        return headWriter;
    }

    public void setHeadWriter(String headWriter) {
        this.headWriter = headWriter;
    }

    public int getYearFormed() {
        return yearFormed;
    }

    public void setYearFormed(int yearFormed) {
        this.yearFormed = yearFormed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
