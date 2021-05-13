
package com.cdc;

public class CDC {
    private String sent;
    private String description;
    private String headline;
    private String circle;
    private String alert_disease;
    private String areaDesc;
    private String effective;
    //加值資料
    private double dustance;//距離

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public String getAlert_disease() {
        return alert_disease;
    }

    public void setAlert_disease(String alert_disease) {
        this.alert_disease = alert_disease;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    public String getEffective() {
        return effective;
    }

    public void setEffective(String effective) {
        this.effective = effective;
    }

    public double getDustance() {
        return dustance;
    }

    public void setDustance(double dustance) {
        this.dustance = dustance;
    }

    @Override
    public String toString() {
        return "CDC{" + "sent=" + sent + ", description=" + description + ", headline=" + headline + ", circle=" + circle + ", alert_disease=" + alert_disease + ", areaDesc=" + areaDesc + ", effective=" + effective + ", dustance=" + dustance + '}';
    }
    
}
