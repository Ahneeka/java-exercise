package chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {
    @Test
    void  constructorSetTest(){
        Human human = new Human();
        human.setLastName("Jas");
        human.setFirstName("Ahneeka");
        human.setPhoneNumber("08028806024");
        human.setEmailAddress("JasAhneeka111@gmail.com");


        Native cohort = new Native(human);
        assertEquals("Ahneeka",cohort.getFirstName());

    }

}