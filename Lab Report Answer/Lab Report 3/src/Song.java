
public class Song {
    private String title, filename, singer, duration;
    private int year;
    private static Song[] list = new Song[20];

    public Song() {
        
    }
    
    public Song(String title, String filename, String singer, String duration, int year) {
        this.title = title;
        this.filename = filename;
        this.singer = singer;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getFilename() {
        return filename;
    }

    public String getSinger() {
        return singer;
    }

    public String getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }
    
    public void addList(Song song, int i) {
        list[i] = song;
    }
    
    public void sortByTitle() {
        Song temp;
        for (int i = 0; i<list.length - 1; i++) {
            for (int j = 0; j<list.length - 1; j++) {
                if(list[j] == null || list[j+1]==null) continue;
                if(list[j].getTitle().compareToIgnoreCase(list[j+1].getTitle())>0){
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
        }
    }
    }
    }
        
    public void sortByDuration() {
        Song temp;
        for (int i = 0; i<list.length - 1; i++) {
            for (int j = 0; j<list.length - 1; j++) {
                if(list[j] == null || list[j+1]==null) continue;
                if(list[j].getDuration().compareToIgnoreCase(list[j+1].getDuration())>0){
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
        }
    }
    }
    }
    
    public boolean searchByTitle (String title, boolean found) {
        for (Song song : list) {
            if(song==null) break;
            if(title.equalsIgnoreCase(song.getTitle())) {
                System.out.println(toString(song));
                found = true;
            }
        }
        return found;
    }
    
    public boolean searchBySinger (String singer, boolean found) {
        for (Song song : list) {
            if(song==null) break;
            if(singer.equalsIgnoreCase(song.getSinger())) {
                System.out.println(toString(song));
                found = true;
            }
        }
        return found;
    }
    
    public String play (int current) {
        System.out.println("\nPlaying ... ...");
        return toString(list[current]);
    }
    
    public String next (int current) {
        System.out.println("\nNext song");
        System.out.println("\nPlaying ... ...");
        return toString(list[current]);
    }
    
    public String previous (int current) {
        System.out.println("\nPrevious song");
        System.out.println("\nPlaying ... ...");
        return toString(list[current]);
    }
    
    public String toString (Song song) {
       return "\nTitle    : "+song.getTitle()
             +"\nFilename : "+song.getFilename()
             +"\nSinger   : "+song.getSinger()
             +"\nDuration : "+song.getDuration()
             +"\nReleased : "+song.getYear();

    }
}