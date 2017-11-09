package fr.duong.services;

import fr.duong.entities.Book;
import fr.duong.entities.Exemplaire;
import fr.duong.models.BookDto;

import java.util.List;

/**
 * @author van.duong
 */
public class BookService implements IBookService {
    @Override
    public List<Book> getBookList() {
        return null;
    }

    @Override
    public Book findById(int id) {
        return null;
    }

    @Override
    public Exemplaire borrow(int idExemplaire) {
        return null;
    }
}
