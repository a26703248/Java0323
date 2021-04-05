package com.ocp.Day08;

import javax.swing.JOptionPane;

        
class account{

    private String dataId = "a00000";
    private String dataPassword = "123456";
    boolean flag;

    public String signIn(String ID, String password) {
        if (dataId.equals(ID) && dataPassword.equals(password)) {
            JOptionPane.showMessageDialog(null, "登入成功");
            this.flag=true;
        } else {
            JOptionPane.showMessageDialog(null, "帳號密碼輸入錯誤");
        }
        return flag==true?"登入成功":"帳號密碼輸入錯誤";
    }
    
    public void registered(String Id, String password){
        while(true){
            if (Id.length() >= 8) {
                dataId=Id;
                break;
            }else{
                JOptionPane.showMessageDialog(null,"帳號格式錯誤");
                continue;
            }
            //1.比對是否有含一個或多個英字母
            //2.不能含有字串
        }
    }
}    
//interface dataInOut{//資料讀取寫入介面
//    public void dataIN();
//    public String dataOUT();
//}
    
//    private String getdataID(){
//        return dataID;
//    }
//   
//    private void setdataID(String ID){
//        this.dataID=ID;
//    }
//    
//    private String getdataPassword(){
//        return dataID;
//    }
//    
//    private void setdataPassword(String password){
//        this.dataID=password;
//    }
    

// public void Input(){
//        while(true){
//            if(flag){
//               break;
//            }else{
//               Equal(JOptionPane.showInputDialog("輸入帳號"),JOptionPane.showInputDialog("輸入密碼"));
//            }
//            System.exit(0);
//        }
//    }