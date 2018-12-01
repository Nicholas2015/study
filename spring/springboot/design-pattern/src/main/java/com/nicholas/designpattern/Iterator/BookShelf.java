package com.nicholas.designpattern.Iterator;

public class BookShelf implements Aggregate{

    private Book[] books;
    private int last;

    public BookShelf(int size) {
        this.books = new Book[size];
        this.last = 0;
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        books[last] = book;
        last++;
    }

    public int getLength(){
        return books.length;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
