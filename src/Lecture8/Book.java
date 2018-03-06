package Lecture8;

/**
 * A class for defining Book objects
 * @author ngsm
 */
public class Book {
    
    // instance variables
    private String title;
    private String author;
    private double price;
    private boolean onLoan;
    
    // Default constructor
    public Book()
    {
        title = "unknown";
        author = "unknown";
        price = 0.0;
        onLoan = false;
    }
    
    // constructor with arguments
    public Book(String inTitle, String inAuthor, double inPrice)
    {
        if (inTitle.equals(""))
            title = "unknown";
        else
            title = inTitle; 
        if (inAuthor.equals(""))
                author = "unknown";
        else
                author = inAuthor;
        if (inPrice >= 0)
            price = inPrice;
        else
            price = 0.0;
        onLoan = false;
    }
    
    //getters 
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    //setters
    public void setTitle(String newTitle)
    {
        if (!newTitle.equals(""))
            title = newTitle;
    }
    
    public void setAuthor(String newAuthor)
    {
        if (!newAuthor.equals(""))
            author = newAuthor;
    }
    
    public void setPrice(double newPrice)
    {
        if (newPrice >= 0)
            price = newPrice;
    }
    
    // a method that returns whether a book is available for loan
    public boolean isAvailable()
    {
        return !onLoan;
    }
    
    // borrow a book
    public boolean borrow()
    {
        if(isAvailable())
        {
            onLoan = true;
            return true;
        }
        else
            return false; // not available, cannot borrow
    }
 
    // return  a book
    public boolean returnBook()
    {
        if (onLoan)
        {
            onLoan = false;
            return true;
        }
        else
            return false; // it was not onLoan
        
    }
    
    /*
     returns a String
    <title> by <author> cost: <price> 
---- is currently available for loan. 
    or 
    ---- is already borrowed.
    */
    public String toString()
    {
        String result = title + " by " + author;
        result += " cost : " + price;
        if (isAvailable())
            result += " --- is currently available for loan";
        else
            result += " --- is already borrowed";
        return result;
    }
}
