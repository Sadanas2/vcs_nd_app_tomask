package lt.vcs.vcs_nd_app_tomask;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    public final static String LOG_TAG= "log_second_activity";
    Button mainButton;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupUI();
        printStatus("~~~~~~~~~~~");
        printStatus(": onCreate");
    }

    private void setupUI(){
        setContentView(R.layout.activity_second);
        mainButton=findViewById(R.id.second_activity_buttom);
        onButtonClick();
    }

    private void printStatus(String statusName){
        Log.i(LOG_TAG,"second activity: "+statusName);
    }

    private void onButtonClick(){
        mainButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
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
