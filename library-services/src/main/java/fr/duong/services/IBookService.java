package fr.duong.services;

import fr.duong.models.BookDto;

import java.util.List;

/**
 * @author van.duong
 */
public interface IBookService {

    public List<BookDto> getBookList();
}
