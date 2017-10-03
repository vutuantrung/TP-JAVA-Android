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

public class CustomListViewCorrespendances extends BaseAdapter
{
    private List<CorrespendancesInformation> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListViewCorrespendances(Context aContext,  List<CorrespendancesInformation> listData) {
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
            convertView = layoutInflater.inflate(R.layout.list_item_layout_correspondances, null);
            holder = new ViewHolder();
            holder.busIcon = (ImageView) convertView.findViewById(R.id.imageView_Correspendances);
            holder.busStopNumber = (TextView) convertView.findViewById(R.id.txtBusCorrespendances);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        CorrespendancesInformation correspendancesInformation = this.listData.get(position);

        holder.busStopNumber.setText(correspendancesInformation.getBusNumber());

        int imageId = this.getMipmapResIdByName(correspendancesInformation.getIconName());
        holder.busIcon.setImageResource(imageId);

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
        ImageView busIcon;
        TextView busStopNumber;
    }
}
