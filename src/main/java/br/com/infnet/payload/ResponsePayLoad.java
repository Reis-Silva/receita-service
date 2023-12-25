package br.com.infnet.payload;

import java.time.LocalDateTime;

public class ResponsePayLoad {

    private String Message;

    private LocalDateTime dateTime;


    public ResponsePayLoad(){

    }

    public ResponsePayLoad(String message, LocalDateTime dateTime) {
        Message = message;
        this.dateTime = dateTime;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
