package com.java.trian.recyvleview;

public class PersonClass {
    public PersonClass(String name, String lastName, long id, String phone, int pic)
    {
        setName(name);
        setLastName(lastName);
        setId(id);
        setPhone(phone);
        setPic(pic);
    }

    private String name;
    private String lastName;
    private long id;
    private String phone;
    private int pic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
