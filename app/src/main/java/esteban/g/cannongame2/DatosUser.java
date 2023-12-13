package esteban.g.cannongame2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DatosUser {
    private DataBaseManagerUser dataBaseManager;
    private SQLiteDatabase sqLiteDatabase;
    private Context context;

    public DatosUser(Context context) {
        this.context = context;
    }
    private void open(boolean openMode) {
        dataBaseManager = new DataBaseManagerUser(context, "SEXTO_DB", null, 1);

        if (openMode==true) {
            sqLiteDatabase = dataBaseManager.getWritableDatabase();
        }
        else
        {
            sqLiteDatabase = dataBaseManager.getReadableDatabase();
        }
    }
    public  long insert(EntidadUser entidadGCKE) {
        open(true);
        long count = 0;

        try {
            ContentValues values = new ContentValues();

            values.put("NAME", entidadGCKE.getName());
            values.put("PASSWORD", entidadGCKE.getPassword());

            count = sqLiteDatabase.insert("USERS", null, values);
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            sqLiteDatabase.close();
        }
        return count;
    }

}
