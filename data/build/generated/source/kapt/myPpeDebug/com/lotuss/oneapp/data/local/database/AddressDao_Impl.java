package com.lotuss.oneapp.data.local.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.lotuss.oneapp.data.model.DistrictEntity;
import com.lotuss.oneapp.data.model.ProvinceEntity;
import com.lotuss.oneapp.data.model.SubDistrictEntity;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AddressDao_Impl implements AddressDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProvinceEntity> __insertionAdapterOfProvinceEntity;

  private final EntityInsertionAdapter<DistrictEntity> __insertionAdapterOfDistrictEntity;

  private final EntityInsertionAdapter<SubDistrictEntity> __insertionAdapterOfSubDistrictEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteProvince;

  private final SharedSQLiteStatement __preparedStmtOfDeleteDistrict;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSubDistrict;

  public AddressDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProvinceEntity = new EntityInsertionAdapter<ProvinceEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Province` (`id`,`name`,`nameTh`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProvinceEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getNameTh() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNameTh());
        }
      }
    };
    this.__insertionAdapterOfDistrictEntity = new EntityInsertionAdapter<DistrictEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `District` (`id`,`parentId`,`nameTh`,`name`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DistrictEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getParentId());
        if (value.getNameTh() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNameTh());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
      }
    };
    this.__insertionAdapterOfSubDistrictEntity = new EntityInsertionAdapter<SubDistrictEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SubDistrict` (`id`,`parentId`,`name`,`nameTh`,`postcode`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubDistrictEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getParentId());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getNameTh() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNameTh());
        }
        if (value.getPostcode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPostcode());
        }
      }
    };
    this.__preparedStmtOfDeleteProvince = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Province";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteDistrict = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM District";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSubDistrict = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SubDistrict";
        return _query;
      }
    };
  }

  @Override
  public Object insertAddress(final List<ProvinceEntity> province,
      final List<DistrictEntity> district, final List<SubDistrictEntity> subDistrict,
      final Continuation<? super Unit> p3) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProvinceEntity.insert(province);
          __insertionAdapterOfDistrictEntity.insert(district);
          __insertionAdapterOfSubDistrictEntity.insert(subDistrict);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p3);
  }

  @Override
  public Object saveAddress(final List<ProvinceEntity> province,
      final List<DistrictEntity> district, final List<SubDistrictEntity> subDistrict,
      final Continuation<? super Unit> p3) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Unit>, Object>() {
      @Override
      public Object invoke(Continuation<? super Unit> __cont) {
        return AddressDao.DefaultImpls.saveAddress(AddressDao_Impl.this, province, district, subDistrict, __cont);
      }
    }, p3);
  }

  @Override
  public void deleteProvince() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteProvince.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteProvince.release(_stmt);
    }
  }

  @Override
  public void deleteDistrict() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDistrict.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteDistrict.release(_stmt);
    }
  }

  @Override
  public void deleteSubDistrict() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSubDistrict.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteSubDistrict.release(_stmt);
    }
  }

  @Override
  public Object getProvince(final Continuation<? super List<ProvinceEntity>> p0) {
    final String _sql = "SELECT * FROM Province";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<ProvinceEntity>>() {
      @Override
      public List<ProvinceEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNameTh = CursorUtil.getColumnIndexOrThrow(_cursor, "nameTh");
          final List<ProvinceEntity> _result = new ArrayList<ProvinceEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProvinceEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpNameTh;
            _tmpNameTh = _cursor.getString(_cursorIndexOfNameTh);
            _item = new ProvinceEntity(_tmpId,_tmpName,_tmpNameTh);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getProvinceByName(final String province,
      final Continuation<? super ProvinceEntity> p1) {
    final String _sql = "SELECT * FROM Province WHERE id LIKE ? OR name LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (province == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, province);
    }
    _argIndex = 2;
    if (province == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, province);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<ProvinceEntity>() {
      @Override
      public ProvinceEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNameTh = CursorUtil.getColumnIndexOrThrow(_cursor, "nameTh");
          final ProvinceEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpNameTh;
            _tmpNameTh = _cursor.getString(_cursorIndexOfNameTh);
            _result = new ProvinceEntity(_tmpId,_tmpName,_tmpNameTh);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object gerDistrict(final int provinceID,
      final Continuation<? super List<DistrictEntity>> p1) {
    final String _sql = "SELECT * FROM District WHERE parentId LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, provinceID);
    return CoroutinesRoom.execute(__db, false, new Callable<List<DistrictEntity>>() {
      @Override
      public List<DistrictEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfParentId = CursorUtil.getColumnIndexOrThrow(_cursor, "parentId");
          final int _cursorIndexOfNameTh = CursorUtil.getColumnIndexOrThrow(_cursor, "nameTh");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final List<DistrictEntity> _result = new ArrayList<DistrictEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DistrictEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpParentId;
            _tmpParentId = _cursor.getInt(_cursorIndexOfParentId);
            final String _tmpNameTh;
            _tmpNameTh = _cursor.getString(_cursorIndexOfNameTh);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item = new DistrictEntity(_tmpId,_tmpParentId,_tmpNameTh,_tmpName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object gerDistrictByName(final int provinceID, final String district,
      final Continuation<? super DistrictEntity> p2) {
    final String _sql = "SELECT * FROM District WHERE parentId LIKE ? AND (name LIKE ? OR nameTh LIKE ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, provinceID);
    _argIndex = 2;
    if (district == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, district);
    }
    _argIndex = 3;
    if (district == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, district);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<DistrictEntity>() {
      @Override
      public DistrictEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfParentId = CursorUtil.getColumnIndexOrThrow(_cursor, "parentId");
          final int _cursorIndexOfNameTh = CursorUtil.getColumnIndexOrThrow(_cursor, "nameTh");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final DistrictEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpParentId;
            _tmpParentId = _cursor.getInt(_cursorIndexOfParentId);
            final String _tmpNameTh;
            _tmpNameTh = _cursor.getString(_cursorIndexOfNameTh);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _result = new DistrictEntity(_tmpId,_tmpParentId,_tmpNameTh,_tmpName);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p2);
  }

  @Override
  public Object getSubDistrict(final int districtId,
      final Continuation<? super List<SubDistrictEntity>> p1) {
    final String _sql = "SELECT * FROM SubDistrict WHERE parentId LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, districtId);
    return CoroutinesRoom.execute(__db, false, new Callable<List<SubDistrictEntity>>() {
      @Override
      public List<SubDistrictEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfParentId = CursorUtil.getColumnIndexOrThrow(_cursor, "parentId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNameTh = CursorUtil.getColumnIndexOrThrow(_cursor, "nameTh");
          final int _cursorIndexOfPostcode = CursorUtil.getColumnIndexOrThrow(_cursor, "postcode");
          final List<SubDistrictEntity> _result = new ArrayList<SubDistrictEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubDistrictEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpParentId;
            _tmpParentId = _cursor.getInt(_cursorIndexOfParentId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpNameTh;
            _tmpNameTh = _cursor.getString(_cursorIndexOfNameTh);
            final String _tmpPostcode;
            _tmpPostcode = _cursor.getString(_cursorIndexOfPostcode);
            _item = new SubDistrictEntity(_tmpId,_tmpParentId,_tmpName,_tmpNameTh,_tmpPostcode);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getSubDistrictByName(final int districtId, final String subDistrict,
      final Continuation<? super SubDistrictEntity> p2) {
    final String _sql = "SELECT * FROM SubDistrict WHERE parentId LIKE ? AND (name LIKE ? OR nameTh LIKE ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, districtId);
    _argIndex = 2;
    if (subDistrict == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subDistrict);
    }
    _argIndex = 3;
    if (subDistrict == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subDistrict);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<SubDistrictEntity>() {
      @Override
      public SubDistrictEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfParentId = CursorUtil.getColumnIndexOrThrow(_cursor, "parentId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNameTh = CursorUtil.getColumnIndexOrThrow(_cursor, "nameTh");
          final int _cursorIndexOfPostcode = CursorUtil.getColumnIndexOrThrow(_cursor, "postcode");
          final SubDistrictEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpParentId;
            _tmpParentId = _cursor.getInt(_cursorIndexOfParentId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpNameTh;
            _tmpNameTh = _cursor.getString(_cursorIndexOfNameTh);
            final String _tmpPostcode;
            _tmpPostcode = _cursor.getString(_cursorIndexOfPostcode);
            _result = new SubDistrictEntity(_tmpId,_tmpParentId,_tmpName,_tmpNameTh,_tmpPostcode);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p2);
  }

  @Override
  public void deleteAll() {
    AddressDao.DefaultImpls.deleteAll(AddressDao_Impl.this);
  }
}
