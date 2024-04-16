package com.pruebas;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

@TestMethodOrder(MethodOrderer.class)
public class SmartphoneTest {



    @AfterEach
    public void after(){
        System.out.println("@AfterEach");
    }

    @BeforeEach
    public void before(){
        System.out.println("@BeforeEach");
    }


    @AfterAll
    public static void allAfter(){
        System.out.println("@AfterAll");
    }

    @BeforeAll
    public static void allBefore(){
        System.out.println("@BeforeAll");
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

    //La opcion BeforeAll se utiliza para escoger un metodo que debe ejecutarse una sola vez antes de los demas metodos de la clase.
    //La opcion AfterAll se utiliza para escoger un metodo que debe ejecutarse una sola vez despues de los demas metodos de la clase.
    //Con estas dos opciones nos podemos asegurar de tener un codigo y entorno mas limpio.

}   //La opcion TestMethodOrder se utiliza para especificar el orden en el que se deben ejecutar los metodos de la clase.
