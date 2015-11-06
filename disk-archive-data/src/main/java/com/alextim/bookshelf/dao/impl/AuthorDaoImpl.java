package com.alextim.bookshelf.dao.impl;

import com.alextim.bookshelf.dao.IAuthorDao;
import com.alextim.bookshelf.entity.BookAuthor;
import com.alextim.general.dao.impl.BasicDAO;

public class AuthorDaoImpl extends BasicDAO<BookAuthor> implements IAuthorDao {
    @Override
    public BookAuthor addAuthor(final BookAuthor author) {
        saveOrUpdate(author);
        return author;
    }

    @Override
    public BookAuthor addAuthor() {
        final BookAuthor author = createAuthorEntity();

        author.setGender(BookAuthor.NEW_GENDER);
        author.setFirstName(BookAuthor.NEW_FIRST_NAME);
        author.setLastName(BookAuthor.NEW_LAST_NAME);

        return addAuthor(author);
    }

    private BookAuthor createAuthorEntity() {
        final BookAuthor author = new BookAuthor();
        return author;
    }
}
