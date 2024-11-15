package interfacetask;

public interface LibraryItem {

    String getTitle();
    void checkout(String borrower);
    void returnItem();
    boolean isAvailable();
}
