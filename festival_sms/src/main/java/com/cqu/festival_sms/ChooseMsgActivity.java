package com.cqu.festival_sms;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.cqu.festival_sms.bean.FestivalLab;
import com.cqu.festival_sms.bean.Msg;
import com.cqu.festival_sms.fragment.FestivalCategoryFragment;

public class ChooseMsgActivity extends AppCompatActivity {

    private ListView mLvMsgs;
    private FloatingActionButton mFabToSend;
    private ArrayAdapter<Msg> mAdapter;
    int mFestivalId;
    private LayoutInflater mInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_msg);
        mInflater = LayoutInflater.from(this);
        mFestivalId = getIntent().getIntExtra(FestivalCategoryFragment.ID_FESTIVAL, -1);
        setTitle(FestivalLab.getmInstance().getmFestivalById(mFestivalId).getName());

        initViews();
        initEvent();

    }

    private void initEvent() {
        mFabToSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
                SendMsgActivity.toActivity(ChooseMsgActivity.this, mFestivalId,-1);


            }
        });
    }

    private void initViews() {
        mLvMsgs = (ListView) findViewById(R.id.id_lv_msgs);
        mFabToSend = (FloatingActionButton) findViewById(R.id.id_fab_toSend);

        mLvMsgs.setAdapter(mAdapter = new ArrayAdapter<Msg>(this, -1,
                FestivalLab.getmInstance().getMsgsByFestivalId(mFestivalId)) {
            @Override
            public View getView(final int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    convertView = mInflater.inflate(R.layout.item_msg, parent, false);
                }

                TextView content = (TextView) convertView.findViewById(R.id.id_tv_content);
                Button toSend = (Button) convertView.findViewById(R.id.id_btn_toSend);

                content.setText(getItem(position).getContent());
                toSend.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Toast.makeText(getApplication(),"正在发送...",0).show();
                        SendMsgActivity.toActivity(ChooseMsgActivity.this, mFestivalId,getItem(position).getId());
                    }
                });
                return convertView;
            }
        });

    }
}
