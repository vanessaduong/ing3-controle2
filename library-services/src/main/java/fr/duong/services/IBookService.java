package fr.duong.services;

import fr.duong.entities.Book;
import fr.duong.entities.Exemplaire;

import java.util.List;

/**
 * @author van.duong
 */
public interface IBookService {

    public List<Book> getBookList();
    public Book findById(int id);
    public Exemplaire borrow(int idExemplaire);

}
