package com.jobson.bookstoremanager.publishers.entity;

import com.jobson.bookstoremanager.books.entity.Book;
import com.jobson.bookstoremanager.entity.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Publisher extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    private String code;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDate foundationDate;

    @OneToMany(mappedBy = "publihser", fetch = FetchType.LAZY)
    private List<Book> books;
}
