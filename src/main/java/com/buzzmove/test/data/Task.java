package com.buzzmove.test.data;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class task entity.
 * 
 */
@Entity
public class Task implements Serializable {

    private static final long serialVersionUID = -398273045165970676L;

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private CustomerTitle customerTitle;

    @NotBlank
    private String customerFirstName;

    @NotBlank
    private String customerLastName;

    @NotNull
    private Date scheduled;

    private String notes;

    private String strScheduled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CustomerTitle getCustomerTitle() {
        return customerTitle;
    }

    public void setCustomerTitle(CustomerTitle customerTitle) {
        this.customerTitle = customerTitle;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public Date getScheduled() {
        return scheduled;
    }

    public void setScheduled(Date scheduled) {
        this.scheduled = scheduled;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStrScheduled() {

        if (this.scheduled != null) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            this.strScheduled = df.format(this.scheduled);
        }

        return strScheduled;
    }

    public void setStrScheduled(String strScheduled) {
        this.strScheduled = strScheduled;
    }

}
