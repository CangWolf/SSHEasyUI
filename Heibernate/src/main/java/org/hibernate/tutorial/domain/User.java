package org.hibernate.tutorial.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Sun
 * Date: 13-11-19
 * Time: 下午9:48
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="USER")
public class User {
    private Long id ;
    private String username;
    private String password;

    @Id
    @Column(name="ID",unique = true, nullable = false)
//    @GeneratedValue(generator = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="NAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
