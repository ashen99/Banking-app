package com.ashen.testing_bank_app.entity;

import lombok.Getter;

@Getter
public enum Role {
    ROLE_USER("ROLE_USER"),
    ROLE_ADMIN("ROLE_ADMIN");

    // Getter
    private final String roleName;

    // Constructor
    Role(String roleName) {
        this.roleName = roleName;
    };
}
