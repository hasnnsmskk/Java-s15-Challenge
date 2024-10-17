package com.Library;

// MemberRecord sınıfı üyelerin bilgilerini ve kayıtlarını tutar.
public class MemberRecord {
    private int memberId; //Üyenin kimlik numarası (ID).
    private String type; //Üyenin tipi (örneğin, öğrenci, öğretmen, vs.).
    private String name;
    private String address;
    private String phoneNo;

    public MemberRecord(int memberId, String type, String name, String address, String phoneNo) {
        this.memberId = memberId;
        this.type = type;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }


    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
