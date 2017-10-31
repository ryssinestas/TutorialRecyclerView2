package com.example.android.tutorialrecyclerproject;

import android.app.LauncherActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Stanislav on 23/10/2017.
 */

class RecyclerViewSimpleTextViewHolder extends RecyclerView.ViewHolder {
    TextView label;

    public RecyclerViewSimpleTextViewHolder(View v) {
        super(v);
        label = (TextView) v;
    }

    public TextView getLabel() {
        return label;
    }

    public void setLabel(TextView label) {
        this.label = label;
    }
}
