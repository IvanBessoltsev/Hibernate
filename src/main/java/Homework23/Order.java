package Homework23;

import javax.persistence.*;

@Entity
@Table(name = "orders")
class Order {
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private long clientID;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private long orderID;

    @Column(name = "purchase_amount")
    private double purchaseAmount;

    public Order() {
    }

    public Order(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}