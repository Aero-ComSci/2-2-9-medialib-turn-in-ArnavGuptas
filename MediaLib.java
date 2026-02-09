/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  private static String owner = "Mr. Baez";
  public static int totalCount = 0;
  public static int totalBookCount = 0;
  public static int totalMovieCount = 0;
  public static int totalSongCount = 0;

  public static String getOwner(){
    return owner;
  }

  public void addBook(Book b)
  {
    if (book == null){
      totalCount++;
      totalBookCount++;
    }
    book = b;
  }
  public void addMovie(Movie m)
  {
    if (movie == null){
      totalCount++;
      totalMovieCount++;
    }
    movie = m;
  }
  public void addSong(Song m)
  {
    if (song == null){
      totalCount++;
      totalSongCount++;
    }
    song = m;
  }

  public int getNumEntries(){
    return totalCount;
  }
  public int getNumSongs(){
    return totalSongCount;
  }
  public int getNumMovies(){
    return totalMovieCount;
  }
  public int getNumBooks(){
    return totalBookCount;
  }

  public String toString() 
  {
    //modify to show the attributes
    String info = "The book: " + book + "\n The Movie: " + movie + "\n The Song: " + song + "\n Total Added: " + totalCount;
    return info;
  }
}