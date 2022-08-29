package com.example.lyclebackend.Item.entity;

import com.example.lyclebackend.converter.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name="item")
@Entity
public class Item extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    private Long itemId;

    @Column(name="title")
    private String title;

    @Column(name="price")
    private Integer price;

    @Column(name="content")
    private String content;

    @Column(name="item_img")
    private String itemImg;

    @Column(name="view_cnt")
    private Integer viewCnt;

    @OneToMany(mappedBy = "item")
    private List<ItemMember> itemMemberList = new ArrayList<>();
}
