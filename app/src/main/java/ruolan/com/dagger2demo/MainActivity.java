package ruolan.com.dagger2demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ruolan.com.dagger2demo.test1.Demo1Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        mButtonOne.setOnClickListener(this);
    }

    private void initView() {
        mButtonOne = (Button) findViewById(R.id.button_one);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_one:
                startActivity(new Intent(this, Demo1Activity.class));
                break;

        }
    }
}
