package com.example.hp.listview;


import android.content.Context;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int [] IMAGE={R.drawable.f,R.drawable.f,R.drawable.f,R.drawable.f,R.drawable.f,R.drawable.f};
    int [] IMAGES={R.drawable.fb,R.drawable.wtsup,R.drawable.google,R.drawable.twiter,R.drawable.imo,R.drawable.line};
    int [] IMAGEs={R.drawable.fb1,R.drawable.whtsup1,R.drawable.google,R.drawable.twiter1,R.drawable.imo1,R.drawable.player};
    String[] NAMES={"Social Network","Social Network","Social Network","Social Network","Social Network","Social Network"};
    String[] NAME={"Facebook","Whatsapp","Google","Twiter","Imo","Line"};

    LayoutInflater inflator;
    Context mcontext;

    public CustomAdapter(Context mcontext)
    {
        this.mcontext=mcontext;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        inflator= (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflator.inflate(R.layout.newsource,null);
ImageView image1 =(ImageView) convertView.findViewById(R.id.image);
        TextView text=(TextView)convertView.findViewById(R.id.text1);
        TextView txt=(TextView)convertView.findViewById(R.id.text2);
        ImageView imag =(ImageView) convertView.findViewById(R.id.images);
        ImageView img3 =(ImageView) convertView.findViewById(R.id.Images);
        image1.setImageResource(IMAGE[position]);
       text.setText(NAMES[position]);
     txt.setText(NAME[position]);
        imag.setImageResource(IMAGES[position]);
        img3.setImageResource(IMAGEs[position]);

        return convertView;

    }
}
