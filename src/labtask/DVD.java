package interfacetask;

public class DVD implements LibraryItem{
    String title, director, flag;

    DVD(String title, String director){
        this.title = title;
        this.director = director;
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
            System.out.println("DVD not available.");
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
