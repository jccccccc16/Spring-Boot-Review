package com.cjc.springbootdemo01.entity;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/20
 * Time: 19:39
 * To change this template use File | Settings | File Templates.
 **/
public class Admin {



    private Integer id;
    private String login_acct;
    private String user_pswd;
    private String user_name;
    private String email;
    private String create_time;

    public Admin() {
    }

    public Admin(Integer id,
                 String login_acct,
                 String user_pswd,
                 String user_name,
                 String email,
                 String create_time) {
        this.id = id;
        this.login_acct = login_acct;
        this.user_pswd = user_pswd;
        this.user_name = user_name;
        this.email = email;
        this.create_time = create_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin_acct() {
        return login_acct;
    }

    public void setLogin_acct(String login_acct) {
        this.login_acct = login_acct;
    }

    public String getUser_pswd() {
        return user_pswd;
    }

    public void setUser_pswd(String user_pswd) {
        this.user_pswd = user_pswd;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
