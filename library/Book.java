class Book{
  String bookName;
  String bookAuthor;
  String bookId;
  String bookType;
  int bookCopy;

  public Book(){
    this.bookName = null;
    this.bookAuthor = null;
    this.bookId = null;
    this.bookType = null;
    this.bookCopy = 0;
  }
  public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy){
    this.bookName = bookName;
    this.bookAuthor = bookAuthor;
    this.bookId = bookId;
    this.bookType = bookType;
    this.bookCopy = bookCopy;
  }

  public void showInfo(){
    System.out.println("Book Information: \n Book Name: "+this.bookName+"\nAuthor Name: "+this.bookAuthor+"\nBook Id: "+this.bookId+"\nBook Type: "+this.bookType+"\nBook Copies: "+this.bookCopy+"\n--------------\n");
  }
  public void addBookCopy(int x){
      this.bookCopy = this.bookCopy+x;
  }
  public int getBookCopy(){
    return this.bookCopy;
  }
}
