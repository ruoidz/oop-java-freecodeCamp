import java.time.LocalDate;
class HelloWorld {
  public static void main(String[] args) {
    User user = new User();
    
    user.name = "Thanh";
    user.birthDay = LocalDate.parse("1995-01-31");

    Book book = new Book();
    book.title = "Carmilla";
    book.author = "Sheridan Le Fanu";

    user.borrow(book);

    System.out.printf("%s was born back in %s and he is now %d years old.", user.name, user.birthDay.toString(), user.age());

    System.out.printf("%s has borrowed these books: %s \n", user.name, user.books.toString());
    
  }
}