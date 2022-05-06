package com.company;

import java.util.Objects;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    private Address shippingAddress;
    private Address billingAddress;

    private RewardMember rewardMember;

//    Constructor

    public Customer(String firstName, String lastName, String email, int phoneNumber, Address shippingAddress, Address billingAddress, RewardMember rewardMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.rewardMember = rewardMember;
    }


//    Getters and setters


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public RewardMember getRewardMember() {
        return rewardMember;
    }

    public void setRewardMember(RewardMember rewardMember) {
        this.rewardMember = rewardMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return phoneNumber == customer.phoneNumber && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(shippingAddress, customer.shippingAddress) && Objects.equals(billingAddress, customer.billingAddress) && Objects.equals(rewardMember, customer.rewardMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, shippingAddress, billingAddress, rewardMember);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                ", rewardMember=" + rewardMember +
                '}';
    }
}
