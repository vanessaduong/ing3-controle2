package fr.duong.controllers;

import fr.duong.models.BookDto;
import fr.duong.services.IBookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Controller;

/**
 * @author van.duong
 */
@Controller
public class BookController {

    @Autowired
    private IBookService bookService;

    @Autowired
    private ModelMapper modelMapper;

}
