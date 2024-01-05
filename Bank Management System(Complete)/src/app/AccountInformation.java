package app;

import java.util.Arrays;
import java.util.List;

public class AccountInformation {
    private String firstName,
            middleName,
            lastName,
            gender,
            phone_number,
            DOB,
            email,
            address,
            state,
            city,
            religion,
            category,
            occupation,
            panNumber,
            adhaarNumber,
            accountType,
            accountNumber,
            accountBalance="0"; 

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }
    
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAdhaarNumber() {
        return adhaarNumber;
    }

    public void setAdhaarNumber(String adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "AccountInformation{" + "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", gender=" + gender + ", phone_number=" + phone_number + ", DOB=" + DOB + ", email=" + email + ", address=" + address + ", state=" + state + ", city=" + city + ", religion=" + religion + ", category=" + category + ", occupation=" + occupation + ", panNumber=" + panNumber + ", adhaarNumber=" + adhaarNumber + ", accountType=" + accountType + ", accountNumber=" + accountNumber + '}';
    }
    
    public List<String> getList()
    {
        return Arrays.asList(
                firstName,
                middleName,
                lastName,
                gender,
                phone_number,
                DOB,
                email,
                address,
                state,
                city,
                religion,
                category,
                occupation,
                panNumber,
                adhaarNumber,
                accountType,
                accountNumber,
                accountBalance
        );
    }
    
    public void generateAccNo(){
       int min = 1000, max = 9999;
       accountNumber  = Integer.toString(min + (int)(Math.random() * ((max - min) + 1)));
    }
}