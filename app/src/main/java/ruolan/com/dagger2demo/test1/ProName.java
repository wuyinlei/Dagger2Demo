package ruolan.com.dagger2demo.test1;

import javax.inject.Inject;

/**
 * Created by wuyinlei on 2017/1/17.
 */

public class ProName {

    private String name;

    // 用Inject标记构造函数,表示用它来注入到目标对象中去
    @Inject
    public ProName(){
        name = "时间就像海绵里面的水，挤挤总会有的";
    }

    public String getName() {
        return name;
    }
}
