package com.mahendra.democlient.models;

import java.util.Date;

public class Message {
    private String body;
    private Date date;

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public Message(String body, Date date){
        this.body = body;
        this.date = date;
    }

    public Message(){}
}