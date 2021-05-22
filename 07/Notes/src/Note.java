import java.io.*;

/**
 * The type Note.
 */
public class Note implements Serializable{
    private int index;
    private String title;
    private String context;

    /**
     * Instantiates a new Note.
     *
     * @param index   the index
     * @param title   the title
     * @param context the context
     * @throws IOException the io exception
     */
    public Note(int index,String title,String context) throws IOException {
        this.index=index;
        this.title=title;
        this.context=context;
        ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("files/note"+index));
        output.writeObject(this);
    }

    /**
     * Get title string.
     *
     * @return the string
     */
    public String getTitle(){
        return title;
    }

    /**
     * Get note string.
     *
     * @return the string
     */
    public String getNote(){
        return "◈ "+title+"\n   "+context;
    }

    /**
     * Remove the file of note.
     */
    public void remove(){
        new File("files/note"+index).delete();
    }
}