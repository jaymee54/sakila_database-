package demo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class ActorTest {
     Actor testactor = new Actor();
     @Test
     public void testgetfirstname(){
         testactor.setfirstname("Bob");
         Assertions.assertEquals("Bob",testactor.getfirstname(), "get/set firstname not working");
    }
    @Test
    public void testgetlastname(){
        testactor.setlastname("Bob");
        Assertions.assertEquals("Bob",testactor.getlastname(), "get/set lastname not working");
    }
    @Test
    public void testgetactorid(){
        testactor.setactorid(999);
        Assertions.assertEquals(999,testactor.getactorid(), "get/set actor id not working");
    }
}
// update this
