package com.dovhal.android_labs.android.lab5.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CityDao_Impl implements CityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<City> __insertionAdapterOfCity;

  private final EntityDeletionOrUpdateAdapter<City> __deletionAdapterOfCity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public CityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCity = new EntityInsertionAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `city` (`city_id`,`city_name`,`city_area`,`founded`,`location`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        if (value.getCityId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCityId());
        }
        if (value.getCityName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCityName());
        }
        if (value.getCityArea() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCityArea());
        }
        stmt.bindLong(4, value.getFounded());
        if (value.getLocation() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLocation());
        }
      }
    };
    this.__deletionAdapterOfCity = new EntityDeletionOrUpdateAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `city` WHERE `city_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        if (value.getCityId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCityId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM city";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<City> cities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCity.insert(cities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final City city) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCity.insert(city);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final City city) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCity.handle(city);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<City> getAll() {
    final String _sql = "SELECT * FROM city";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCityId = CursorUtil.getColumnIndexOrThrow(_cursor, "city_id");
      final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "city_name");
      final int _cursorIndexOfCityArea = CursorUtil.getColumnIndexOrThrow(_cursor, "city_area");
      final int _cursorIndexOfFounded = CursorUtil.getColumnIndexOrThrow(_cursor, "founded");
      final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
      final List<City> _result = new ArrayList<City>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final City _item;
        final String _tmpCityId;
        if (_cursor.isNull(_cursorIndexOfCityId)) {
          _tmpCityId = null;
        } else {
          _tmpCityId = _cursor.getString(_cursorIndexOfCityId);
        }
        final String _tmpCityName;
        if (_cursor.isNull(_cursorIndexOfCityName)) {
          _tmpCityName = null;
        } else {
          _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
        }
        final String _tmpCityArea;
        if (_cursor.isNull(_cursorIndexOfCityArea)) {
          _tmpCityArea = null;
        } else {
          _tmpCityArea = _cursor.getString(_cursorIndexOfCityArea);
        }
        final int _tmpFounded;
        _tmpFounded = _cursor.getInt(_cursorIndexOfFounded);
        final String _tmpLocation;
        if (_cursor.isNull(_cursorIndexOfLocation)) {
          _tmpLocation = null;
        } else {
          _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
        }
        _item = new City(_tmpCityId,_tmpCityName,_tmpCityArea,_tmpFounded,_tmpLocation);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
