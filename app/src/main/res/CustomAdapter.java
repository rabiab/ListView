import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.hp.listview.R;


public class CustomAdapter extends BaseAdapter {
    int [] IMAGES={R.drawable.fb,R.drawable.wtsup,R.drawable.google,R.drawable.twiter,R.drawable.imo,R.drawable.line};
    int [] IMAGE={R.drawable.f,R.drawable.f,R.drawable.f,R.drawable.f,R.drawable.f,R.drawable.f};

    Context mcontent;
    LayoutInflater inflator;

    public CustomAdapter() {
        super();
    }

    public CustomAdapter(Context context)
    {
        this.mcontent=context;



    }

    @Override
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
