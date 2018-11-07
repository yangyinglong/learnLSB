package com.yylc.learnLSB.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class UserEntity implements Serializable {

@Id
@GeneratedValue
private Integer id;
@Column
private String name;
@Column
private String phone;
@Column
private String password;
@Column
private String email;
@Column
private Integer statue;
@Column
private String createdTime;
@Column
private String changedTime;

public UserEntity(){}

public UserEntity(Integer id,String name,String phone,String password,String email,Integer statue,String createdTime,String changedTime){
this.id = id;
this.name = name;
this.phone = phone;
this.password = password;
this.email = email;
this.statue = statue;
this.createdTime = createdTime;
this.changedTime = changedTime;
}

public Integer getId() {return id;}

public void setId(Integer id){this.id = id;}

public String getName() {return name;}

public void setName(String name){this.name = name;}

public String getPhone() {return phone;}

public void setPhone(String phone){this.phone = phone;}

public String getPassword() {return password;}

public void setPassword(String password){this.password = password;}

public String getEmail() {return email;}

public void setEmail(String email){this.email = email;}

public Integer getStatue() {return statue;}

public void setStatue(Integer statue){this.statue = statue;}

public String getCreatedTime() {return createdTime;}

public void setCreatedTime(String createdTime){this.createdTime = createdTime;}

public String getChangedTime() {return changedTime;}

public void setChangedTime(String changedTime){this.changedTime = changedTime;}

}