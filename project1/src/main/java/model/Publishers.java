package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Publishers {

    @Id
    @Column(name = "name", nullable = false, length = 80)
    private String name;

    @Column(nullable = false, length = 80)
    private String email;

    @Column(nullable = false, length = 24)
    private String phone;

    public Publishers() {
    }

    public Publishers(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Publishers{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publishers that = (Publishers) o;
        return name.equals(that.name) && email.equals(that.email) && phone.equals(that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone);
    }
}
