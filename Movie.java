/*
 * Activity 2.2.7
 *
 * A Movie class for the MediaLibrary program
 */
public class Movie
{
  private String title;
  private double duration;
  private int rating;
  
  /*** Constructor ****/
  public Movie(String t, double a)
  {
    title = t;
    duration = a;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double a) {
    duration = a;
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
        String info = "\"" + title + "\", is " + duration + " hours long.";
        if (rating != 0) 
        { 
        info += ", rating is " + rating;
        }
        return info;
    }
}
