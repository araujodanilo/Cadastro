package br.edu.ifsp.scl.cadastro;

enum Sex{
    masculine,
    feminine
}

public class SignUp {
    private String name;
    private String phone;
    private String email;
    private boolean termEmail;
    private Sex sex;
    private String city;
    private String state;

    public SignUp() {
    }

    public SignUp(String name, String phone, String email, boolean termEmail, Sex sex, String city, String state) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.termEmail = termEmail;
        this.sex = sex;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTermEmail() {
        return termEmail;
    }

    public void setTermEmail(boolean termEmail) {
        this.termEmail = termEmail;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "SignUp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", termEmail=" + termEmail +
                ", sex=" + sex +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
