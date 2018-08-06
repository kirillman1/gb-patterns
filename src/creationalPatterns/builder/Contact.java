package creationalPatterns.builder;

public class Contact {

    private String name;
    private String surname;
    private String middleName ;
    private char sex;
    private int age;
    private String country;
    private String region;
    private String city;
    private String zipCode;
    private String phone;
    private String skype;
    private String email;

    private Contact(String name, String surname, String middleName, char sex, int age, String country, String region, String city, String zipCode, String phone, String skype, String email) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.sex = sex;
        this.age = age;
        this.country = country;
        this.region = region;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.skype = skype;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getSkype() {
        return skype;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder {
        private String name;
        private String surname;
        private String middleName ;
        private char sex;
        private int age;
        private String country;
        private String region;
        private String city;
        private String zipCode;
        private String phone;
        private String skype;
        private String email;

        public Contact build() {
            return new Contact(name, surname, middleName, sex, age, country, region, city, zipCode, phone, skype, email);
        }

        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setSex(char sex) {
            this.sex = sex;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = region;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setSkype(String skype) {
            this.skype = skype;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
    }
}
