package org.eustia.dao.impl;
/*
 * @package: org.eustia.dao.impl
 * @program: DataBaseOperation
 * @description
 *
 * @author:  rinne
 * @e-mail:  minami.rinne.me@gmail.com
 * @date: 2020/02/22 午後 06:46
 */

import org.eustia.model.SqlInfo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @interface name: DataBaseOperation
 * @description: %{description}
 * @author: rinne
 * @date: 2020/02/22 午後 06:46
 * @Version 1.0
 */

public interface DataBaseOperation<T> {
    ArrayList<ArrayList<Object>> getResult(SqlInfo<T> sqlInfo) throws SQLException;

    ArrayList<ArrayList<Object>> getAllResult(SqlInfo<T> sqlInfo) throws SQLException;

    void insertData(SqlInfo<T> sqlInfo) throws SQLException;

    void insertManyData(SqlInfo<T> sqlInfo) throws SQLException;

    void updateData(SqlInfo<T> sqlInfo) throws SQLException;

    void deleteData(SqlInfo<T> sqlInfo) throws SQLException;

    ArrayList<T> getSearch(ArrayList<ArrayList<Object>> result);
}