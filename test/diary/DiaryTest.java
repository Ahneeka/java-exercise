package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary amirahDiary;

    @BeforeEach
    public  void setUp(){
        amirahDiary = new Diary("Amirah", "correctPassword");
    }

    @Test
    public  void  diaryExistTest(){
        assertNotNull(amirahDiary);
    }
    @Test
    public  void newDiaryIsLocked(){
        assertTrue(amirahDiary.islocked());
    }
    @Test
    public void lockedDiaryCanBeUnlockedTest(){
        assertTrue(amirahDiary.islocked());
        amirahDiary.UnlockWith("correctpassword");

        assertFalse(amirahDiary.islocked());
    }
    @Test
    public void wrongPasswordCannotUnlockDiaryTest(){
        assertTrue(amirahDiary.islocked());
        amirahDiary.UnlockWith("wrongPassword");
        assertTrue(amirahDiary.islocked());
    }
    @Test
    public  void diaryCanBeLockedTest(){
        amirahDiary.UnlockWith("correctpassword");
        assertFalse(amirahDiary.islocked());

        amirahDiary.lock();

        assertTrue(amirahDiary.islocked());
    }
    @Test
    public  void happeningCanBeAddedToTheDiary(){
        amirahDiary.UnlockWith("correctPassword");
        assertFalse(amirahDiary.islocked());

        amirahDiary.write("My Break Up With Simi",
                "I did not anything to him oh, he just came back one day and...");

        assertEquals(1, amirahDiary.numberOfHappening());
    }
    @Test
    public void happeningsCannotBeAddedWhenDiaryIsLockedTest(){
        assertTrue(amirahDiary.islocked());

        amirahDiary.write("My Break Up With Simi",
                "I did not anything to him oh, he just came back one day and...");

        assertEquals(0, amirahDiary.numberOfHappening());
    }

    @Test
    public  void entriesCannotBeAddedWhenDiaryIsLockedTest() {
        assertTrue(amirahDiary.islocked());
        try{
            amirahDiary.write("My Break Up With Simi",
                    "I did not anything to him oh, he just came back one day and..." );
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        assertEquals(0,amirahDiary.numberOfHappening());
    }

    @Test
    public void writingToLocckedDiaryThrowsException(){
        assertTrue(amirahDiary.islocked());

        assertThrows(Exception.class, ()-> amirahDiary.write("My Break Up With Simi",
                "I did not anything to him oh, he just came back one day and..."));
    }

    @Test
    public void happeningsCanBeFoundByIdTest(){
        amirahDiary.UnlockWith("correctPassword");
        assertFalse(amirahDiary.islocked());

        amirahDiary.write("My Break Up With Simi",
                "I did not anything to him oh, he just came back one day and...");

        assertEquals(1, amirahDiary.numberOfHappening());

        Happening happening = amirahDiary.findHappeningWithid(1);

        assertEquals(1, happening.getId());
        assertEquals("My Break Up With Simi",happening.getTitle());
        assertEquals("I did not anything to him oh, he just came back one day and...", happening.getBody());
    }
}
