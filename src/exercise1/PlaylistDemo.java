package exercise1;

/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        Ferzan
 * Student ID:  240444049
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // --- Default constructor ---
        System.out.println("Default Track:");
        Track defaultTrack = new Track();
        System.out.println(defaultTrack);
        System.out.println();

        // --- Title-only constructor ---
        System.out.println("Title-only track:");
        Track titleTrack = new Track("Neon Lights");
        System.out.println(titleTrack);
        System.out.println();

        // --- Title + artist constructor ---
        System.out.println("Title + Artist Track:");
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println(titleArtistTrack);
        System.out.println();

        // --- Full constructor ---
        System.out.println("Full Track (non-explicit):");
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println(fullTrack);
        System.out.println();

        // --- Invalid duration test ---
        System.out.println("Invalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -50, false);
        System.out.println(invalidTrack);
        System.out.println();

        // --- Getter test ---
        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Getter Test:");
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.isExplicit());
    }
}