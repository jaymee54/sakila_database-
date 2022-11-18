package demo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class ActorTest {
     Actor testactor = new Actor();
     @Test

    void testgetfirstname(){
         testactor.setfirstname("Bob");
         Assertions.assertEquals("Bob",testactor.getfirstname(), "get/set firstname not working");
    }
    void testgetlastname(){
        testactor.setlastname("Bob");
        Assertions.assertEquals("Bob",testactor.getlastname(), "get/set lastname not working");
    }
    void testgetactorid(){
        testactor.setactorid(999);
        Assertions.assertEquals(999,testactor.getactorid(), "get/set actor id not working");
    }
}
// update this
