package com.doghat.emu;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class EmulatorGridAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mEmulators;


    public EmulatorGridAdapter(Context context, String[] emulators){
        this.mContext = context;
        this.mEmulators = emulators;

    }

    @Override
    public int getCount() {
        return mEmulators.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            //get layout from xml file
            gridView = inflater.inflate(R.layout.emulator_grid_item, null);

            //pull views
            TextView emulatorView = (TextView) gridView.findViewById(R.id.grid_item_emulator);

            //set values into views
            String emulator = mEmulators[position];
            emulatorView.setBackgroundResource(mContext.getResources().getIdentifier(emulator, "drawable", mContext.getPackageName()));
            emulatorView.setId(mContext.getResources().getIdentifier(emulator, "id", mContext.getPackageName()));
            


        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }
}