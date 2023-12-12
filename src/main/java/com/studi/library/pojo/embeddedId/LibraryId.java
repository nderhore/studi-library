package com.studi.library.pojo.embeddedId;

import com.studi.library.pojo.Movie;
import com.studi.library.pojo.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class LibraryId implements Serializable {

    @ManyToOne
    @JoinColumn(name="username")
    private User user;

    @ManyToOne
    @JoinColumn(name="movie_id")
    private Movie movie;
}
