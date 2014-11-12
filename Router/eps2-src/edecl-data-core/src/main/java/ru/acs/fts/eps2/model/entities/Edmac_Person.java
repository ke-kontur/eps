package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDMAC_PERSON")
public class Edmac_Person  {
    public Edmac_Person(){

    }

    @Id
    @Column(name="PRSN_PERSONID", length = 36, nullable = false)
    private String personId;
    @Column(name="PRSN_ORGID", length = 36)
    private String orgId;
    @Column(name="PRSN_LASTNAME", length = 50, nullable = false)
    private String lastName;
    @Column(name="PRSN_FIRSTNAME", length = 50)
    private String firstName;
    @Column(name="PRSN_SECONDNAME", length = 50)
    private String secondName;
    @Column(name="PRSN_CONTACTPHONE", length = 50)
    private String contactPhone;
    @Column(name="PRSN_EMAIL", length = 50)
    private String email;
    @Column(name="PRSN_POST", length = 50)
    private String post;
    @Column(name="PRSN_COMMENTS", length = 250)
    private String comments;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="PRSN_CHDATETIME", length = 6, nullable = false)
    private Date changeDateTime;
    @Column(name="PRSN_PERSONCLOSE", length = 1, nullable = false)
    private int personClose;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getChangeDateTime() {
        return changeDateTime;
    }

    public void setChangeDateTime(Date changeDateTime) {
        this.changeDateTime = changeDateTime;
    }

    public int getPersonClose() {
        return personClose;
    }

    public void setPersonClose(int personClose) {
        this.personClose = personClose;
    }
}
