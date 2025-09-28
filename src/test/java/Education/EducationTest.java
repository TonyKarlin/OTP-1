package Education;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EducationTest {
    Education education = new Education();

    @Test
    void getDegree() {
        assertEquals(9, education.getDegree("PhD"));
        assertEquals(6, education.getDegree("MSc"));
        assertEquals(4, education.getDegree("BSc"));
        assertThrows(RuntimeException.class, () -> education.getDegree("InvalidDegree"));
    }

}