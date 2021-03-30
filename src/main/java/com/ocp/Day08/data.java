package com.ocp.Day08;

import javax.swing.JOptionPane;

public class data {

    private String dataID = "a00000";
    private String dataPassword = "123456";
    boolean flag;

    public void Equal(String ID, String password) {
        if (dataID.equals(ID) && dataPassword.equals(password)) {
            JOptionPane.showMessageDialog(null, "登入成功");
            this.flag=true;
        } else {
            JOptionPane.showMessageDialog(null, "帳號密碼輸入錯誤");
        }
    }
    public void Input(){
        while(true){
            if(flag){
               break;
            }else{
               Equal(JOptionPane.showInputDialog("輸入帳號"),JOptionPane.showInputDialog("輸入密碼"));
            }
            System.exit(0);
        }
    }
    
    public void dataIdEqual(String Id){
        while(true){
            if (Id.length() >= 8) {
                setdataID(Id);
                break;
            } else{
                JOptionPane.showMessageDialog(null,"帳號輸入錯誤");
                continue;
            }
            //1.比對是否有含一個或多個英字母
            //2.不能含有字串
        }
    }
    
    
    
    private String getdataID(){
        return dataID;
    }
   
    private void setdataID(String ID){
        this.dataID=ID;
    }
    
    private String getdataPassword(){
        return dataID;
    }
    
    private void setdataPassword(String password){
        this.dataID=password;
    }
    
}
