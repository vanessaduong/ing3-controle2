package fr.duong.models;

/**
 * @author van.duong
 */
public class BookDto {

    private String title;
    private CategoryDto category;
    private boolean status;
    private ExemplaireDto[] exemplaires;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ExemplaireDto[] getExemplaires() {
        return exemplaires;
    }

    public void setExemplaires(ExemplaireDto[] exemplaires) {
        this.exemplaires = exemplaires;
    }
}
