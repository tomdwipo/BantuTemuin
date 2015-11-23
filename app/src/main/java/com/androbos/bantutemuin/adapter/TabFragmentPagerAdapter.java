package com.androbos.bantutemuin.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.androbos.bantutemuin.fragment.CariFragment;
import com.androbos.bantutemuin.fragment.MenemukanFragment;
import com.androbos.bantutemuin.fragment.UmumkanFragment;

/**
 * Created by tommy on 04/11/15.
 */
public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    String[] title = new String[]{
            "Umumkan", "Temukan", "Cari"
    };
    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new UmumkanFragment();
                break;
            case 1:
                fragment = new MenemukanFragment();
                break;
            case 2:
                fragment = new CariFragment();
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
