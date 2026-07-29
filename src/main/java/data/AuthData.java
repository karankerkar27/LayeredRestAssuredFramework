package data;

import pojo.AuthPojo;

public class AuthData {

    public AuthPojo setAuthData(AuthPojo authObj, String username, String password){

        authObj.setUsername(username);

        authObj.setPassword(password);

        return authObj;
    }
}
