package model;

import javax.persistence.*;
import java.util.Objects;

@Entity

public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long isbn;

    @Column(nullable = false, length = 80)
    /*** The Title of the Book */
    private String title;

    @Column(nullable = false, length = 4)
    /*** The Year the Book was published */
    private int yearPublished;

    @ManyToOne
    @JoinColumn(name = "publisher_name", referencedColumnName = "name")
    private Publishers publisher;

    @ManyToOne
    @JoinColumn(name = "authoring_entity_name", referencedColumnName = "name")
    private AuthoringEntities authoringEntity;


    public Books(){
    }

    public Books(Long isbn, String title, int yearPublished, Publishers publisher, AuthoringEntities authoringEntity) {
        this.isbn = isbn;
        this.title = title;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.authoringEntity = authoringEntity;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public Publishers getPublisher() {
        return publisher;
    }

    public AuthoringEntities getAuthoringEntity() {
        return authoringEntity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(Publishers publisher) {
        this.publisher = publisher;
    }

    public void setAuthoringEntity(AuthoringEntities authoringEntity) {
        this.authoringEntity = authoringEntity;
    }

    @Override
    public String toString() {
        return "Books{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", publisher=" + publisher +
                ", authoringEntity=" + authoringEntity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return yearPublished == books.yearPublished && isbn.equals(books.isbn) && title.equals(books.title) && publisher.equals(books.publisher) && authoringEntity.equals(books.authoringEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, yearPublished, publisher, authoringEntity);
    }
} //End of Books Class
