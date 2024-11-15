package interfacetask;

public class Library {
    public LibraryItem[] Library;
    int size;

    Library(int size){
        Library = new LibraryItem[size];
        this.size = size;
    }

    void checkOutItem(int index, String borrower){
        Library[index].checkout(borrower);
    }

    void returnItem(int index){
        Library[index].returnItem();
    }

    void displayLibraryStatus(){
        for(int i=0;i<Library.length;i++){
            System.out.println("Title: "+ Library[i].getTitle() + "\nAvailable:"+Library[i].isAvailable());
        }
    }


}
