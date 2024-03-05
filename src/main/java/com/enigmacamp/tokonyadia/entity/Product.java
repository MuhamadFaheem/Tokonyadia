package com.enigmacamp.tokonyadia.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DialectOverride;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "ms_product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SQLDelete(sql = "UPDATE ms_product set deleted = true where product_id =?")
//@DialectOverride.SQLDelete(dialect = "", override = null)
@Where(clause = "deleted = false")
public class Product {
    @Id
    @Column(name = "product_id")
    //@GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "product_name",nullable = false)
    private String productName;
    @Column(name = "product_price")
    private Integer productPrice;
    private Integer stock;
    private Boolean deleted = Boolean.FALSE;
    @Override
    public String toString() {
        return String.format("""
                \"Products\": {
                    \"product_id\": \"%s\",
                    \"product_name\": \"%s\",
                    \"product_price\": \"%d\",
                    \"stock\": \"%d\"
                }""",this.id,this.productName,this.productPrice,this.stock);
    }

    public Product(String pId, String pName, Integer pPrice, Integer pStock){
        this.id = pId;
        this.productName=pName;
        this.productPrice=pPrice;
        this.stock=pStock;
    }
}