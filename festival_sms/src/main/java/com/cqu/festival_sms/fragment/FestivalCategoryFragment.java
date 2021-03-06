package com.cqu.festival_sms.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.TextView;

import com.cqu.festival_sms.ChooseMsgActivity;
import com.cqu.festival_sms.R;
import com.cqu.festival_sms.bean.Festival;
import com.cqu.festival_sms.bean.FestivalLab;

/**
 * Created by Administrator on 2017/3/19.
 */
public class FestivalCategoryFragment extends Fragment {

    public static final String ID_FESTIVAL="festival_id";
    private GridView mGridView;
    private ArrayAdapter<Festival> mAdapter;
    private LayoutInflater mInflater;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mInflater=LayoutInflater.from(getActivity());
        return mInflater.inflate(R.layout.fragment_festival_category,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        mGridView= (GridView) view.findViewById(R.id.id_gv_festival_category);
        mGridView.setAdapter(mAdapter = new ArrayAdapter<Festival>(getActivity(), -1, FestivalLab.getmInstance().getmFestivals()) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    convertView = mInflater.inflate(R.layout.item_festival, parent, false);
                }
                TextView tv = (TextView) convertView.findViewById(R.id.id_tv_festival_name);
                tv.setText(getItem(position).getName());
                return convertView;
            }
        });

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(), ChooseMsgActivity.class);
                intent.putExtra(ID_FESTIVAL,mAdapter.getItem(position).getId());
                startActivity(intent);
            }
        });

    }
}
