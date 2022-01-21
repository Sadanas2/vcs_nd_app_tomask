package lt.vcs.vcs_nd_app_tomask;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

public final static String LOG_TAG= "log_main_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printStatus("~~~~~~~~~~~");
        printStatus(": onCreate");
    }

    private void printStatus(String statusName){
        Log.i(LOG_TAG,"first activity: "+statusName);
    }

    @Override
    protected void onStart(){
        super.onStart();
        printStatus("~~~~~~~~~~~");
        printStatus(": onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        printStatus("~~~~~~~~~~~");
        printStatus(": onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        printStatus(": onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        printStatus(": onStop");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        printStatus(": onRestart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        printStatus(": onDestroy");
    }
}