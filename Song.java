/*
 * Activity 2.2.7
 *
 * A Song class for the MediaLibrary program
 */
public class Song
{
  private String title;
  private int rating;
  
  /*** Constructor ****/
  public Song(String t)
  {
    title = t;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
  
  public int getRating() {
    return rating;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void adjustRating(int r) {
    if (r > 0 && r < 11){
      rating = r;
    }
    else{
      rating = 0;
      System.out.println("Thats not a rating");
    }
    }
   public String toString() 
    {
        String info = "\"" + title + "\", is ";
        if (rating != 0) 
        { 
        info += ", rating is " + rating;
        }
        return info;
    }
}
