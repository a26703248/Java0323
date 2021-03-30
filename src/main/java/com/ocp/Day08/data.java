package com.ocp.Day08;

import javax.swing.JOptionPane;

public class data {

    String dataID = "a00000";
    String dataPassword = "123456";
    boolean flag;

    public void Equal(String ID, String password) {
        if (dataID.equals(ID) && dataPassword.equals(password)) {
            JOptionPane.showMessageDialog(null, "登入成功");
            this.flag=true;
        } else if (dataID.equals(ID)) {
            JOptionPane.showMessageDialog(null, "帳號錯誤");
        } else{
            JOptionPane.showMessageDialog(null, "密碼錯誤");
        }
    }
    public void Input(){
        while(true){
            if(flag){
                break;
            }else {
                Equal(JOptionPane.showInputDialog("輸入帳號"),JOptionPane.showInputDialog("輸入密碼"));
            }
        }
    }
}
