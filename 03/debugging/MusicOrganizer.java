import java.util.ArrayList;
import java.util.Iterator;

public class MusicOrganizer {
    private ArrayList<String> tracks;
    public MusicOrganizer(){
        tracks=new ArrayList<>();
    }
    public void removeTrack(String nameLike) {
        String track;
        Iterator<String> iterator=tracks.iterator();
        while (iterator.hasNext()){
            track=iterator.next();
            if(track.contains(nameLike)){
                iterator.remove();
            }
        }
    }
}