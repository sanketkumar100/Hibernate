package org.example;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

enum Days {Sunday, Monday}

@Embeddable
class NewClass {
    private String greet;
    private int newProperty;

    public String getGreet() { return greet; }
    public void setGreet(String greet) { this.greet = greet; }

    public int getNewProperty() { return newProperty; }
    public void setNewProperty(int newProperty) { this.newProperty = newProperty; }
}

@Entity
@Table(name = "new_name")
public class MapEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Transient
    private long phno;

    @Temporal(TemporalType.DATE)
    private Date dt;

    @Enumerated(EnumType.STRING)
    private Days da;

    @Embedded
    private NewClass prp;

    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "auto_id", unique = true)
    private String autoId;

    public MapEntity() {
        super();
    }

    public MapEntity(long id, String name, long phno) {
        this.id = id;
        this.name = name;
        this.phno = phno;
    }

    // Getters and setters for all fields

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public long getPhno() { return phno; }
    public void setPhno(long phno) { this.phno = phno; }

    public Date getDt() { return dt; }
    public void setDt(Date dt) { this.dt = dt; }

    public Days getDa() { return da; }
    public void setDa(Days da) { this.da = da; }

    public NewClass getPrp() { return prp; }
    public void setPrp(NewClass prp) { this.prp = prp; }

    public String getAutoId() { return autoId; }
    public void setAutoId(String autoId) { this.autoId = autoId; }
}
