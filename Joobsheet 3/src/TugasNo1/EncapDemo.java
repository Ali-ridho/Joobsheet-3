package TugasNo1;

public class EncapDemo {
    private String name;
    private int age;

    public String getname(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if (newAge > 30){
            System.out.println("Maksimal Umur 30 Tahun!");
        }
        else{
            age = newAge;
        }
        if(newAge < 18){
            System.out.println("Minimum Umur 18 Tahun!");
        }
        else{
            age=newAge;
        }
    }
}
