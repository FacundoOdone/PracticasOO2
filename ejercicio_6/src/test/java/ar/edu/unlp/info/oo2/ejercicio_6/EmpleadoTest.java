/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class EmpleadoTest {
    private Temporario temporario;
    private Pasante pasante;
    private Planta planta;
    
    @BeforeEach
    void setUp() {
        temporario = new Temporario("Pepe Temporario", 20, true , 2);
        pasante = new Pasante ("Pepe Pasante", 6);
        planta = new Planta ("Pepe Planta", false, 4,25);
    }
    
    @Test
    void TestTemporario() {
        assertEquals(31170, temporario.calcularSueldo());
    }
    
    @Test
    void TestPasante() {
        assertEquals(28800, pasante.calcularSueldo());
    }
    
    @Test
    void TestPlanta() {
        assertEquals(98600, planta.calcularSueldo());
    }
}
