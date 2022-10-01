package org.hbrs.s1.ws22.uebung1.control;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    Translator t;

    @BeforeEach
    void setUp() {
        t = new GermanTranslator();
    }



    @Test
    void translateNumber() {


        //========================================================================================================
        // Positiv: Test mit dem Eingabewert 5 (Repräsentant von pos_ÄK: [1...10])
        //========================================================================================================

        assertEquals("fünf", t.translateNumber(5));


        //========================================================================================================
        // Negativ: Exception Test mit dem Eingabewert -5 (Repräsentant von neg_ÄK: [< 0])
        //========================================================================================================

        assertThrows(IllegalArgumentException.class, () -> t.translateNumber(-5)); //Überprüft, ob die Exception einer IllegalArgumentException entspricht

        //Um zu überprüfen, ob die Message der Exception mit der Erwarteten übereinstimmt muss die Exception zunächst in Form eines Strings abgespeichert werden
        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> t.translateNumber(-5)); //Exception abspeichern

        String expectedMessage2 = "Übersetzung der Zahl -5 nicht möglich (" + t.version + ")" ;
        String actualMessage2 = exception2.getMessage();

        assertEquals(actualMessage2, expectedMessage2);


        //========================================================================================================
        // Negativ: Exception Test mit dem Eingabewert 11 (Repräsentant von neg_ÄK: [> 10])
        //========================================================================================================

        assertThrows(IllegalArgumentException.class, () -> t.translateNumber(11)); //Überprüft, ob die Exception einer IllegalArgumentException entspricht

        //Um zu überprüfen, ob die Message der Exception mit der Erwarteten übereinstimmt muss die Exception zunächst in Form eines Strings abgespeichert werden
        Exception exception = assertThrows(IllegalArgumentException.class, () -> t.translateNumber(11)); //Exception abspeichern

        String expectedMessage = "Übersetzung der Zahl 11 nicht möglich (" + t.version + ")" ;
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage, expectedMessage);


        //========================================================================================================
        // Negativ: Exception Test mit dem Eingabewert 0 (separater Wert)
        //========================================================================================================

        assertThrows(IllegalArgumentException.class, () -> t.translateNumber(0)); //Überprüft, ob die Exception einer IllegalArgumentException entspricht

        //Um zu überprüfen, ob die Message der Exception mit der Erwarteten übereinstimmt muss die Exception zunächst in Form eines Strings abgespeichert werden
        Exception exception3 = assertThrows(IllegalArgumentException.class, () -> t.translateNumber(0)); //Exception abspeichern

        String expectedMessage3 = "Übersetzung der Zahl 0 nicht möglich (" + t.version + ")" ;
        String actualMessage3 = exception3.getMessage();

        assertEquals(actualMessage3, expectedMessage3);


    }


}
