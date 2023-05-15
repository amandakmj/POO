import java.util.Scanner;

public class Principal {
    private static Scanner input = new Scanner(System.in);
    private static MusicOrganizer musicOrganizer = new MusicOrganizer();

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            displayMenu();
            int choice = readChoice();
            performAction(choice);
        }
    }

    private static void displayMenu() {
        System.out.println("Music Organizer Program");
        System.out.println("------------------------");
        System.out.println("1. Add file to library");
        System.out.println("2. Play track");
        System.out.println("3. List all tracks");
        System.out.println("4. List tracks by artist");
        System.out.println("5. Remove track");
        System.out.println("6. Quit");
        System.out.println("------------------------");
    }

    private static int readChoice() {
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        input.nextLine();
        System.out.println();
        return choice;
    }

    private static void performAction(int choice) {
        switch (choice) {
            case 1:
                addFile();
                break;
            case 2:
                playTrack();
                break;
            case 3:
                listAllTracks();
                break;
            case 4:
                listTracksByArtist();
                break;
            case 5:
                removeTrack();
                break;
            case 6:
                quit();
                break;
            default:
                System.out.println("Invalid choice.");
                System.out.println();
        }
    }

    private static void addFile() {
        System.out.print("Enter filename: ");
        String filename = input.nextLine();
        musicOrganizer.addFile(filename);
        System.out.println("File added to library.");
        System.out.println();
    }

    private static void playTrack() {
        System.out.print("Enter track index: ");
        int index = input.nextInt();
        input.nextLine();
        musicOrganizer.playTrack(index);
        System.out.println();
    }

    private static void listAllTracks() {
        musicOrganizer.listAllTracks();
    }

    private static void listTracksByArtist() {
        System.out.print("Enter artist name: ");
        String artist = input.nextLine();
        musicOrganizer.listByArtist(artist);
        System.out.println();
    }

    private static void removeTrack() {
        System.out.print("Enter track index: ");
        int index = input.nextInt();
        input.nextLine();
        musicOrganizer.removeTrack(index);
        System.out.println("Track removed from library.");
        System.out.println();
    }

    private static void quit() {
        System.out.println("Goodbye!");
        musicOrganizer.stopPlaying();
        System.exit(0);
    }
}
