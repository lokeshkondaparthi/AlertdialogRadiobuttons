package com.dev.dialogwithrbutildemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Util mUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* init util for it's methods */
        mUtil = new Util();
    }

    public void gender(View veiw) {
        final String[] buttonsText = {"ok", "Cancel"};
        mUtil.showSingleChoiseDialog(this, "Intreseted in", buttonsText,
                new String[]{"Women", "men"}, 0, new OnItemSelectedListener() {
                    @Override
                    public void onItemclick(String selectedItem) {
                        Toast.makeText(MainActivity.this, "You selected " + selectedItem, Toast.LENGTH_SHORT).show();
                    }
                });
    }

    public void favoriteClick(View view) {
        final String[] buttonsText = {"ok", "Cancel"};
        mUtil.showSingleChoiseDialog(this, "Who is your favorite ?", buttonsText,
                new String[]{"God", "me", "father", "mother", "sister", "brother", "friend"}, 3, new OnItemSelectedListener() {
                    @Override
                    public void onItemclick(String selectedItem) {
                        Toast.makeText(MainActivity.this, "You selected " + selectedItem, Toast.LENGTH_SHORT).show();
                    }
                });
    }


}
