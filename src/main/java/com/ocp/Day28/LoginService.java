package com.ocp.Day28;

import java.util.*;

public class LoginService {
    //user資料庫
    private static final List<User> users =new ArrayList<>();
    static{
        users.add(new User("admin", "1234"));
        users.add(new User("John", "5678"));
        users.add(new User("mary", "0000"));
    }
    //check user
    public boolean login(String name, String password) throws LogFailException{
        boolean checkName = users.stream()
                            .filter(user->user.getName().equals(name))
                            .findAny()//找到一筆
                            .isPresent();//是否有找到
        if(!checkName){//若沒找到拋出例外
            throw new LogFailException("使用者輸入錯誤");
        }
        //----------------------------------------------------------------------
        boolean checkPassword = users.stream()
                            .filter(user->user.getName().equals(name) &&
                                          user.getPassword().equals(password))
                            .findAny()
                            .isPresent();
        if(!checkPassword){//若沒找到拋出例外
            throw new LogFailException("使用者輸入錯誤");
        }
        return true;
    }
    
}

class User{
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}