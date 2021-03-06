package csc1304.gr13.retailmanagercsc.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by CSC 1304 group 13 on 8/02/2021.
 */

public class GenerateUniqueNumber {
    public static final String AppPREFERENCES = "interswitchcardprefs" ;
    public static final String Stan = "stan";

    Context context;

    SharedPreferences sharedpreferences;
    Long incrementedStan =null;

    public GenerateUniqueNumber(Context context) {
        this.context = context;
    }

    public Long initializeStan(){

        sharedpreferences = context.getSharedPreferences(AppPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putLong(Stan, 1);
        editor.apply();

        return sharedpreferences.getLong(Stan,0);
    }

    public Long getStan(){
        Long stan = null;
        sharedpreferences = context.getSharedPreferences(AppPREFERENCES, Context.MODE_PRIVATE);
         if( sharedpreferences.contains(Stan)){
             incrementStan();
             stan= sharedpreferences.getLong(Stan,0);

         }
         else{
             stan= initializeStan();

         }

     return stan;

    }

    public void incrementStan(){
        //Increment Current STAN
        incrementedStan = sharedpreferences.getLong(Stan,0)+1;
        //Then save to shared prefference
        sharedpreferences = context.getSharedPreferences(AppPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putLong(Stan, incrementedStan);
        editor.apply();
    }

}
