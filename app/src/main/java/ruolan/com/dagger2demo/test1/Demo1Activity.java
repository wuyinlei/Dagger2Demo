package ruolan.com.dagger2demo.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import javax.inject.Inject;

import ruolan.com.dagger2demo.R;

public class Demo1Activity extends AppCompatActivity {


    private RelativeLayout mActivityDemo1;
    private TextView mText1;

    @Inject
    ProName mProName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);

        DaggerMainComponent.builder().build().inject(this);
        initView();
    }

    private void initView() {
        mActivityDemo1 = (RelativeLayout) findViewById(R.id.activity_demo1);
        mText1 = (TextView) findViewById(R.id.text1);
        mText1.setText(mProName.getName());
    }
}
