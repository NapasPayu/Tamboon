package com.lotuss.oneapp.data.local.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AddressDao _addressDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Province` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `nameTh` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `District` (`id` INTEGER NOT NULL, `parentId` INTEGER NOT NULL, `nameTh` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SubDistrict` (`id` INTEGER NOT NULL, `parentId` INTEGER NOT NULL, `name` TEXT NOT NULL, `nameTh` TEXT NOT NULL, `postcode` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '360b043b2d3bbbe5d8e88b7ad7e0d676')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Province`");
        _db.execSQL("DROP TABLE IF EXISTS `District`");
        _db.execSQL("DROP TABLE IF EXISTS `SubDistrict`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProvince = new HashMap<String, TableInfo.Column>(3);
        _columnsProvince.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProvince.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProvince.put("nameTh", new TableInfo.Column("nameTh", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProvince = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProvince = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProvince = new TableInfo("Province", _columnsProvince, _foreignKeysProvince, _indicesProvince);
        final TableInfo _existingProvince = TableInfo.read(_db, "Province");
        if (! _infoProvince.equals(_existingProvince)) {
          return new RoomOpenHelper.ValidationResult(false, "Province(com.lotuss.oneapp.data.model.ProvinceEntity).\n"
                  + " Expected:\n" + _infoProvince + "\n"
                  + " Found:\n" + _existingProvince);
        }
        final HashMap<String, TableInfo.Column> _columnsDistrict = new HashMap<String, TableInfo.Column>(4);
        _columnsDistrict.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrict.put("parentId", new TableInfo.Column("parentId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrict.put("nameTh", new TableInfo.Column("nameTh", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrict.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDistrict = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDistrict = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDistrict = new TableInfo("District", _columnsDistrict, _foreignKeysDistrict, _indicesDistrict);
        final TableInfo _existingDistrict = TableInfo.read(_db, "District");
        if (! _infoDistrict.equals(_existingDistrict)) {
          return new RoomOpenHelper.ValidationResult(false, "District(com.lotuss.oneapp.data.model.DistrictEntity).\n"
                  + " Expected:\n" + _infoDistrict + "\n"
                  + " Found:\n" + _existingDistrict);
        }
        final HashMap<String, TableInfo.Column> _columnsSubDistrict = new HashMap<String, TableInfo.Column>(5);
        _columnsSubDistrict.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubDistrict.put("parentId", new TableInfo.Column("parentId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubDistrict.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubDistrict.put("nameTh", new TableInfo.Column("nameTh", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubDistrict.put("postcode", new TableInfo.Column("postcode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubDistrict = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubDistrict = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSubDistrict = new TableInfo("SubDistrict", _columnsSubDistrict, _foreignKeysSubDistrict, _indicesSubDistrict);
        final TableInfo _existingSubDistrict = TableInfo.read(_db, "SubDistrict");
        if (! _infoSubDistrict.equals(_existingSubDistrict)) {
          return new RoomOpenHelper.ValidationResult(false, "SubDistrict(com.lotuss.oneapp.data.model.SubDistrictEntity).\n"
                  + " Expected:\n" + _infoSubDistrict + "\n"
                  + " Found:\n" + _existingSubDistrict);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "360b043b2d3bbbe5d8e88b7ad7e0d676", "eb9715c4a833dabd68c6bf69b24b7804");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Province","District","SubDistrict");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Province`");
      _db.execSQL("DELETE FROM `District`");
      _db.execSQL("DELETE FROM `SubDistrict`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public AddressDao addressDao() {
    if (_addressDao != null) {
      return _addressDao;
    } else {
      synchronized(this) {
        if(_addressDao == null) {
          _addressDao = new AddressDao_Impl(this);
        }
        return _addressDao;
      }
    }
  }
}
