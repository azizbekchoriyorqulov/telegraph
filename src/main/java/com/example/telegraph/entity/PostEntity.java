package com.example.telegraph.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "post")
@Builder
public class PostEntity extends BaseEntity{
    public String Title;
    public String author;
    @ManyToOne
    public UserEntity owner;
}
