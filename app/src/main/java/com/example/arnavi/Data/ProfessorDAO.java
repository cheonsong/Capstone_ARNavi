package com.example.arnavi.Data;


import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;


public class ProfessorDAO {
    protected static final String TAG = "DataAdapter";

    // TODO : TABLE 이름을 명시해야함
    protected static final String TABLE_NAME = "Professor";

    private final Context mContext;
    private SQLiteDatabase mDb;
    private DBHelper mDbHelper;

    public ProfessorDAO(Context context) {
        this.mContext = context;
        mDbHelper = new DBHelper(mContext);
    }

    public ProfessorDAO createDatabase() throws SQLException {
        try {
            mDbHelper.createDataBase();
        } catch (IOException mIOException) {
            Log.e(TAG, mIOException.toString() + "  UnableToCreateDatabase");
            throw new Error("UnableToCreateDatabase");
        }
        return this;
    }

    public ProfessorDAO open() throws SQLException {
        try {
            mDbHelper.openDataBase();
            mDbHelper.close();
            mDb = mDbHelper.getReadableDatabase();
        } catch (SQLException mSQLException) {
            Log.e(TAG, "open >>" + mSQLException.toString());
            throw mSQLException;
        }
        return this;
    }

    public void close() {
        mDbHelper.close();
    }

    public ArrayList getTableData() {
        try {
            // Table 이름 -> antpool_bitcoin 불러오기
            String sql = "SELECT * FROM " + TABLE_NAME;

            // 모델 넣을 리스트 생성
            ArrayList<ProfessorDTO> userList = new ArrayList<>();

            // TODO : 모델 선언
            ProfessorDTO professor = null;

            Cursor mCur = mDb.rawQuery(sql, null);
            if (mCur != null) {
                // 칼럼의 마지막까지
                while (mCur.moveToNext()) {

                    // TODO : 커스텀 모델 생성
                    professor = new ProfessorDTO();

                    // TODO : Record 기술
                    // id, name, account, privateKey, secretKey, Comment
                    professor.setPname(mCur.getString(0));
                    // 리스트에 넣기
                    userList.add(professor);
                }

            }
            return userList;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>" + mSQLException.toString());
            throw mSQLException;
        }
    }
}
