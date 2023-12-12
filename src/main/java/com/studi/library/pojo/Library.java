package com.studi.library.pojo;

import com.studi.library.pojo.embeddedId.LibraryId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Library {


    @EmbeddedId
    private LibraryId libraryId;
}
