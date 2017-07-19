package com.sbc.sk.extinguishersmanager;

public class ExtinguishersItem {
    String exting_name;
    String group_name;
    int resId;

    public ExtinguishersItem(String exting_name, String group_name, int resId) {
        this.exting_name = exting_name;
        this.group_name = group_name;
        this.resId = resId;
    }

    public String getExting_name() { return exting_name; }
    public void setExting_name(String exting_name) { this.exting_name = exting_name; }

    public String getGroup_name() { return group_name; }
    public void setGroup_name(String group_name) { this.group_name = group_name; }

    public int getResId() { return resId; }
    public void setResId(int resId) { this.resId = resId; }
}
