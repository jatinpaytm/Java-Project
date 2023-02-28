package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.bgjobs.WebpageDownloaderTask;
import com.semanticsquare.thrillio.entities.Book;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;
import com.semanticsquare.thrillio.util.IOUtil;

import java.sql.SQLException;
import java.util.List;

public class Launch {
    //private static User[] users;
    private static List<User> users;

    //private static Bookmark[][] bookmarks;  // using arraylist now
    private static List<List<Bookmark>> bookmarks;
    private static void loadData() {
        System.out.println("1. Loading data ...");
        DataStore.loadData();

        users = UserManager.getInstance().getUsers();
        bookmarks = BookmarkManager.getInstance().getBookmarks();

        System.out.println(" Printing data ...");
//        printUserData();
//        printBookmarkData();

    }

    private static void printUserData(){
        for (User user : users){
            System.out.println(user);
        }
    }

    private static void printBookmarkData(){
        for(List<Bookmark> bookmarkList : bookmarks) {
            for (Bookmark bookmark : bookmarkList){
                System.out.println(bookmark);
            }
        }
    }
    private static void start() throws SQLException {
        // System.out.println("\n2. Bookmarking ...");
        for (User user : users) {
            View.browse(user,bookmarks);
        }

    }
    public static void main(String[] args) throws SQLException {
        loadData();   // we are loading the data
        start();   // start the process
        //IOUtil.write("http://www.javapractices.com/topic/TopicAction.do?Id=23",2000);

        //runDownloaderJob();
    }

    private static void runDownloaderJob(){
        WebpageDownloaderTask task = new WebpageDownloaderTask(true);
        (new Thread(task)).start();
    }


}
