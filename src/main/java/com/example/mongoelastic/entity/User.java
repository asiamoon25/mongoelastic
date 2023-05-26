package com.example.mongoelastic.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="user")
@Getter
@NoArgsConstructor
public class User {
    @Id
    private String _id;
    private boolean account_expired;
    private boolean account_locked;
    private String affiliate_id;
    private String auth_key;
    private String create_ip;
    private String date_created;
    private boolean enabled;
    private int failure_count;
    private int id;
    private boolean is_inflow_user;
    private boolean is_used_otp;
    private String last_password_changed;
    private String last_update_ip;
    private String last_updated;
    private int loggedin_count;
    private String password;
    private boolean password_expired;
    private String poly_enc_pwd;
    private String poly_user_no;
    private String recent_service_code;
    private String security_tokken;
    private String service_user_type;
    private String temp_password;
    private String tokken_key;
    private String user_status;
    private String user_type;
    private String username;
    private int version;
}

/*
   "id": 40,
    "version": 0,
    "account_expired": false,
    "account_locked": false,
    "auth_key": null,
    "create_ip": null,
    "date_created": "2014-05-14",
    "enabled": false,
    "failure_count": 0,
    "last_password_changed": "9999-12-31 00:00:00",
    "last_update_ip": null,
    "last_updated": "2014-05-14 00:00:00",
    "password": "",
    "password_expired": false,
    "poly_enc_pwd": "0",
    "poly_user_no": null,
    "recent_service_code": null,
    "service_user_type": null,
    "temp_password": null,
    "user_status": "NORMAL",
    "user_type": null,
    "username": "userpoints_user",
    "is_inflow_user": false,
    "loggedin_count": 0,
    "is_used_otp": false,
    "tokken_key": null,
    "affiliate_id": null,
    "security_tokken": null
 */
