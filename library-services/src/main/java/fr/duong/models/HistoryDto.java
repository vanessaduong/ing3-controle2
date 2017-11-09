package fr.duong.models;

import java.util.Date;

/**
 * @author van.duong
 */
public class HistoryDto {
    private Date borrowDate;
    private Date returnDate;
    private String userIdentity;
    private String exemplaireIdentity;

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    public String getExemplaireIdentity() {
        return exemplaireIdentity;
    }

    public void setExemplaireIdentity(String exemplaireIdentity) {
        this.exemplaireIdentity = exemplaireIdentity;
    }
}
