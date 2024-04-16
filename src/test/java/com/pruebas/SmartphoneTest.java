package com.pruebas;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;


public class SmartphoneTest {



    @AfterEach
    public void after(){
        System.out.println("@AfterEach");
    }

    @BeforeEach
    public void before(){
        System.out.println("@BeforeEach");
    }






    @Test
    @DisplayName("Test para la funcion count")
    public void count(){
        SmartPhoneServiceImpl spsi= new SmartPhoneServiceImpl();
        assertNotNull(spsi.count());
        //fallo
        assertTrue(spsi.count()<0);
        assertEquals(3, (int) spsi.count());
    }

    @Test
    @DisplayName("Test para la funcion findOne")
    public void findOne(){
        SmartPhoneServiceImpl spsi = new SmartPhoneServiceImpl();
        assertThrows(IllegalArgumentException.class, () -> spsi.findOne(null));
    }

    @Test
    @DisplayName("Test para la funcion count, usando assertAll")
    public void countAssertAll(){
        SmartPhoneServiceImpl spsi = new SmartPhoneServiceImpl();
        assertAll(
                () -> assertNotNull(spsi.count()),
                () -> assertTrue(spsi.count()>0),
                () -> assertEquals(3, (int) spsi.count())
        );
    }

    //Una funcion lambda ayuda a referenciar métodos anonimos o sin nombre, ayudando a escribir un codigo mas claro.

    //La opción BeforeEach se utiliza para escoger un metodo que debe ejecutarse antes de cada metodo de la clase.
    //La opción AfterEach se utiliza para escoger un metodo que debe ejecutarse despues de cada metodo de la clase.
    //Con estas dos opciones nos podemos asegurar de tener un codigo y entorno mas controlado.

    //La opcion BeforeAll se utiliza par

}
