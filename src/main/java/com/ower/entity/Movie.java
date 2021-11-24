package com.ower.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movies")
@NoArgsConstructor
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "movie_genre_rel",
        joinColumns = {
        @JoinColumn(name = "movie_id")},
    inverseJoinColumns = {
        @JoinColumn(name = "genre_id")})
    private Set<Genre> genres = new HashSet<>();

    private String name;
    private int price;
    private LocalDate releaseDate;
    private LocalTime duration;
    private String summary;

    public Movie(String name, int price, LocalDate releaseDate, LocalTime duration, String summary) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.summary = summary;
    }
}
