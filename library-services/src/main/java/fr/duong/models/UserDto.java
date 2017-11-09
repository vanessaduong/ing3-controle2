package fr.duong.models;

/**
 * @author van.duong
 */
public class UserDto {

    private String firstName;
    private String lastName;
    private ExemplaireDto[] exemplaires;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ExemplaireDto[] getExemplaires() {
        return exemplaires;
    }

    public void setExemplaires(ExemplaireDto[] exemplaires) {
        this.exemplaires = exemplaires;
    }
}
