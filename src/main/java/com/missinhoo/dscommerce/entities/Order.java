package com.missinhoo.dscommerce.entities;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
    private OrderStatus status;

    @ManyToOne //vários pedidos só pode ter um usuário, os pedidos são únicos para cada usuários
    @JoinColumn(name = "client_id")//chave estrangeira que associa pedido com o usuário
    private User client;


}
