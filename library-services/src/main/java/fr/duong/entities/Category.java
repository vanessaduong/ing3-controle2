package fr.duong.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * @author van.duong
 */
@Entity(name = "Category")
@Table(name = "Category")
public class Category {

    private int id;
    private String name;
    private Set<Book> books;

    public Category(){

    }

    public Category(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String result = String.format(
                "Category[id=%d, name='%s']%n",
                id, name);
        if (books != null) {
            for(Book book : books) {
                result += String.format(
                        "Book[id=%d, name='%s']%n",
                        book.getId(), book.getTitle());
            }
        }

        return result;
    }
}
