package ar.edu.unlp.info.oo2.ejercicio_5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class FyleSystemTest {
	
	private Directorio vacio;
    private Directorio conUnArchivo;
    private Directorio conVariosArchivos;
    private Directorio conSubdirectorios;
    private Archivo grande;
    private Archivo backup2015;

    @BeforeEach
    void setUp() throws Exception {

        LocalDate date = LocalDate.of(2015, 1, 1);
        grande = new Archivo("grande.tmp", LocalDate.of(2016, 4, 2), (long)2000000);
        backup2015 = new Archivo("2015.zip", LocalDate.of(2016, 4, 6), (long)240000000);
        Directorio mysql = new Directorio("mysql", date);
        mysql.addArchivo(new Archivo("mysql01.log", LocalDate.of(2015, 12, 3), (long)1200000));
        mysql.addArchivo(new Archivo("mysql02.log", LocalDate.of(2014, 3, 3),(long) 2000000));
        mysql.addArchivo(new Archivo("mysql03.log", LocalDate.of(2013, 3, 21), (long)2000000));
        mysql.addArchivo(new Archivo("mysql04.log", LocalDate.of(2014, 7, 15), (long)2000000));
        Directorio older = new Directorio("older", date);
        older.addArchivo(backup2015);
        mysql.addArchivo(older);
        Directorio postgres = new Directorio("postgres", date);
        postgres.addArchivo(new Archivo("pg01.log", LocalDate.of(2015, 4, 12), (long)1400000));
        postgres.addArchivo(new Archivo("pg02.log", LocalDate.of(2016, 3, 8), (long)4000000));
        postgres.addArchivo(new Archivo("pg03.log", LocalDate.of(2016, 2, 13),(long)4000000));
        // Directorio vacío
        vacio = new Directorio("home", date);
        //"Directorio con un solo archivo"
        conUnArchivo = new Directorio("var", date);
        Archivo config = new Archivo("config.bak", LocalDate.of(2016, 4, 2), (long)128);
        conUnArchivo.addArchivo(config);
        // Directorio con varios archivos, pero sin subdirectorios"
        conVariosArchivos = new Directorio("tmp", date);
        conVariosArchivos.addArchivo(new Archivo("nada.tmp", LocalDate.of(2015, 5, 1),(long) 0));
        conVariosArchivos.addArchivo(new Archivo("chico.tmp", LocalDate.of(2013, 6, 3), (long)10));
        conVariosArchivos.addArchivo(grande);
        conVariosArchivos.addArchivo(new Archivo("mediano.tmp", LocalDate.of(1995, 11, 23), (long)10000));
        //Directorio con subdirectorios, archivos, y archivos dentro de los subdirectorios"
        conSubdirectorios = new Directorio("log", date);
        conSubdirectorios.addArchivo(new Archivo("sys.log", LocalDate.of(2016, 3, 3),(long) 90000));
        conSubdirectorios.addArchivo(mysql);
        conSubdirectorios.addArchivo(postgres);
    }

    @Test
    void testArchivoMasGrande() {
        assertEquals(null, vacio.archivoMasGrande());
        assertEquals("config.bak", conUnArchivo.archivoMasGrande().getNombre());
        assertEquals(grande, conVariosArchivos.archivoMasGrande());
        System.out.println("Me rompo aca abajo");
        assertEquals(backup2015, conSubdirectorios.archivoMasGrande());
        System.out.println("no llegue");
    }

    @Test
    void testArchivoMasNuevo() {
        assertEquals(null, vacio.archivoMasNuevo());
        assertEquals("config.bak", conUnArchivo.archivoMasNuevo().getNombre());
        assertEquals(grande, conVariosArchivos.archivoMasNuevo());
        assertEquals(backup2015, conSubdirectorios.archivoMasNuevo());
    }

    @Test
    void testTamanoTotalOcupado() {
        assertEquals(32, vacio.tamanioTotalOcupado());
        assertEquals(160, conUnArchivo.tamanioTotalOcupado()); //32 del directorio + 128 del archivo
        assertEquals(2010042, conVariosArchivos.tamanioTotalOcupado()); //  2M de grande + 10K + 0 + 10 + 32 directorio
        assertEquals(256690128, conSubdirectorios.tamanioTotalOcupado());
    }
	
	
}
