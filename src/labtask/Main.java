package interfacetask;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(4);

        library.Library[0] = new Book("Harry Potter", "JK Rowling");
        library.Library[1] = new Book("Hunger Games", "Suzanne Collins");
        library.Library[2] = new DVD("Fight Club", "David Fincher");
        library.Library[3] = new DVD("Pulp Fiction", "Quentin Tarantino");

        library.checkOutItem(0,"John Cena");
        library.checkOutItem(2, "Jake Paul");

        library.displayLibraryStatus();
        System.out.println();
        library.returnItem(2);
        library.displayLibraryStatus();
    }
}
