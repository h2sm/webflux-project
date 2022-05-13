package com.h2sm.webflux.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import java.sql.Date;

@Data
@AllArgsConstructor
@Builder
public class Client {
    private long clientID;
    private String fullName;
    private String passport;
    @Column("tel_name")//имя телефона лол
    private String telNumber;
    @Column("date_of_birth")
    private Date dof; //date of birth
}
