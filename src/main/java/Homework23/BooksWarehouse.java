package Homework23;

import javax.persistence.*;

@Entity
@Table(name = "book_warehouse")
class BooksWarehouse {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Books bookID;

    @Column(name = "stock_balance")
    private int stockBalance;

    public BooksWarehouse() {
    }

    public BooksWarehouse(int stockBalance) {
        this.stockBalance = stockBalance;
    }

    public Books getBookID() {
        return bookID;
    }

    public int getStockBalance() {
        return stockBalance;
    }

    public void setStockBalance(int stockBalance) {
        this.stockBalance = stockBalance;
    }
}

