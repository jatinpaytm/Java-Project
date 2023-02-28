package com.semanticsquare.thrillio.entities;

import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void isKidFriendlyEligible() {
        // Test1
        Movie movie = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","",1941,new String[] {"Orson Welles","Joseph Cotten"},	new String[]{"Orson Welles"}, MovieGenre.HORROR,8.5);
        boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
        assertFalse("For Horror Genre - isKidFriendlyEligible should be false",isKidFriendlyEligible);
        // Test2
        movie = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","",1941,new String[] {"Orson Welles","Joseph Cotten"},	new String[]{"Orson Welles"}, MovieGenre.THRILLERS,8.5);
        isKidFriendlyEligible = movie.isKidFriendlyEligible();
        assertFalse("For Horror Genre - isKidFriendlyEligible should be false",isKidFriendlyEligible);
    }
}