package com.semanticsquare.thrillio.entities;

import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void isKidFriendlyEligible() {
        // Test 1
        Book book=BookmarkManager.getInstance().createBook(4000,"Walden",1854,"Wilder Publications",new String[]{"Henry David Thoreau"}, BookGenre.PHILOSOPHY,4.3);
        boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
        assertFalse("For Philosophy Genre - is isKidFriendlyEligible should return false",isKidFriendlyEligible);
        // Test 2
        book=BookmarkManager.getInstance().createBook(4000,"Walden",1854,"Wilder Publications",new String[]{"Henry David Thoreau"}, BookGenre.SELF_HELP,4.3);
        isKidFriendlyEligible = book.isKidFriendlyEligible();
        assertFalse("For SELF HELP Genre - is isKidFriendlyEligible should return false",isKidFriendlyEligible);
    }
}