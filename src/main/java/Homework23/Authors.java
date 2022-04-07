package Homework23;


import javax.persistence.*;

@Entity
@Table(name = "author")
class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private int authorID;

    @Column(name = "initials_author")
    private String initialsAuthor;

    public Authors() {
    }

    public Authors(String initialsAuthor) {
        this.initialsAuthor = initialsAuthor;
    }

    public String getInitialsAuthor() {
        return initialsAuthor;
    }

    public void setInitialsAuthor(String initialsAuthor) {
        this.initialsAuthor = initialsAuthor;
    }
}