package com.toy.shoppingmall.review;

import com.toy.shoppingmall.common.BaseTimeEntity;
import com.toy.shoppingmall.member.Member;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "REVIEW")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "review_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Lob
    @Column(nullable = true)
    private String content;

    @Column(nullable = false)
    private int score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;
}
