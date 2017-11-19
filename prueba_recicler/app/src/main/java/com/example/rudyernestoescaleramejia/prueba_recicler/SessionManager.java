package com.example.rudyernestoescaleramejia.prueba_recicler;

/**
 * Created by rudyernestoescaleramejia on 19/11/17.
 */
import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private static final String PREF_NAME = "Miapptest";
    private Context _context;
    private int Private_Mode = 0;
    private String KEY_USER = "user";
    public SessionManager(Context context){
        _context = context;
        pref = _context.getSharedPreferences(PREF_NAME, Private_Mode);
        editor = pref.edit();
    }
    public void saveUser(String username){
        editor.putString(KEY_USER, username);
        editor.commit();
    }
    public String getUserName(){
        return pref.getString(KEY_USER, null);
    }
}
