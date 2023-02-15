
import java.util.Scanner;

public class Q2 {
    
    static Scanner s = new Scanner(System.in);
    static Song songObj = new Song();
    
    public static void main(String[] args) {
    Song song1 =  new Song("Blank Space", "blank_space.mp3", "Taylor Swift", "3:52", 2014);
        Song song2 = new Song("Wildest Dream", "wildest_dream.mp3", "Taylor Swift", "3:41", 2014);
        Song song3 = new Song("Back To December", "back_to_december.mp3", "Taylor Swift", "4:54", 2010);
        Song song4 = new Song("Baby", "baby.mp3", "Justin Bieber", "3:30", 2010);
        Song song5 = new Song("Stay", "stay.mp3", "Justin Bieber", "2:20", 2020);
        Song song6 = new Song("10000 Years", "10000_years.mp3", "JustinBieber", "2:47", 2021);
        Song song7 = new Song("Perfect", "perfect.mp3", "Ed Sheeran", "4:24", 2017);
        Song song8 = new Song("Photograph", "photograph.mp3", "Ed Sheeran", "4:26", 2014);
        Song song9 = new Song("See You Again", "see_you_again.mp3", "Wiz Kahlifa", "3:50", 2015);
        Song song10 = new Song("A Song to Sun","a_song_to_sun.mp3", "Erika Sawajiri", "5:00", 2006);
        
        Song[] list = {song1, song2, song3, song4, song5, song6, song7, song8, song9, song10};
        
        int current = 0;
        
        for(int i = 0; i<list.length; i++) {
            songObj.addList(list[i], i);
        }
         while(true){
            System.out.println("1. sort the song based on title.");
            System.out.println("2. sort the song based on duration.");
            System.out.println("3. search the song by title.");
            System.out.println("4. search the song by singer.");
            System.out.println("5. play."); // done
            System.out.println("6. next song.");
            System.out.println("7. previous song.");
            System.out.println("8. exit.");
            System.out.print("Select your option: ");
            // prompt user input
            int option = s.nextInt();
            s.nextLine();
            // execute user input
            switch(option){
                	case 1:
                    		songObj.sortByTitle();
                    		break;
                	case 2:
                   		songObj.sortByDuration();
                    		break;
                	case 3:
                    		search(option);
                    		break;
                	case 4:
                    		search(option);
                   		break;
                	case 5:
                    		System.out.println(songObj.play(current));
                    		break;
                	case 6:
                    		current++; // increase the current playing index by 1
                    		if(current>=list.length)current = 0; // check if its the last song
                    		System.out.println(songObj.next(current));
                    		break;
                	case 7:
                    		current--; // decrease the current playing index by 1
                    		if(current<0)current = list.length-1; // check if its the first song
                    		System.out.println(songObj.previous(current));
                    		break;
                	case 8:
                    		break;
                                // stopping condition
                	default:
                    		System.out.println("Invalid option.");;
                    		break;
            }
            if(option==8)break;
            System.out.println("\nPress Enter to continue: ");
            System.out.println("--------------------------------------------");
            s.nextLine(); // to prevent the menu display instantly after executing input
        }
}
         public static void search(int option){
            // initialise found as false in default
        	boolean found = false;
	// check if title or singer can be found
        	if(option==3){
            	System.out.print("Enter the title: ");
            	String title = s.nextLine();
            	found = songObj.searchByTitle(title, found);
        	}else{
            	System.out.print("Enter the singer: ");
            	String singer = s.nextLine();
            	found = songObj.searchBySinger(singer, found);
        	}
            if(!found)System.out.println("no song was found");
    }

        
 
}