package org.nari.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userId;

    private String account;

    private String password;

    private String company;

    private Integer role;

    private String companyCode;

    private String mail;

    private String phone;

}