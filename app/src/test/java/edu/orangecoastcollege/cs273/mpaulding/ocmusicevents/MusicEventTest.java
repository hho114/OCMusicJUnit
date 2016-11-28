package edu.orangecoastcollege.cs273.mpaulding.ocmusicevents;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import static org.junit.Assert.*;

import static junit.framework.Assert.*;


public class MusicEventTest {

    private MusicEvent mMusicEvent;

    @Before
    public void setUp() throws Exception {

        mMusicEvent = new MusicEvent();
        mMusicEvent.setTitle("Test title");
        mMusicEvent.setDate("12/12/16");
        mMusicEvent.setDay("tuesday");
        mMusicEvent.setTime("12:12");
        mMusicEvent.setLocation("92704");
        mMusicEvent.setAddress1("1232 oneway st");
        mMusicEvent.setImageName("Party");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getTitle() throws Exception {
        //assertEquals("You done goofed.", "", mMusicEvent.getTitle());
        //assertNull("Expected the title to be NULL", mMusicEvent.getTitle());
        assertEquals("Test title", mMusicEvent.getTitle());
    }

    @Test
    public void getDate() throws Exception {
        assertNotNull(mMusicEvent.getDate());
    }

    @Test
    public void getDay() throws Exception {
        assertEquals("tuesday", mMusicEvent.getDay());
    }

    @Test
    public void getTime() throws Exception {
        assertEquals("12:12", mMusicEvent.getTime());
    }

    @Test
    public void getLocation() throws Exception {
        assertEquals("92704", mMusicEvent.getLocation());
    }

    @Test
    public void getAddress1() throws Exception {
        assertEquals("1232 oneway st", mMusicEvent.getAddress1());
    }

    @Test
    public void getAddress2() throws Exception {

    }

    @Test
    public void getImageName() throws Exception {
        assertNotNull(mMusicEvent.getImageName());
    }

}