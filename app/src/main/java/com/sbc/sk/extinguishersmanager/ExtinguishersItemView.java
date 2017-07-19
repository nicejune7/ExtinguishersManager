package com.sbc.sk.extinguishersmanager;

import android.content.Context;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

public class ExtinguishersItemView extends ConstraintLayout{
    TextView tv_exting_name;
    TextView tv_group_name;
    ImageView iv_dot;
    ImageView iv_warnings;

    public ExtinguishersItemView(Context context) {
        super(context);

        init(context);
    }

    public ExtinguishersItemView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.fragment_list_single, this, true);

        tv_exting_name = (TextView) findViewById(R.id.tv_list_exting_name);
        tv_group_name = (TextView) findViewById(R.id.tv_list_group_name);
        iv_dot = (ImageView) findViewById(R.id.iv_list_dot);
        iv_warnings = (ImageView) findViewById(R.id.iv_list_warnings);
    }

    public void setExting_name(String name) { tv_exting_name.setText(name); }

    public void setGroup_name(String mobile) { tv_group_name.setText(mobile); }

    public void setIv_dot(int resId) { iv_dot.setImageResource(resId); }
}
