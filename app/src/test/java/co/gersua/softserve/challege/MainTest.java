/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package co.gersua.softserve.challege;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    private static Main main;

    @BeforeAll
    static void init() {
        main = new Main();
    }

    @Test
    void basicStringTest() {
        assertEquals("ABCD123", main.uniqueCharatersString("AABBCCD112233"));
    }

    @Test
    void emptyStringTest() {
        assertEquals("", main.uniqueCharatersString(""));
    }

    @Test
    void nullStringTest() {
        assertEquals("", main.uniqueCharatersString(null));
    }

    @Test
    void singleCharacterTest() {
        assertEquals("Z", main.uniqueCharatersString("ZZZZZZZZZZ"));
    }

    @Test
    void noDuplicatesTest() {
        assertEquals("QAZWSXEDCRFVTGBYHNUJMIKOLPqazwsxedcrfvtgbyhnujmikolp1234567890",
                main.uniqueCharatersString("QAZWSXEDCRFVTGBYHNUJMIKOLPqazwsxedcrfvtgbyhnujmikolp1234567890"));
    }

    @Test
    void whiteSpacesTest() {
        assertEquals(" ", main.uniqueCharatersString("                    "));
    }

    @Test
    void whiteSpacesAndCharactersTest() {
        assertEquals("A B", main.uniqueCharatersString("A A A A    B B   B           "));
    }

    @Test
    void specialCharactersTest() {
        assertEquals(",;.:´¨Ç`*^+¿'=9)(/&%$·\"!?",
            main.uniqueCharatersString(",,,;;;...:::´´´¨¨¨Ç`*^^**++¿¿''==9^+`+=)(/&%$·\"!!\"·$%&/()=?¿"));
    }

    @Test
    void tabsAndEntersTest() {
        assertEquals("\n\t", main.uniqueCharatersString("\n\t\n\t\n\t\n\t\n"));
    }

    @Test
    void unicodeCharactersTest() {
        assertEquals("\uD83D\uDE00\uDE09\uDE2C",
                main.uniqueCharatersString("\uD83D\uDE00\uD83D\uDE09\uD83D\uDE2C\uD83D\uDE00\uD83D\uDE09\uD83D\uDE2C\uD83D\uDE00\uD83D\uDE09\uD83D\uDE2C"));
    }
}
