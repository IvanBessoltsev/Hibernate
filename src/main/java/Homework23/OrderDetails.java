package Homework23;

import javax.persistence.*;

@Entity
@Table(name = "details")
class OrderDetails {
    @Id
    @Column(name = "order_id")
    private long orderID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Books bookID;

    @Column(name = "order_count")
    private int count;

    @Column(name = "price_order")
    private double price;

    public OrderDetails() {
    }

    public OrderDetails(int count, double price) {
        this.count = count;
        this.price = price;
    }
}