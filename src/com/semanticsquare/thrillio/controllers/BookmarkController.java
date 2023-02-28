package com.semanticsquare.thrillio.controllers;

import com.semanticsquare.thrillio.constants.KidFriendlyStatus;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.BookmarkManager;

import java.sql.SQLException;

public class BookmarkController {
    // made singleton class
    private static BookmarkController instance = new BookmarkController();
    private BookmarkController() {}
    public static BookmarkController getInstance(){
        return instance;
    }
    public void saveUserBookmark(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
    }

    public void setKidFriendlyStatus(User user, String kidFriendlyStatus, Bookmark bookmark) throws SQLException {
        BookmarkManager.getInstance().setKidFriendlyStatus(user, KidFriendlyStatus.valueOf(kidFriendlyStatus),bookmark);
    }

    public void share(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().share(user,bookmark);
    }
}
