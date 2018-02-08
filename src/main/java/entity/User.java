package entity;

import javax.persistence.*;

/**
 * Created by MalindaK on 12/19/2017.
 */

@javax.persistence.Entity
@Table(name = "user", catalog = "school", uniqueConstraints = {
        @UniqueConstraint(columnNames = "userId")})
public class User extends Entity {
    private int userId;
    private int memberId;
    private String name;
    private String userName;
    private String password;
    private int role;
    private String sessionId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId", unique = true, nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    @Column(name = "role", nullable = true, length = 10)
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Column(name = "name", nullable = true, length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "userName", nullable = true, length = 40)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "password", nullable = true, length = 40)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "sessionId", nullable = true, length = 40)
    public String getSessionId() {
        return sessionId;
    }
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Column(name = "memberId", nullable = false, length = 40)
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
}
