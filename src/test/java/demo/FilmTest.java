package demo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FilmTest {
    Film testfilm = new Film();

    @Test
    void testgetFilmid() {
        testfilm.setFilmid(999);
        Assertions.assertEquals(999, testfilm.getFilmid(), "get/set film id not working");
    }
    void testgetFilmreleaseyear() {
        testfilm.setFilmreleaseyear(999);
        Assertions.assertEquals(999, testfilm.getFilmreleaseyear(), "get/set film release year not working");
    }
    void testgetFilmlanguageid() {
        testfilm.setFilmlanguageid(999);
        Assertions.assertEquals(999, testfilm.getFilmlanguageid(), "get/set film language id not working");
    }
    void testgetFilmrentalduration() {
        testfilm.setFilmrentalduration(999);
        Assertions.assertEquals(999, testfilm.getFilmrentalduration(), "get/set film rental duration not working");
    }
    void testgetFilmrentalrate() {
        testfilm.setFilmrentalrate(999);
        Assertions.assertEquals(999, testfilm.getFilmrentalrate(), "get/set film rental rate not working");
    }
    void testgetFilmlength() {
        testfilm.setFilmlength(999);
        Assertions.assertEquals(999, testfilm.getFilmlength(), "get/set film length not working");
    }
    void testgetFilmreplacementcost() {
        testfilm.setFilmreplacementcost(999);
        Assertions.assertEquals(999, testfilm.getFilmreplacementcost(), "get/set film replacement cost not working");
    }

    void testgetFilmtitle() {
        testfilm.setFilmtitle("Bob");
        Assertions.assertEquals("Bob", testfilm.getFilmtitle(), "get/set film title not working");
    }
    void testgetFilmdescription() {
        testfilm.setFilmdescription("Bob");
        Assertions.assertEquals("Bob", testfilm.getFilmdescription(), "get/set film description not working");
    }
    void testgetFilmrating() {
        testfilm.setFilmrating("Bob");
        Assertions.assertEquals("Bob", testfilm.getFilmrating(), "get/set film rating not working");
    }
    void testgetFilmspecialfeatures() {
        testfilm.setFilmspecialfeatures("Bob");
        Assertions.assertEquals("Bob", testfilm.getFilmspecialfeatures(), "get/set film special features not working");
    }
    void testgetFilmlastupdate() {
        testfilm.setFilmlastupdate("Bob");
        Assertions.assertEquals("Bob", testfilm.getFilmlastupdate(), "get/set film last update not working");
    }
}