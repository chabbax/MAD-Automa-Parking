
package exportkit.xd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class OrderDB extends SQLiteOpenHelper {

    // Database configurations
    private static final int VERSION = 1;
    private static final String DB_NAME = "OrderDB";
    private static final String TABLE_NAME = "OrderTable";

    // Column names
    private static final String ID = "id";
    private static final String TITLE = "title";
    private static final String DESCRIPTION = "description";
    private static final String STARTED = "started";
    private static final String FINISHED = "finished";

    public OrderDB(@Nullable Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    // Creating the database table
    @Override
    public void onCreate(SQLiteDatabase db) {

        String TABLE_CREATE_QUERY = "CREATE TABLE "+TABLE_NAME+" " +
                "("
                +ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
                +TITLE + " TEXT,"
                +DESCRIPTION + " TEXT,"
                +STARTED+ " TEXT,"
                +FINISHED+" TEXT" +
                ");";

        /* Run the create query  */
        db.execSQL(TABLE_CREATE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String DROP_TABLE_QUERY = "DROP TABLE IF EXISTS "+ TABLE_NAME;
        // Drop older table if existed
        db.execSQL(DROP_TABLE_QUERY);
        // Create tables again
        onCreate(db);
    }

    // Add a single order
    public void addOrder(Order create){
        // Write data into the database
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        // Structure and bundle data into object
        ContentValues contentValues = new ContentValues();

        // USing methods from the modal class
        contentValues.put(TITLE,create.getTitle());
        contentValues.put(DESCRIPTION, create.getDescription());
        contentValues.put(STARTED,create.getStarted());
        contentValues.put(FINISHED,create.getFinished());

        //save to table
        sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        // close database
        sqLiteDatabase.close();
    }
}
