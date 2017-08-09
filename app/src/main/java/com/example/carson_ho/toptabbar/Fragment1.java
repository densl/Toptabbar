package com.example.carson_ho.toptabbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Carson_Ho on 16/7/22.
 */
public class Fragment1 extends Fragment {

    public static final String FRAGMENT_TITLE = "title";

    public static final String FRAGMENT_ID = "id";

    private String mTitle;
    private int mId;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mTitle = getArguments().getString(FRAGMENT_TITLE);
            mId = getArguments().getInt(FRAGMENT_ID);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1, container, false);
        TextView tv = (TextView)view.findViewById(R.id.fragment_text);
        tv.setText("saved title: " + mTitle + "   \nid: " + mId++);
        return view;
    }

    public static Fragment1 newInstance(String title, int id) {
        Bundle bundle = new Bundle();
        bundle.putString(FRAGMENT_TITLE, title);
        bundle.putInt(FRAGMENT_ID, id);

        Fragment1 fragment1 = new Fragment1();
        fragment1.setArguments(bundle);
        return fragment1;
    }

}
