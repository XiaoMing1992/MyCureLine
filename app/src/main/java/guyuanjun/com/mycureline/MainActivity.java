package guyuanjun.com.mycureline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LineGraphicView tu;
    ArrayList<Double> yList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tu = (LineGraphicView) findViewById(R.id.line_graphic);

        yList = new ArrayList<Double>();
        yList.add((double) 2.103);
        yList.add(4.05);
        yList.add(6.60);
        yList.add(3.08);
        yList.add(4.32);
        yList.add(2.0);
        yList.add(5.0);

        ArrayList<String> xRawDatas = new ArrayList<String>();
        xRawDatas.add("05-19");
        xRawDatas.add("05-20");
        xRawDatas.add("05-21");
        xRawDatas.add("05-22");
        xRawDatas.add("05-23");
        xRawDatas.add("05-24");
        xRawDatas.add("05-25");
        xRawDatas.add("05-26");
        tu.setData(yList, xRawDatas, 8, 2);
    }

}
