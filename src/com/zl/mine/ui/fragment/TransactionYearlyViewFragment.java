package com.zl.mine.ui.fragment;

import com.zl.mine.R;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

public class TransactionYearlyViewFragment extends ListFragment {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.string.test_title);
	}
}
