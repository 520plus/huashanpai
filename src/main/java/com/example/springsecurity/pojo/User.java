package com.example.springsecurity.pojo;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private String checkfirst;

    private Long checksecond;

    private String checkthird;

    private String pic;

    private Long telephone;

    private String mail;

    private Integer pay;

    private Integer status;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCheckfirst() {
        return checkfirst;
    }

    public void setCheckfirst(String checkfirst) {
        this.checkfirst = checkfirst == null ? null : checkfirst.trim();
    }

    public Long getChecksecond() {
        return checksecond;
    }

    public void setChecksecond(Long checksecond) {
        this.checksecond = checksecond;
    }

    public String getCheckthird() {
        return checkthird;
    }

    public void setCheckthird(String checkthird) {
        this.checkthird = checkthird == null ? null : checkthird.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}