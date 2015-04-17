package com.example.healthservices;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

public class FragmentPageAdapter extends FragmentPagerAdapter {

	public FragmentPageAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		switch (arg0) {
		case 0:
			return new SearchadoctorFragment();
		case 1:
			return new ReminderFragment();

		default:
			break;
		}
		
		
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

}
