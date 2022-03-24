package inner_class_exercise;

import linked_list_exercise.Album;
import linked_list_exercise.Song;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions." +
                "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("========================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=========================");
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;



        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replay " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {

        Album album = new Album("Greatest Hits", "Led Zeppelin");

        album.addSong("Stairway to Heaven", 5.42);
        album.addSong("Whole Lotta Love", 5.35);
        album.addSong("Kashmir", 4.25);
        album.addSong("Immigrant Song", 2.25);
        album.addSong("Ramble On", 4.28);
        album.addSong("When the Levee Breaks", 7.07);
        album.addSong("Heartbreaker", 4.15);
        album.addSong("All My Love", 5.52);
        album.addSong("Misty Mountain Hop", 4.58);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets Go", 3.45);
        album.addSong("Snowballed", 3.33);
        album.addSong("Evil Walks", 4.51);
        album.addSong("C.O.D", 5.25);
        album.addSong("Breaking the rules", 5.32);
        albums.add(album);

        //ADD SONGS TO PLAYLIST USING A LINKED LIST
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Heartbreaker", playList);
        albums.get(0).addToPlaylist("Ramble On", playList);
        albums.get(0).addToPlaylist("Speed King", playList);// DOES NOT EXIST

        albums.get(0).addToPlaylist(9, playList);
        albums.get(1).addToPlaylist(7, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(24, playList); //DOES NOT EXIST

        play(playList);

    }

}
