package com.ower.entity;

import com.ower.enums.GENRES;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "genres")
@NoArgsConstructor
@Getter
@Setter
public class Genre extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private GENRES name;

    @ManyToMany(mappedBy = "genres", fetch = FetchType.LAZY)
    private Set<Movie> movies = new HashSet<>();


    public Genre(GENRES name) {
        this.name = name;
    }
}
