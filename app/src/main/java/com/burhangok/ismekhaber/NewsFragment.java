package com.burhangok.ismekhaber;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {


    ListView listView;
    String[] listArray={"Android kursu","Robotik kursu","SİBER GÜVENLİK"};
    ArrayAdapter<String> arrayAdapter;

    View view;
    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.fragment_news, container, false);

         listView = view.findViewById(R.id.newsLV);

         arrayAdapter = new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_list_item_1,listArray);
         listView.setAdapter(arrayAdapter);

         return  view;
    }

}
