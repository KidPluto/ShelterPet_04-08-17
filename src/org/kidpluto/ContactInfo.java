package org.kidpluto;

/**
 * Created by Chris on 4/8/2017.
 */
public class ContactInfo {

    private String emailAddr1;
    private String emailAddr2;
    private String phone1;
    private String phone2;
    private String url;

    public ContactInfo() {
    }

    public ContactInfo(String emailAddr1) {
        this.emailAddr1 = emailAddr1;
    }

    public ContactInfo(String emailAddr1, String phone1) {
        this.emailAddr1 = emailAddr1;
        this.phone1 = phone1;
    }

    public ContactInfo(String emailAddr1, String emailAddr2, String phone1, String phone2, String url) {
        this.emailAddr1 = emailAddr1;
        this.emailAddr2 = emailAddr2;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.url = url;
    }

    public String getEmailAddr1() {
        return emailAddr1;
    }

    public void setEmailAddr1(String emailAddr1) {
        this.emailAddr1 = emailAddr1;
    }

    public String getEmailAddr2() {
        return emailAddr2;
    }

    public void setEmailAddr2(String emailAddr2) {
        this.emailAddr2 = emailAddr2;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
