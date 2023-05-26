package com.example.mongoelastic.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Builder
@AllArgsConstructor
@Document(indexName = "happytuk.user")
public class UserDocument {
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

    public static UserDocument from(User user){
        return UserDocument.builder()
                    .account_expired(user.isAccount_expired())
                    .account_locked(user.isAccount_locked())
                    .affiliate_id(user.getAffiliate_id())
                    .auth_key(user.getAuth_key())
                    .create_ip(user.getCreate_ip())
                    .date_created(user.getDate_created())
                    .enabled(user.isEnabled())
                    .failure_count(user.getFailure_count())
                    .id(user.getId())
                    .is_inflow_user(user.is_inflow_user())
                    .is_used_otp(user.is_used_otp())
                    .last_password_changed(user.getLast_password_changed())
                    .last_update_ip(user.getLast_update_ip())
                    .last_updated(user.getLast_updated())
                    .loggedin_count(user.getLoggedin_count())
                    .password(user.getPassword())
                    .password_expired(user.isPassword_expired())
                    .poly_enc_pwd(user.getPoly_enc_pwd())
                    .poly_user_no(user.getPoly_user_no())
                    .recent_service_code(user.getRecent_service_code())
                    .security_tokken(user.getSecurity_tokken())
                    .service_user_type(user.getService_user_type())
                    .temp_password(user.getTemp_password())
                    .tokken_key(user.getTokken_key())
                    .user_status(user.getUser_status())
                    .user_type(user.getUser_type())
                    .username(user.getUsername())
                    .version(user.getVersion())
                .build();
    }
}
