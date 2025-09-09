//ex2 Laryssa Barbosa Soares - CB3031667
public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(testeBook);
    }
}

// Classe Book
class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    // Construtor 
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = new Author[authors.length];
        for (int i = 0; i < authors.length; i++) {
            this.authors[i] = authors[i];
        }
        this.price = price;
        this.qty = qty;
    }

    // Get
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        Author[] copy = new Author[authors.length];
        for (int i = 0; i < authors.length; i++) {
            copy[i] = authors[i];
        }
        return copy; // Retorna uma cópia do array (não altera o original)
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // Setter
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book[name=").append(name).append(",authors={");
        for (int i = 0; i < authors.length; i++) {
            sb.append(authors[i].toString());
            if (i < authors.length - 1) sb.append(",");
        }
        sb.append("},price=").append(price).append(",qty=").append(qty).append("]");
        return sb.toString();
    }
}

