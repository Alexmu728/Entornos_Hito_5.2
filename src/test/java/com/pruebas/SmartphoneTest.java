package com.pruebas;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.Test;
import static org.junit.Assert.*;



public class SmartphoneTest {

    @Test
    public void count(){
        SmartPhoneServiceImpl spsi= new SmartPhoneServiceImpl();
        assertNotNull(spsi.count());
        assertTrue(spsi.count()>0);
        assertTrue(spsi.count()==3);
    }

}
