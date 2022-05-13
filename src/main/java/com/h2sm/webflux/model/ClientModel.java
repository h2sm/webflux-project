package com.h2sm.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Builder
@Data
@AllArgsConstructor
public class ClientModel {
    private String fullName;
    private String passport;
    private String telNumber;
    private Date dof; //date of birth
}
