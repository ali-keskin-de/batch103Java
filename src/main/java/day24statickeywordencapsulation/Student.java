package day24statickeywordencapsulation;

public class Student {

    // Encapsulation
    /*
    Niçin kodlarımız kapsüllemek isteriz?
   cvp: Kodlarimizi dış etkilerden korumak icin encapsule ederiz.
    Buna DataHiding (Data gizlemek) denmektedir. Data’yi encapsul’e etmek icin datanın access modifier’ini “private” yapmalisiniz.

    // Data’yi private yaptıktan sonra diğer Class’lardan nasıl görebilirsiniz?
    // Encapsul’e yaptıktan sonra get methodlar (getter) oluşturarak dataları okunur yapabilirsiniz.

    // Data’yi private yaptıktan sonra diğer Class’lardan nasıl değiştirebiliriz?
    // Encapsul’e yaptıktan sonra set methodlar (setter) oluşturarak dataları değiştirilebilir  yapabilirsiniz.
    // Variable’in data type ile getter’in return type ayni olmalıdır.
    // get methodlari isimlendirirken “get + <variable name>” ancak variable’in data type’i “boolean” ise “is + <variable name>” yapılır.


     */
    // Data Hiding
    public String stdName ="Tom Hanks";
    private String stdId =" TH20201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
