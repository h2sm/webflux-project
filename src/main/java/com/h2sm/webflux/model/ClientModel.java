package com.h2sm.webflux.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class ClientModel {
    private String fullName;
    private String passport;
    private String telNumber;
    private Date dof; //date of birth
}
