package ru.epam.javacore.lesson_24_db_web.homework.common.solutions.repo.jdbc;

import java.sql.PreparedStatement;

public interface PreparedStatementBiConsumer<T> extends JdbcBiConsumer<PreparedStatement, T> {
}
