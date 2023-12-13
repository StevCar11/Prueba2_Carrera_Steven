package esteban.g.cannongame2;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseManagerUser extends SQLiteOpenHelper {
    final String CREATE_USERS = "CREATE TABLE USERS (Code INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, " +
            "PASSWORD TEXT)";
    final String DROP_TABLE = "DROP TABLE IF EXISTS USERS";
    public DataBaseManagerUser(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USERS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        db.execSQL(CREATE_USERS);
    }
}
