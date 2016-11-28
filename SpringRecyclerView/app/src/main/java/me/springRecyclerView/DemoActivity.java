package me.springRecyclerView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DemoActivity extends AppCompatActivity {

    RecyclerView mList;
    ImageView mImgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        initView();
    }

    private void initView() {
        mList = (RecyclerView) findViewById(R.id.recyList);
        mList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mImgView = new ImageView(this);
        mImgView.setImageResource(R.mipmap.ic_launcher);
        mImgView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 280));
        mList.setAdapter(new RecyclerViewSpringAdapter(mList, new DemoAdapter(), mImgView));
    }
}
