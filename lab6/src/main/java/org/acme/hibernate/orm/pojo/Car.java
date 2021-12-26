package org.acme.hibernate.orm.pojo;

import javax.persistence.*;

@Entity
@Table(name = "сar")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type")
    private String type;
    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    @Column(name = "number")
    private String number;

    public Car() {
    }

    public Car(String type, String number) {
        this.type = type;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "models.Car{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", number=" + number +
                '}';
    }

}
