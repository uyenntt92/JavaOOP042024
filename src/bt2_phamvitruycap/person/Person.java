package bt2_phamvitruycap.person;
public class Person {
    public String name;
    public int age;
    public String gender;
    public String address;
    public String phone;
    public Person(String name,int age, String gender, String address,String phone){
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.address = address;
      this.phone = phone;
    }
//    public Person(String phươngAnh, int age, String Gender) {
//    }
    public static void main(String[] args) {
        System.out.println();
    }
    public String getName(){return name;};
    public int getAge(){ return age;}
    public  String getGender(){return gender;}
    public  String getAddress(){return address;}
    public  String getPhone(){return phone;}
    public void getinformation () {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
    public void getinfodefault (String name, int age, String gender){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    };
      }

