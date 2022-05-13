package com.h2sm.webflux.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class Client {
    private long clientID;
    private String fullName;
    private String passport;
    private String telNumber;
    private Date dof; //date of birth
}
