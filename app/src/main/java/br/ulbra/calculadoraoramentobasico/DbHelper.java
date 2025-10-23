package br.ulbra.calculadoraoramentobasico;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DbHelper extends SQLiteOpenHelper {

    private static final String nome = "BancoDados.db";
    private static final int versao = 1;


    public DbHelper(Context context) {
        super(context, nome, null, versao);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String str = "CREATE TABLE usuario(email TEXT PRIMARY KEY, senha TEXT);";
        db.execSQL(str);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS usuario;");
        onCreate(db);
    }

    public long criarUsuario(String email, String password) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();


        cv.put("email", email);
        cv.put("senha", password);

        long result = db.insert("usuario", null, cv);
        return result;
    }

    public String validarLogin(String email, String password) {
        SQLiteDatabase db = getReadableDatabase();


        Cursor c = db.rawQuery("SELECT * FROM usuario WHERE email=? AND senha=?", new String[] {email, password});

        if (c.getCount() > 0) {
            c.close();
            return "OK";
        }

        c.close();
        return "ERRO";
    }
}
