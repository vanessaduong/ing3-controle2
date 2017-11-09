package fr.duong.entities;

import javax.persistence.*;

/**
 * @author van.duong
 */

@Entity()
@Table(name = "Exemplaire")
public class Exemplaire {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
