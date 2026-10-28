package exercise1;

/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 *
 * Your Name:        Ferzan
 * Your Student ID:  240444049

 */
public class Track {

    // -------------------------------------------------------
    // Instance variables
    // -------------------------------------------------------
    private String title;
    private String artist;
    private int    durationSeconds;
    private boolean isExplicit;

    // -------------------------------------------------------
    // TODO 1: Full constructor (all four parameters).
    //         Validate durationSeconds — must be >= 0.
    //         If invalid, print: "Warning: Invalid duration. Setting to 0."
    //         and set durationSeconds to 0.
    // -------------------------------------------------------
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
        this.isExplicit = isExplicit;
    }

    // -------------------------------------------------------
    // TODO 2: Title + artist constructor.
    //         Delegate to the full constructor using this(...).
    //         Default: durationSeconds = 0, isExplicit = false
    // -------------------------------------------------------
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    // -------------------------------------------------------
    // TODO 3: Title-only constructor.
    //         Delegate to the full constructor using this(...).
    //         Default: artist = "Unknown Artist", duration = 0, explicit = false
    // -------------------------------------------------------
    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    // -------------------------------------------------------
    // TODO 4: Default constructor.
    //         Delegate to the full constructor using this(...).
    // -------------------------------------------------------
    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    // -------------------------------------------------------
    // TODO 5: Getters for all four fields.
    // -------------------------------------------------------
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    // -------------------------------------------------------
    // TODO 6: getDurationFormatted()
    //         Returns duration as "m:ss" — ex., 225 seconds -> "3:45"
    //         Hint: minutes = durationSeconds / 60
    //               seconds = durationSeconds % 60
    //         Use String.format to ensure seconds is always two digits: "%02d"
    // -------------------------------------------------------
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    // -------------------------------------------------------
    // TODO 7: toString()
    //         Returns: "\"Title\" by Artist [m:ss] [EXPLICIT]"
    //         Only append " [EXPLICIT]" if isExplicit is true.
    //         Example: "\"Neon Lights\" by Stellar Echo [4:02] [EXPLICIT]"
    //         Example: "\"Ocean Drive\" by Midnight Pulse [3:30]"
    // -------------------------------------------------------
    @Override
    public String toString() {
        String result = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";
        if (isExplicit) {
            result += " [EXPLICIT]";
        }
        return result;
    }
}