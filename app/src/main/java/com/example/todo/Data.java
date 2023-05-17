package com.example.todo;

public class Data {
    private int Stt;
    private String title;
    private String descrip;
    private String date;
    private Boolean check;
    public Data(int Stt, String title, String descrip, String date, Boolean check){
        this.Stt = Stt;
        this.title = title;
        this.descrip = descrip;
        this.date = date;
        this.check = check;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public int getStt() {
        return Stt;
    }

    public void setStt(int stt) {
        Stt = stt;
    }
}
