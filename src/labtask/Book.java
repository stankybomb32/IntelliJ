package interfacetask;

public class Book implements LibraryItem{
    String title, author, flag;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkout(String borrower) {
        if (flag == null){
            flag = borrower;
        }
        else{
            System.out.println("Book not available.");
        }

    }

    @Override
    public void returnItem() {
        flag = null;
    }

    @Override
    public boolean isAvailable() {
        if (flag == null){
            return true;
        }
        else{
            return false;
        }
    }
}
