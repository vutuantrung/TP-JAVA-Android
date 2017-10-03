package fr.intech.vutuantrung.android.busstop.ChooseBus;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import fr.intech.vutuantrung.android.busstop.R;


public class CustomListViewBusStop extends BaseAdapter
{
    private List<BusStopInformation> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListViewBusStop(Context aContext,  List<BusStopInformation> listData) {
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
            convertView = layoutInflater.inflate(R.layout.list_item_layout_bus, null);
            holder = new ViewHolder();
            holder.busView = (ImageView) convertView.findViewById(R.id.imageView_busIcon);
            holder.busStopNameView = (TextView) convertView.findViewById(R.id.txtBusStopName);
            holder.busStopTimeView = (TextView) convertView.findViewById(R.id.txtTimeProchain);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        BusStopInformation busStopInformation = this.listData.get(position);

        holder.busStopNameView.setText(busStopInformation.getBusStopName());
        holder.busStopTimeView.setText(busStopInformation.getGetTimePlusProche());
        int imageId = this.getMipmapResIdByName(busStopInformation.getIconName());
        holder.busView.setImageResource(imageId);

        return convertView;
    }

    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();

        // Trả về 0 nếu không tìm thấy.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView busView;
        TextView busStopNameView;
        TextView busStopTimeView;
    }
}
