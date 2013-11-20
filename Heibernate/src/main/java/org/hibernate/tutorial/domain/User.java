package org.hibernate.tutorial.domain;

/**
 * Created with IntelliJ IDEA.
 * User: Sun
 * Date: 13-11-19
 * Time: 下午9:48
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private Long id ;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
