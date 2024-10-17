package com.Library;


//Person sınıfı, Reader gibi sınıflar için temel sınıf (superclass) olarak hizmet eder
//ve kişiyle ilgili ortak özellikleri tanımlar.


//Person sınıfı soyut (abstract) bir sınıf olarak tanımlanmış.
// Soyut sınıflar, kendilerinden türetilen sınıfların bazı özellikleri
// ve metodları zorunlu olarak almasını sağlar.
public abstract class Person {

    //protected erişim belirleyicisine sahip, bu da demektir ki bu değişkene
    // sadece bu sınıf ve ondan türeyen sınıflar (Reader gibi) erişebilir.
    protected String name; // Kişinin adı

    public Person(String name) {
        this.name = name;
    }

    public String whoYouAre() {
        return "Ben bir kişi: " + name;
    }

    public String getName() {
        return name;
    }
}
