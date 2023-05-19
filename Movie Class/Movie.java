import java.lang.*;
public class Movie
{
	private String movieName;
	private int releaseYear;
	
	public Movie()
	{}
	
	public Movie(String movieName,int releaseYear)
	{
	System.out.println("Parameterized Constructor Called");
	this.movieName=movieName;
	this.releaseYear=releaseYear;
	}
	void setName(String movieName)
	{
		this.movieName=movieName;
	}
	public void Display()
	{
		System.out.println("Movie Name - ")+movieName;
		System.out.println("Release Year - ")+releaseYear;
	}
}