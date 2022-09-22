package Practice.DeitelExercises.Chapter3.Health_Record;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthProfileTest {
    HealthProfile profile;
    @BeforeEach
    void setUp() {
        profile = new HealthProfile();
    }
    @Test
    void setNameTest() {
        String Tunde = new String();
        String Olayemi = new String();
        profile.setName(Tunde, Olayemi);
        assertEquals(Tunde, Olayemi, profile.getName());
    }
    @Test
    void setDateOfBirthTest() {
        profile.setDateOfBirth(11, 10, 1998);
        assertEquals("1998-10-11", profile.getDateOfBirth());
    }
    @Test
    void setHeightTest() {
        profile.setHeight(5.8);
        assertEquals(5.8, profile.getHeight());
    }
    @Test
    void setWeightTest() {
        profile.setWeight(76);
        assertEquals(78, profile.getWeight());
    }
    @Test
    void getAgeTest() {
        profile.setDateOfBirth(11,10,1997);
        assertEquals(25, profile.getAge());
    }
    @Test
    void validDateTest() {
        profile.setDateOfBirth(-21, 12, 1998);
        assertEquals(null, profile.getDateOfBirth());
    }
}