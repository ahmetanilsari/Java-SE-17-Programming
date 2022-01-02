package com.example.banking.domain;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;


@SelectClasses({ AccountTest.class, CheckingAccountTest.class, CustomerTest.class, BankTest.class })
@SuiteDisplayName("Domain Test Suite")
@Suite
public class DomainTestSuite {

}
