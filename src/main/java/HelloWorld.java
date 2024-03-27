import java.time.LocalDate;
class HelloWorld {
  public static void main(String[] args) {
    User user = new User("Thanh", "2002-10-24");
    

    Book carmilla = new Book("Carmilla", "Sheridan Le Fanu", 270);
    AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 30000);
    Ebook jeeves = new Ebook("Carry On Jeeves", "P.G. Wodehouse", 280, "PDF");
    System.out.println(jeeves.toString());
  }
}