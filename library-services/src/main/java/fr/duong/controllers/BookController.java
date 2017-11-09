package fr.duong.controllers;

import fr.duong.entities.Book;
import fr.duong.models.BookDto;
import fr.duong.services.BookService;
import fr.duong.services.IBookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author van.duong
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(value="/list/{id}", method= RequestMethod.GET)
    public ModelAndView bookList(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("book-list");
        Book bookList = bookService.findById(id);
        mav.addObject("bookList", bookList);
        return mav;
    }


}
