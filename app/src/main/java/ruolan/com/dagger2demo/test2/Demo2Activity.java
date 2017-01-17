package ruolan.com.dagger2demo.test2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import javax.inject.Inject;

import ruolan.com.dagger2demo.R;
import ruolan.com.dagger2demo.test1.ProName;

public class Demo2Activity extends AppCompatActivity {

    private RelativeLayout mActivityDemo2;
    private TextView mText2;

    @Inject
    public Gson mGson;

    @Inject
    public ProName mProName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
        DaggerMainComponent.builder().build().inject(this);
        initView();
    }

    private void initView() {
        mActivityDemo2 = (RelativeLayout) findViewById(R.id.activity_demo2);
        mText2 = (TextView) findViewById(R.id.text2);
        String result = mGson.toJson(mProName);
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        mText2.setText(result);
    }
}
