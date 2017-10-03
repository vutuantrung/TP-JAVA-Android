package fr.intech.vutuantrung.android.busstop.ChooseBus;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import fr.intech.vutuantrung.android.busstop.R;

/**
 * Created by Vu Tuan Trung on 4/15/2017.
 */

public class CustomListViewTime extends BaseAdapter
{
    private List<TimeArretInformation> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListViewTime(Context aContext,  List<TimeArretInformation> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null)
        {
            convertView = layoutInflater.inflate(R.layout.list_item_layout_timebus, null);
            holder = new ViewHolder();
            holder.busStopTimeView = (TextView) convertView.findViewById(R.id.txtTimeBus);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        TimeArretInformation timeArretInformation = this.listData.get(position);

        holder.busStopTimeView.setText(timeArretInformation.getTimeArret());

        return convertView;
    }

    static class ViewHolder {
        TextView busStopTimeView;
    }
}
