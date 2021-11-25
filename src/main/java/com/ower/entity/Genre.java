package com.ower.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "genre")
@NoArgsConstructor
@Getter
@Setter
public class Genre extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "genreList", fetch = FetchType.LAZY)  // genreList name comes from Movie Class..List<Genre> genreList...
    private List<Movie> movies = new ArrayList<>();


    public Genre(String name) {
        this.name = name;
    }
}
