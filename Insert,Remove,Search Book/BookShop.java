import java.lang.*;
public class BookShop
{
	private String name;
	private TextBook textBooks[];
	private StoryBook storyBooks[];

	public BookShop()
	{
	   
	}
	public BookShop(String name)
	{
		this.name=name;
		System.out.println("");
		System.out.println(" 	-   "+name+"   - 	");
		System.out.println("");
		textBooks= new TextBook[100];
		storyBooks=new StoryBook[100];
	}

	public boolean insertTextBook(TextBook tb)
	{
     boolean flag=false;
		for(int i=0;i<textBooks.length;i++)
		{
			if(textBooks[i]==null)
				{
					textBooks[i]=tb;
					flag=true;
					break;
				}
		}
		if(flag==true) 
		{
			return true;
		}
		else 
		{
			return false;
		}
    }

    public boolean removeTextBook(TextBook tb)
	{
		System.out.println("");
		System.out.println("New Booklist After Removal.");
		//System.out.println("");
		boolean flag=false;
		for(int i=0;i<textBooks.length;i++)
		{
			if(textBooks[i]==tb)
			{
				textBooks[i]=null;
				flag=true;
				break;
			}
    }
		if(flag==true) 
		{
			return true;
		}
		else 
		{
			return false;
		}
    }

    public TextBook searchTextBook(String isbn)
    {
		boolean flag=false;
		int i;
		for(i=0;i<textBooks.length;i++)
		{
			if(textBooks[i]!=null)
			{
				if(textBooks[i].getIsbn()==isbn) 
				{
					flag=true;
					break;
				}
			}
		}
		if(flag==true) 
		{
			System.out.println("");
			System.out.println("Book Found!!!");
			System.out.println("");
			return textBooks[i];
		}
		else 
		{
			System.out.println("");
			System.out.println("Didn't Find The Book!!!");
			System.out.println("");
			return textBooks[--i];
		}
    }

    public void showAllTextBooks()
	{
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i]!=null)
			{
				textBooks[i].showDetails();
			}
		}
	}
  
	public boolean insertStoryBook(StoryBook tb)
	{
		boolean flag=false;
		for(int i=0;i<storyBooks.length;i++)
		{
			if(storyBooks[i]==null) 
			{
				storyBooks[i]=tb;
				flag=true;
				break;
			}
		}
		if(flag==true) 
		{
			return true;
		}
		else 
		{
			return false;
		}
    }

    public boolean removeStoryBook(StoryBook tb)
	{
		System.out.println("");
		System.out.println("New Booklist After Removal.");
		//System.out.println("");
		boolean flag=false;
		for(int i=0;i<storyBooks.length;i++)
		{
			if(storyBooks[i]==tb) 
			{
				storyBooks[i]=null;
				flag=true;
				break;
			}
		}
		if(flag==true) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public StoryBook searchStoryBook(String isbn)
	{
		boolean flag=false;
		int i;
		for(i=0;i<storyBooks.length;i++)
		{
			if(storyBooks[i]!=null)
			{
				if(storyBooks[i].getIsbn()==isbn) 
				{
					flag=true;
					break;
				}
			}
		}
		if(flag==true) 
		{
			System.out.println("");
			System.out.println("Book Found!!!");
			System.out.println("");
			return storyBooks[i];
		}
		else 
		{
			System.out.println("");
			System.out.println("Didn't Find The Book!!!");
			System.out.println("");
			return storyBooks[--i];
		}
	}

	public void showAllStoryBooks()
	{
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i]!=null)
			{
				storyBooks[i].showDetails();
			}
		}
	}
}