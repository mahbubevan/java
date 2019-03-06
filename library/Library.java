class Library{
  String libName;
  String libAddress;
  Book []listOfBook;
  int totalBook;
  int index=0;

  public Library(){
      this.libName = null;
      this.libAddress =null;
  }
  public Library(String libName, String libAddress){
    this.libName = libName;
    this.libAddress = libAddress;
  }

  public void libSize(int size){
    this.listOfBook = new Book[size];
  }

  public void showLibInfo(){
    System.out.println("Library Information\n---------------\nLibrary Name: "+this.libName+"\nLibrary Address: "+this.libAddress);
    System.out.println("\nBook Info\n---------------------");
    for(int i=0;i<listOfBook.length;i++){
        this.listOfBook[i].showInfo();
    }
  }

  public void addNewBook(Book book){
    listOfBook[index] = book;
    index++;
    totalBook = totalBook +book.getBookCopy();
  }

  public void addNewBookCopy(Book book,int copy){
    for(int i=0;i<listOfBook.length;i++){
      if(book.bookName == listOfBook[i].bookName){
        this.listOfBook[i].addBookCopy(copy);
        this.totalBook = totalBook + book.getBookCopy();
      }else{
          System.out.println("Book is not exist");
      }
    }
  }


  public static void main(String []a){

    Book b = new Book("Gitanjali","Rabindranath Tagore","1","Probondho",10);
    Book b1 = new Book("Himu","Humayan Ahmed","2","Probondho",10);
    Book b2 = new Book("Hoimonti","Rabindranath Tagore","3","Probondho",10);
    Library l = new Library("Pathagar","Gazipur");
    l.libSize(3);
    l.addNewBook(b);
    l.addNewBook(b1);
    l.addNewBook(b2);
    l.addNewBookCopy(b1,20);
    l.showLibInfo();
  }
}
