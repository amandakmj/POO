public class Track {
    private int playCount;
    private int durationSeconds;
    private String artist;
    private String title;
    private String filename;

    public Track(String artist, String title, String filename) {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        durationSeconds = 0;
        playCount = 0;
    }

    public Track(String filename) {
        this.filename = filename;
        String[] parts = filename.split("/");
        String file = parts[parts.length - 1];
        String[] nameParts = file.split("-");
        artist = nameParts[0].trim();
        title = nameParts[1].trim();
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getFilename() {
        return filename;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void incrementPlayCount() {
        playCount++;
    }

    public void resetPlayCount() {
        playCount = 0;
    }

    public void play() {
        System.out.println("Playing track: " + title);
        incrementPlayCount();
    }

    public String getDetails() {
        return artist + " - " + title + " (" + durationSeconds + " seconds)";
    }
}