package com.company;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer = new Customer("Dan", "Mueller", "dan.m@smu.test", 214111222, "Address", "60 Test St, #1, Plano, Tx 23432", true);



    @Test
    public void shouldReturnCustomerName(){
        assertEquals("Dan", customer.getFirstName());
    }
}
