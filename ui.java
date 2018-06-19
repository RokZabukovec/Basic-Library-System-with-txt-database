
/*
name: Library management system
author: Rok Zabukovec
Institution: Fiš
Subject: Intro to programming(Uvod v programiranje)
*/

import java.util.*;
import java.io.*;

public class ui {

    public static void main(String args[]) {

        // br for reading users choice in settings
        BufferedReader userChoice = new BufferedReader(new InputStreamReader(System.in));

        // list of books in a system
        Library listOfMaterial = new Library();
        // list of rented books
        ManageLibrary rented = new ManageLibrary();
        // database
        String file = "baza.txt";
        while (true) {
            // menu
            System.out.println("----------MENU-----------");
            System.out.println("ADD MATERIAL-------------(a)");
            System.out.println("DELETE MATERIAL----------(b)");
            System.out.println("RENT MATERIAL------------(c)");
            System.out.println("RETURN MATERIAL----------(d)");
            System.out.println("WRITE TO FILE------------(e)");
            System.out.println("READ FROM A FILE---------(f)");
            System.out.println("EXIT---------------------(x)\n");
            try {
                // users choice is saved to a variable which is then converted to lowercase
                // so that it isn't case sensitive.
                String choice = userChoice.readLine().toLowerCase();
                switch (choice) {
                case "a":
                    System.out.println("ADD MATERIAL TO SYSTEM");
                    System.out.println("Book----------------(1)");
                    System.out.println("Audio---------------(2)");
                    System.out.println("Magazine------------(3)");
                    System.out.println("Map-----------------(4)");
                    System.out.println("Video---------------(5)");
                    System.out.println("Katalog-------------(6)");
                    int addMaterial = Integer.parseInt(userChoice.readLine());
                    switch (addMaterial) {
                    /**
                     * Switch statment operates based on a different input from user. Its similar to
                     * if statments but it is more readable. with break; statemant program stops
                     * looking for another option. If we used continue. The programm would still
                     * look further.
                     */

                    /**
                     * In every case I created a new object and set its properties with set methods
                     * defined in their classes
                     */
                    case 1:
                        System.out.println("++++++++++ADD BOOK++++++++++\n++++++++++++++++++++++++++++");
                        Book book = new Book();
                        System.out.println("Genre: ");
                        String bookGenre = userChoice.readLine();
                        book.setGenre(bookGenre);
                        System.out.println("ISBN: ");
                        int isbn = Integer.parseInt(userChoice.readLine());
                        book.setIsbn(isbn);
                        System.out.println("Published date: ");
                        int year = Integer.parseInt(userChoice.readLine());
                        book.setYear(year);
                        System.out.println("Author: ");
                        String auth = userChoice.readLine();
                        book.addAuthor(auth);
                        String title = userChoice.readLine();
                        book.setTitle(title);
                        listOfMaterial.addMaterial(book);
                        System.out.println("\n" + book.toString());
                        System.out.println(listOfMaterial.getAllMaterial().toString() + "\n");
                        break;
                    case 2:
                        System.out.println("++++++++++ADD AUDIO++++++++++\n+++++++++++++++++++++++++++++");
                        Audio audio = new Audio();
                        System.out.println("Genre: ");
                        String audioGenre = userChoice.readLine();
                        audio.setGenre(audioGenre);
                        System.out.println("ISBN: ");
                        int audioIsbn = Integer.parseInt(userChoice.readLine());
                        audio.setIsbn(audioIsbn);
                        System.out.println("Published date: ");
                        int audioYear = Integer.parseInt(userChoice.readLine());
                        audio.setYear(audioYear);
                        System.out.println("Author: ");
                        String artist = userChoice.readLine();
                        audio.addAuthor(artist);
                        System.out.println("Album title: ");
                        String albumTitle = userChoice.readLine();
                        audio.setTitle(albumTitle);
                        listOfMaterial.addMaterial(audio);
                        System.out.println("\n" + audio.toString());
                        System.out.println(listOfMaterial.getAllMaterial().toString() + "\n");
                        break;
                    case 3:
                        System.out.println("++++++++++ADD MAGAZINE++++++++++\n++++++++++++++++++++++++++++++++");
                        Magazine magazine = new Magazine();
                        System.out.println("ISBN: ");
                        int magIsbn = Integer.parseInt(userChoice.readLine());
                        magazine.setIsbn(magIsbn);
                        System.out.println("Genre: ");
                        String magazineGenre = userChoice.readLine();
                        magazine.setGenre(magazineGenre);
                        System.out.println("Year published: ");
                        int yearPublished = Integer.parseInt(userChoice.readLine());
                        magazine.setYear(yearPublished);
                        System.out.println("Organisation: ");
                        String organisation = userChoice.readLine();
                        magazine.addAuthor(organisation);
                        System.out.println("Magazine name: ");
                        String magazineName = userChoice.readLine();
                        magazine.setTitle(magazineName);
                        listOfMaterial.addMaterial(magazine);
                        System.out.println("\n" + magazine.toString());
                        System.out.println(listOfMaterial.getAllMaterial().toString() + "\n");
                        break;

                    case 4:
                        System.out.println("++++++++++ADD MAP++++++++++\n++++++++++++++++++++++++++++++++");
                        Map map = new Map();
                        System.out.println("ISBN: ");
                        int mapIsbn = Integer.parseInt(userChoice.readLine());
                        map.setIsbn(mapIsbn);
                        System.out.println("Year: ");
                        int date = Integer.parseInt(userChoice.readLine());
                        map.setYear(date);
                        System.out.println("Map of: ");
                        String mapOf = userChoice.readLine();
                        map.setTitle(mapOf);
                        String author = userChoice.readLine();
                        map.addAuthor(author);
                        listOfMaterial.addMaterial(map);
                        System.out.println("\n" + map.toString());
                        System.out.println(listOfMaterial.getAllMaterial().toString() + "\n");
                        break;

                    case 5:
                        System.out.println("++++++++++ADD VIDEO++++++++++\n++++++++++++++++++++++++++++++++");
                        Video video = new Video();
                        System.out.println("ISBN: ");
                        int videoIsbn = Integer.parseInt(userChoice.readLine());
                        video.setIsbn(videoIsbn);
                        System.out.println("Genre: ");
                        String videoGenre = userChoice.readLine();
                        video.setGenre(videoGenre);
                        System.out.println("Year: ");
                        int publishedDate = Integer.parseInt(userChoice.readLine());
                        video.setYear(publishedDate);
                        System.out.println("Video title: ");
                        String videoTitle = userChoice.readLine();
                        System.out.println("Director: ");
                        String director = userChoice.readLine();
                        video.addAuthor(director);
                        video.setTitle(videoTitle);
                        System.out.println("Length: ");
                        int length = Integer.parseInt(userChoice.readLine());
                        video.setLength(length);
                        listOfMaterial.addMaterial(video);
                        System.out.println("\n" + video.toString());
                        break;
                    case 6:
                        System.out.println("++++++++++ADD KATALOG++++++++++\n++++++++++++++++++++++++++++++++");
                        Katalog katalog = new Katalog();
                        System.out.println("Vnesi število škatelj: ");
                        int stSkatelj = Integer.parseInt(userChoice.readLine());
                        katalog.setStSkatelj(stSkatelj);
                        System.out.println("Vnesi število kartic v vsaki škatlji: ");
                        int stKartic = Integer.parseInt(userChoice.readLine());
                        katalog.setStKartic(stKartic);
                        listOfMaterial.addMaterial(katalog);
                        System.out.println("\n" + katalog.toString());
                        break;
                    }
                    break;
                case "b":
                    System.out.println("ENTER ISBN OF MATERIAL FOR DELETING: ");
                    /**
                     * for deleting material from a system I asked a user to input a ISBN which is
                     * an id for a library material.
                     */
                    int isbn = Integer.parseInt(userChoice.readLine().trim());
                    for (int i = 0; i < listOfMaterial.getSize(); i++) {
                        // with for loop I check if a user entered the right isbn of an existing
                        // material
                        if (listOfMaterial.getAllMaterial().get(i).getISBN() == isbn) {
                            // Displays to a user the material which was deleted
                            listOfMaterial.deleteMaterial(i);
                            System.out.println("Material with title: " + "'"
                                    + listOfMaterial.getAllMaterial().get(i).getTitle() + "'" + " WAS DELETED");
                            i--;
                        } else {
                            // if the for loop doesnt find the right isbn
                            System.out.println("The material which you are trying to delete does not exist.");
                        }
                    }
                    break;
                case "c":
                    System.out.println("ENTER ISBN OF MATERIAL FOR RENTING: ");
                    int rentIsbn = Integer.parseInt(userChoice.readLine());
                    int counter = 0;
                    // checks if users search is already in a list for renting
                    for (int x = 0; x < rented.getSize(); x++) {
                        if (rented.managementList().get(x).getISBN() == rentIsbn) {
                            counter++;
                        }
                    }
                    // if the material is not in a list yet
                    if (counter == 0) {
                        for (int i = 0; i < listOfMaterial.getSize(); i++) {
                            if (listOfMaterial.getAllMaterial().get(i).getISBN() == rentIsbn) {
                                // if found add material to a rented list
                                rented.addmaterial(listOfMaterial.getAllMaterial().get(i));
                                System.out.println("ADDED!");
                            }
                        }
                        System.out.println("RENTED BOOKS: ");
                        // shows the user a list of rented books
                        for (int i = 0; i < rented.getSize(); i++) {
                            System.out.println(rented.managementList().get(i).getISBN() + "-"
                                    + rented.managementList().get(i).getTitle() + "\n");
                        }
                    } else {
                        System.out.println("Material is already in a list.");
                    }
                    break;
                case "d":
                    if (rented.getSize() == 0) {
                        // if rented list empty
                        System.out.println("There are no books to be returned.");
                        break;
                    }
                    System.out.println("ENTER ISBN OF MATERIAL FOR RETURNING: ");
                    int count = Integer.parseInt(userChoice.readLine());
                    for (int i = 0; i < rented.getSize(); i++) {
                        // if isbn is found, delete material
                        if (rented.managementList().get(i).getISBN() == count) {
                            rented.deleteMaterial(i);
                            // set index of a search to previous. Without that the program will still be on
                            // a empty array field
                            i--;
                        } else {
                            System.out.println("The material isn't in a list.");
                        }
                    }
                    for (int i = 0; i < rented.getSize(); i++) {
                        // displays user a list of still rented books
                        if (rented.getSize() > 0) {
                            System.out.println(rented.managementList().get(i).getISBN() + "-"
                                    + rented.managementList().get(i).getTitle() + "\n");
                        }
                    }
                    break;
                case "e":
                    // writes to a file which is predefined on global scope in the begining of a
                    // file.
                    System.out.println("WRITE TO FILE");
                    // FileWriter is meant for writing streams of characters.
                    FileWriter fw = new FileWriter(file);
                    // Prints formatted representations of objects to a text-output stream.
                    PrintWriter dat = new PrintWriter(fw);
                    for (int i = 0; i < listOfMaterial.getSize(); i++) {
                        String objectText = listOfMaterial.getAllMaterial().get(i).storeDescription();
                        // Replaces each substring of this string that matches the given regular
                        // expression with the given replacement.
                        String updateText = objectText.replaceAll("\n", System.lineSeparator());
                        dat.println(updateText);
                        System.out.println("All material was successfully updated!");
                    }
                    dat.close();
                    break;
                case "f":

                    FileReader readFile = new FileReader(file);
                    BufferedReader br = new BufferedReader(readFile);
                    int lineCounter = 0;
                    // Tells whether this stream is ready to be read.
                    while (br.ready()) {
                        // while file is not empty
                        while (br.readLine() != null)
                            lineCounter++;
                    }
                    br.close();
                    FileReader fr = new FileReader(file);
                    BufferedReader br2 = new BufferedReader(fr);
                    String[] append = new String[lineCounter];
                    while (br2.ready()) {
                        for (int i = 0; i < lineCounter; i++)
                            append[i] = br2.readLine();
                    }
                    br2.close();
                    // this for loop is searching for a specific characters wich represents the type
                    // of material and based on that creates apropriate object and sets its values.
                    for (int i = 0; i < lineCounter; i++) {

                        if (append[i].equals("ZB*")) {
                            Book bookReader = new Book();
                            bookReader.setIsbn(Integer.parseInt(append[i + 1]));
                            bookReader.setTitle(append[i + 2]);
                            bookReader.addAuthor(append[i + 3]);
                            bookReader.setYear(Integer.parseInt(append[i + 4]));
                            bookReader.setGenre(append[i + 5]);
                            listOfMaterial.addMaterial(bookReader);
                            System.out.println(bookReader.toString() + "\n");
                        }

                        else if (append[i].equals("ZM*")) {
                            Magazine magazineReader = new Magazine();
                            magazineReader.setIsbn(Integer.parseInt(append[i + 1]));
                            magazineReader.setTitle(append[i + 2]);
                            magazineReader.addAuthor(append[i + 3]);
                            magazineReader.setYear(Integer.parseInt(append[i + 4]));
                            magazineReader.setGenre(append[i + 5]);
                            listOfMaterial.addMaterial(magazineReader);
                            System.out.println(magazineReader.toString() + "\n");
                        }

                        else if (append[i].equals("ZA*")) {
                            Audio audioReader = new Audio();
                            audioReader.setIsbn(Integer.parseInt(append[i + 1]));
                            audioReader.setTitle(append[i + 2]);
                            audioReader.addAuthor(append[i + 3]);
                            audioReader.setYear(Integer.parseInt(append[i + 4]));
                            audioReader.setGenre(append[i + 5]);
                            listOfMaterial.addMaterial(audioReader);
                            System.out.println(audioReader.toString() + "\n");
                        }

                        else if (append[i].equals("ZV*")) {
                            Video videoReader = new Video();
                            videoReader.setIsbn(Integer.parseInt(append[i + 1]));
                            videoReader.setTitle(append[i + 2]);
                            videoReader.addAuthor(append[i + 3]);
                            videoReader.setYear(Integer.parseInt(append[i + 4]));
                            videoReader.setGenre(append[i + 5]);
                            videoReader.setLength(Integer.parseInt(append[i + 6]));
                            listOfMaterial.addMaterial(videoReader);
                            System.out.println(videoReader.toString() + "\n");

                        } else if (append[i].equals("ZMAP*")) {
                            Map mapReader = new Map();
                            mapReader.setIsbn(Integer.parseInt(append[i + 1]));
                            mapReader.setTitle(append[i + 2]);
                            mapReader.addAuthor(append[i + 3]);
                            mapReader.setYear(Integer.parseInt(append[i + 4]));
                            listOfMaterial.addMaterial(mapReader);
                            System.out.println(mapReader.toString() + "\n");
                        }
                    }
                    System.out.println("File was imported....");
                    break;
                case "x":
                    // programm stops
                    return;
                }
            } catch (IOException e) {
                System.out.println("Something went wrong with the input. Try Again");
            }
        }
    }
}
