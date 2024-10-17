package com.Library;

// MemberRecord sınıfı üyelerin bilgilerini ve kayıtlarını tutar.
public class MemberRecord {
    private int memberId;
    private String type;
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





}
