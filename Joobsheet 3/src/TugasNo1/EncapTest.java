package TugasNo1;

public class EncapTest{
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(50);

        System.out.println("Name :" + encap.getname());
        System.out.println("Age : " + encap.getAge());
    }
}