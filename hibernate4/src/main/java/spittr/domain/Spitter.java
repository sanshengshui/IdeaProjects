package spittr.domain;

import javax.persistence.*;

/**
 * Created by jamesmsw on 17-3-17.
 */
@Entity
public class Spitter {
    private Spitter(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "updateByEmail")
    private boolean updateByEmail;

    public Spitter(Long id,String username,String fullName,String password,String email,boolean updateByEmail){
        this.id=id;
        this.username=username;
        this.fullName=fullName;
        this.password=password;
        this.email=email;
        this.updateByEmail=updateByEmail;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isUpdateByEmail() {
        return updateByEmail;
    }
}
