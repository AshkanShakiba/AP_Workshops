/**
 * A class to keep musics details
 *
 * @author Ashkan Shakiba
 * @version 2021.04.05
 */
public class Music {
    private String address;
    private String artist;
    private String album;
    private String year;
    // to check if this is a favourited music track or not
    private boolean isFavourited;

    /**
     * create a Music only by knowning its address
     * other details will be "Unknown"
     *
     * @param address
     */
    public Music(String address){
        this.address=address;
        this.artist="Unknown";
        this.album="Unknown";
        this.year="Unknown";
        isFavourited=false;
    }

    /**
     * creat a Music with all details
     *
     * @param address
     * @param artist
     * @param album
     * @param year
     * @param isFavourited
     */
    public Music(String address,String artist,String album,String year,boolean isFavourited){
        this.address=address;
        this.artist=artist;
        this.album=album;
        this.year=year;
        this.isFavourited=isFavourited;
    }

    public String getAddress(){
        return address;
    }
    public String getArtist(){
        return artist;
    }
    public String getAlbum(){
        return album;
    }
    public String getYear(){
        return year;
    }
    public boolean isFavourited(){
        if(isFavourited)
            return true;
        return false;
    }
    public void setArtist(String artist){
        this.artist=artist;
    }
    public void setAlbum(String album){
        this.album = album;
    }
    public void setYear(String year){
        this.year=year;
    }

    /**
     * change favourited music to normal and vice versa
     */
    public void change(){
        if(isFavourited){
            isFavourited=false;
        }
        if(!isFavourited) {
            isFavourited = true;
        }
    }

    /**
     * print a music's details, without index
     */
    public void print(){
        System.out.println("Address: "+address);
        System.out.println("Artist: "+artist);
        System.out.println("Album: "+album);
        System.out.println("Year: "+year);
        if(isFavourited){
            System.out.println("❤");
        }
    }

    /**
     * print a music's details with showing its index
     * @param index
     */
    public void print(int index){
        System.out.println("Track #"+index);
        print();
    }
}