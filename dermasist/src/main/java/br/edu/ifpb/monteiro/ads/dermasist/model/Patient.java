package br.edu.ifpb.monteiro.ads.dermasist.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity atribudos pacientecontém and methods of creating a 
 * patient.
 * @author Elisângela
 */
@Entity
@Table(name="PATIENT")
public class Patient extends Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    
    @ManyToOne
    @JoinColumn(name="FK_PERSON")
    private Person person;
    
    @Column(name="MOTHER_IS_NAME")
    private String motherIsName;
    
    @Column(name="BLOOD_TYPE")
    private String bloodType;
    
    @Column(name="FLESH_TONE")
    private String fleshTone; // cor da pele
        
    @Column(name="EMERGENCY_CONTACT")
    private String emergencyContact;
    
    @Column(name="HEALTH_PLAN")
    private String healthPlan;
    
    @Column (name="SUS_CARD")
    private String susCard;
    
    @Column(name="WEIGHT")
    private int weight;
    
    @Column(name="HEIGHT")
    private float height;

    // Get's e Set's
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getMotherIsName() {
        return motherIsName;
    }

    public void setMotherIsName(String motherIsName) {
        this.motherIsName = motherIsName;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getFleshTone() {
        return fleshTone;
    }

    public void setFleshTone(String fleshTone) {
        this.fleshTone = fleshTone;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(String healthPlan) {
        this.healthPlan = healthPlan;
    }

    public String getSusCard() {
        return susCard;
    }

    public void setSusCard(String susCard) {
        this.susCard = susCard;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.person);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patient{" + "person=" + person + ", motherIsName=" + motherIsName + ", bloodType=" + bloodType + ", fleshTone=" + fleshTone + ", emergencyContact=" + emergencyContact + ", healthPlan=" + healthPlan + ", susCard=" + susCard + ", weight=" + weight + ", height=" + height + '}';
    }

    /**
     * @return the ID
     */
    @Override
    public Long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    @Override
    public void setID(Long ID) {
        this.ID = ID;
    }
    
    
}
