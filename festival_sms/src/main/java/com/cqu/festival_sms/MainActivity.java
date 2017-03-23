package com.cqu.festival_sms;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import android.support.design.*;

import com.cqu.festival_sms.fragment.FestivalCategoryFragment;
import com.cqu.festival_sms.fragment.SmsHistoryFragment;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTableLayout;
    private ViewPager mViewPager;

    private String[] mTitles = new String[]{"节日祝福", "发送记录"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mTableLayout = (TabLayout) findViewById(R.id.id_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                if(position==1) {
                    return new SmsHistoryFragment();
                }
                return new FestivalCategoryFragment();
            }

            @Override
            public int getCount() {
                return mTitles.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitles[position];
            }
        });
        mTableLayout.setupWithViewPager(mViewPager);
    }
}
