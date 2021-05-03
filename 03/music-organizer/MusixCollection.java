import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of Musix.
 *
 * @author Ashkan Shakiba
 * @version 2021.04.05
 */
public class MusixCollection
{
    // An ArrayList for storing Musix.
    private ArrayList<Music> Musix;
    // A player for Musix.
    private MusicPlayer player;

    /**
     * Create a MusixCollection
     */
    public MusixCollection()
    {
        Musix=new ArrayList<Music>();
        player=new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */
    public void addFile(Music music)
    {
        Musix.add(music);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return Musix.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(!validIndex(index)){
            return;
        }
        Musix.get(index).print();
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        int i;
        for(i=0;i<Musix.size();i++){
            Musix.get(i).print(i+1);
        }
    }

    /**
     * Show a list of favourited files in the collection.
     */
    public void listFavouritedFiles(){
        int i=1;
        Iterator<Music> it=Musix.iterator();
        while (it.hasNext()){
            Music music=it.next();
            if(music.isFavourited()){
                music.print(i);
                i++;
            }
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(!validIndex(index)){
            return;
        }
        Musix.remove(Musix.get(index));
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(!validIndex(index)){
            return;
        }
        player.startPlaying(Musix.get(index).getAddress());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        if(index<Musix.size()){
            return true;
        }
        else {
            System.out.println("Invalid index");
            return false;
        }
    }

    /**
     * search for a word in musics' addresses and artists
     * @param word that we are searching for
     */
    public void search(String word){
        int i=1;
        Iterator<Music> it=Musix.iterator();
        while (it.hasNext()){
            Music music=it.next();
            if(music.getAddress().contains(word) || music.getArtist().contains(word)){
                System.out.println("Search result #"+i);
                music.print();
                i++;
            }
        }
    }
}