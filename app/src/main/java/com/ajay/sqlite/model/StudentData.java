package com.ajay.sqlite.model;

public class StudentData {
    private String rowId;
    private String fName;
    private String lName;
    private String image;
    private String contactNumber;
    private String contactEmail;
    private String contactAddress;

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getcontactNumber() { return contactNumber; }

    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public String getContactEmail() { return contactEmail; }

    public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; }

    public String getContactAddress() { return contactAddress; }

    public void setContactAddress(String contactAddress) { this.contactAddress = contactAddress; }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
