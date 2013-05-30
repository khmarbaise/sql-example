package com.soebes.casestudy.bo;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = TabellenNamen.ENTRIES)
public class EntriesBO extends BaseBO {

    private String title;
    private String body;

    private Timestamp timestamp;

    @ManyToMany(targetEntity = com.soebes.casestudy.bo.CategoryBO.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinTable(name = TabellenNamen.ENTRY_CATEGORY, 
    	joinColumns = { @JoinColumn(name = "entryid") }, 
    	inverseJoinColumns = { @JoinColumn(name = "categoryid") }
    )
    private List<CategoryBO> categories;

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getBody() {
	return body;
    }

    public void setBody(String body) {
	this.body = body;
    }

    public Timestamp getTimestamp() {
	return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
	this.timestamp = timestamp;
    }

    public List<CategoryBO> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryBO> categories) {
        this.categories = categories;
    }

}
