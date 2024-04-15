package com.pruebas;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.Test;
import static org.junit.Assert.*;



public class SmartphoneTest {

    @Test
    public void count(){
        SmartPhoneServiceImpl spsi= new SmartPhoneServiceImpl();
        assertNotNull(spsi.count());
        //fallo
        assertTrue(spsi.count()<0);
        assertEquals(3, (int) spsi.count());
    }

    @Test
    public void findOne(){
        SmartPhoneServiceImpl spsi = new SmartPhoneServiceImpl();
        assertThrows(IllegalArgumentException.class, () -> spsi.findOne(null));
    }
}
