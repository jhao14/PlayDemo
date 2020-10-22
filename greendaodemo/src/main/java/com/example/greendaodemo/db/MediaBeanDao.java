package com.example.greendaodemo.db;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.greendaodemo.model.UserBean;

import com.example.greendaodemo.model.MediaBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MEDIA_BEAN".
*/
public class MediaBeanDao extends AbstractDao<MediaBean, Long> {

    public static final String TABLENAME = "MEDIA_BEAN";

    /**
     * Properties of entity MediaBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property MId = new Property(0, Long.class, "mId", true, "_id");
        public final static Property DestFileName = new Property(1, String.class, "destFileName", false, "DEST_FILE_NAME");
        public final static Property MediaType = new Property(2, int.class, "mediaType", false, "MEDIA_TYPE");
        public final static Property IsDisplay = new Property(3, int.class, "isDisplay", false, "IS_DISPLAY");
        public final static Property Title = new Property(4, String.class, "title", false, "TITLE");
        public final static Property UserId = new Property(5, Long.class, "userId", false, "USER_ID");
        public final static Property MediaPath = new Property(6, String.class, "mediaPath", false, "MEDIA_PATH");
        public final static Property IsAutoPlay = new Property(7, int.class, "isAutoPlay", false, "IS_AUTO_PLAY");
        public final static Property Duration = new Property(8, long.class, "duration", false, "DURATION");
        public final static Property Mute = new Property(9, int.class, "mute", false, "MUTE");
        public final static Property ScaleType = new Property(10, int.class, "scaleType", false, "SCALE_TYPE");
        public final static Property MaxScale = new Property(11, float.class, "maxScale", false, "MAX_SCALE");
        public final static Property MinScale = new Property(12, float.class, "minScale", false, "MIN_SCALE");
        public final static Property FocusX = new Property(13, float.class, "focusX", false, "FOCUS_X");
        public final static Property FocusY = new Property(14, float.class, "focusY", false, "FOCUS_Y");
        public final static Property TakenPicTime = new Property(15, String.class, "takenPicTime", false, "TAKEN_PIC_TIME");
        public final static Property UploadTime = new Property(16, String.class, "uploadTime", false, "UPLOAD_TIME");
    }

    private DaoSession daoSession;


    public MediaBeanDao(DaoConfig config) {
        super(config);
    }
    
    public MediaBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MEDIA_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: mId
                "\"DEST_FILE_NAME\" TEXT," + // 1: destFileName
                "\"MEDIA_TYPE\" INTEGER NOT NULL ," + // 2: mediaType
                "\"IS_DISPLAY\" INTEGER NOT NULL ," + // 3: isDisplay
                "\"TITLE\" TEXT," + // 4: title
                "\"USER_ID\" INTEGER," + // 5: userId
                "\"MEDIA_PATH\" TEXT," + // 6: mediaPath
                "\"IS_AUTO_PLAY\" INTEGER NOT NULL ," + // 7: isAutoPlay
                "\"DURATION\" INTEGER NOT NULL ," + // 8: duration
                "\"MUTE\" INTEGER NOT NULL ," + // 9: mute
                "\"SCALE_TYPE\" INTEGER NOT NULL ," + // 10: scaleType
                "\"MAX_SCALE\" REAL NOT NULL ," + // 11: maxScale
                "\"MIN_SCALE\" REAL NOT NULL ," + // 12: minScale
                "\"FOCUS_X\" REAL NOT NULL ," + // 13: focusX
                "\"FOCUS_Y\" REAL NOT NULL ," + // 14: focusY
                "\"TAKEN_PIC_TIME\" TEXT," + // 15: takenPicTime
                "\"UPLOAD_TIME\" TEXT);"); // 16: uploadTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MEDIA_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MediaBean entity) {
        stmt.clearBindings();
 
        Long mId = entity.getMId();
        if (mId != null) {
            stmt.bindLong(1, mId);
        }
 
        String destFileName = entity.getDestFileName();
        if (destFileName != null) {
            stmt.bindString(2, destFileName);
        }
        stmt.bindLong(3, entity.getMediaType());
        stmt.bindLong(4, entity.getIsDisplay());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(6, userId);
        }
 
        String mediaPath = entity.getMediaPath();
        if (mediaPath != null) {
            stmt.bindString(7, mediaPath);
        }
        stmt.bindLong(8, entity.getIsAutoPlay());
        stmt.bindLong(9, entity.getDuration());
        stmt.bindLong(10, entity.getMute());
        stmt.bindLong(11, entity.getScaleType());
        stmt.bindDouble(12, entity.getMaxScale());
        stmt.bindDouble(13, entity.getMinScale());
        stmt.bindDouble(14, entity.getFocusX());
        stmt.bindDouble(15, entity.getFocusY());
 
        String takenPicTime = entity.getTakenPicTime();
        if (takenPicTime != null) {
            stmt.bindString(16, takenPicTime);
        }
 
        String uploadTime = entity.getUploadTime();
        if (uploadTime != null) {
            stmt.bindString(17, uploadTime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MediaBean entity) {
        stmt.clearBindings();
 
        Long mId = entity.getMId();
        if (mId != null) {
            stmt.bindLong(1, mId);
        }
 
        String destFileName = entity.getDestFileName();
        if (destFileName != null) {
            stmt.bindString(2, destFileName);
        }
        stmt.bindLong(3, entity.getMediaType());
        stmt.bindLong(4, entity.getIsDisplay());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(6, userId);
        }
 
        String mediaPath = entity.getMediaPath();
        if (mediaPath != null) {
            stmt.bindString(7, mediaPath);
        }
        stmt.bindLong(8, entity.getIsAutoPlay());
        stmt.bindLong(9, entity.getDuration());
        stmt.bindLong(10, entity.getMute());
        stmt.bindLong(11, entity.getScaleType());
        stmt.bindDouble(12, entity.getMaxScale());
        stmt.bindDouble(13, entity.getMinScale());
        stmt.bindDouble(14, entity.getFocusX());
        stmt.bindDouble(15, entity.getFocusY());
 
        String takenPicTime = entity.getTakenPicTime();
        if (takenPicTime != null) {
            stmt.bindString(16, takenPicTime);
        }
 
        String uploadTime = entity.getUploadTime();
        if (uploadTime != null) {
            stmt.bindString(17, uploadTime);
        }
    }

    @Override
    protected final void attachEntity(MediaBean entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MediaBean readEntity(Cursor cursor, int offset) {
        MediaBean entity = new MediaBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // mId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // destFileName
            cursor.getInt(offset + 2), // mediaType
            cursor.getInt(offset + 3), // isDisplay
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // userId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // mediaPath
            cursor.getInt(offset + 7), // isAutoPlay
            cursor.getLong(offset + 8), // duration
            cursor.getInt(offset + 9), // mute
            cursor.getInt(offset + 10), // scaleType
            cursor.getFloat(offset + 11), // maxScale
            cursor.getFloat(offset + 12), // minScale
            cursor.getFloat(offset + 13), // focusX
            cursor.getFloat(offset + 14), // focusY
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // takenPicTime
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16) // uploadTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MediaBean entity, int offset) {
        entity.setMId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDestFileName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMediaType(cursor.getInt(offset + 2));
        entity.setIsDisplay(cursor.getInt(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUserId(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setMediaPath(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setIsAutoPlay(cursor.getInt(offset + 7));
        entity.setDuration(cursor.getLong(offset + 8));
        entity.setMute(cursor.getInt(offset + 9));
        entity.setScaleType(cursor.getInt(offset + 10));
        entity.setMaxScale(cursor.getFloat(offset + 11));
        entity.setMinScale(cursor.getFloat(offset + 12));
        entity.setFocusX(cursor.getFloat(offset + 13));
        entity.setFocusY(cursor.getFloat(offset + 14));
        entity.setTakenPicTime(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setUploadTime(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MediaBean entity, long rowId) {
        entity.setMId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MediaBean entity) {
        if(entity != null) {
            return entity.getMId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MediaBean entity) {
        return entity.getMId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getUserBeanDao().getAllColumns());
            builder.append(" FROM MEDIA_BEAN T");
            builder.append(" LEFT JOIN USER_BEAN T0 ON T.\"USER_ID\"=T0.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected MediaBean loadCurrentDeep(Cursor cursor, boolean lock) {
        MediaBean entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        UserBean userBean = loadCurrentOther(daoSession.getUserBeanDao(), cursor, offset);
        entity.setUserBean(userBean);

        return entity;    
    }

    public MediaBean loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<MediaBean> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<MediaBean> list = new ArrayList<MediaBean>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<MediaBean> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<MediaBean> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}