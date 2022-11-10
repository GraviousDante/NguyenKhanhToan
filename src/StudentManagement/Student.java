package StudentManagement;

public class Student{
    private String id;
    private String Name;
    private String Address;
    private String Phone;

    private Student(){

    }
    public Student(String id, String name, String address, String phone){
        this.id = new String(id);
        this.Name = new String(name);
        this.Address = new String(address);
        this.Phone = new String(phone);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
