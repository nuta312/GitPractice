package com.digital.utils;

import com.github.javafaker.Faker;

public class FakeDataProvider {

    Faker faker = new Faker();

    public String generateFakeFullName() {
        return faker.name().fullName();
    }

    public String generateFakeEmail() {
        return faker.internet().emailAddress();
    }

    public String generateFakeCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String generateFakePermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }

}
