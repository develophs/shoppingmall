package com.toy.shoppingmall.member;

import com.toy.shoppingmall.common.Address;
import com.toy.shoppingmall.common.BaseTimeEntity;
import com.toy.shoppingmall.common.RoleStatus;
import com.toy.shoppingmall.product.Product;
import com.toy.shoppingmall.review.Review;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="MEMBER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Embedded
    private Address address;

    @OneToMany
    private List<Product> products = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Review> reviews = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleStatus role;

}
