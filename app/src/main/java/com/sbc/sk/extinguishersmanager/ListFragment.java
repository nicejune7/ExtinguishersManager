package com.sbc.sk.extinguishersmanager;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    ListView listView;
    ExtingAdapter adapter;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("전체 보기");

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        listView = (ListView) view.findViewById(R.id.listView_list);

        adapter = new ExtingAdapter();

        adapter.addItem(new ExtinguishersItem("소화기1", "그룹 1", R.drawable.list_dot1));
        adapter.addItem(new ExtinguishersItem("소화기2", "그룹 2", R.drawable.list_dot2));
        adapter.addItem(new ExtinguishersItem("소화기3", "그룹 3", R.drawable.list_dot3));

        listView.setAdapter(adapter);

        return view;
    }

    class ExtingAdapter extends BaseAdapter {
        ArrayList<ExtinguishersItem> items = new ArrayList<ExtinguishersItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(ExtinguishersItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            ExtinguishersItemView view = new ExtinguishersItemView(getActivity().getApplicationContext());

            ExtinguishersItem item = items.get(position);
            view.setExting_name(item.getExting_name());
            view.setGroup_name(item.getGroup_name());
            view.setIv_dot(item.getResId());

            return view;
        }
    }
}
