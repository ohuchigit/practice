public class Book extends TangibleAsset {
  private String number;
  public Book(String name, int price, String color, String isbn) {
    super(neme, price, color);
    this.isbn = isbn;
  } 
  public String getIsbn() { return this.isbn; }
}
