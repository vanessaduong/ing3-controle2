package fr.duong.entities;

import javax.persistence.*;

/**
 * @author van.duong
 */

@Entity(name = "Book")
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String title;
    private boolean status;
    private Category bookCategory;

    public Book() {

    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, Category bookCategory) {
        this.title = title;
        this.bookCategory = bookCategory;
    }

    @ManyToOne
    @JoinColumn(name = "book_category_id")
    public Category getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(Category bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
