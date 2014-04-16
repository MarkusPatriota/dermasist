package br.edu.ifpb.monteiro.ads.dermasist.entities;

import java.security.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Elisângela
 */
@Entity
@Table(name="SCHEDULING")
public class Scheduling extends Identifiable {
    
    @Column(name="DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    
    @Column(name="TYPE_OF_SCHEDULING")
    private String typeOfScheduling;
    
    @Column(name="TIMETABLE")
    private Timestamp timetable;

    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTypeOfScheduling() {
        return typeOfScheduling;
    }

    public void setTypeOfScheduling(String typeOfScheduling) {
        this.typeOfScheduling = typeOfScheduling;
    }

    public Timestamp getTimetable() {
        return timetable;
    }

    public void setTimetable(Timestamp timetable) {
        this.timetable = timetable;
    }
    
    
}
