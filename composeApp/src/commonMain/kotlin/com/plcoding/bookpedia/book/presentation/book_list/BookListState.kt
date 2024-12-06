package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = fakeData, //emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)


val fakeData = listOf<Book>(
    Book(
        id = "1",
        title = "Book 1",
        authors = listOf("author"),
        imageUrl = "http",
        description = "A book",
        languages = listOf(),
        numEditions = 3,
        firstPublishedYear = "1975",
        averageRating = 12.0,
        ratingCount = 7,
        numPages = 123,
    ),
    Book(
        id = "2",
        title = "Book 2",
        authors = listOf("author2"),
        imageUrl = "http",
        description = "A book",
        languages = listOf(),
        numEditions = 3,
        firstPublishedYear = "1975",
        averageRating = 12.0,
        ratingCount = 7,
        numPages = 123,
    ),
    Book(
        id = "3",
        title = "Book 3",
        authors = listOf("author3"),
        imageUrl = "http",
        description = "A book",
        languages = listOf(),
        numEditions = 3,
        firstPublishedYear = "1975",
        averageRating = 12.0,
        ratingCount = 7,
        numPages = 123,
    )
)