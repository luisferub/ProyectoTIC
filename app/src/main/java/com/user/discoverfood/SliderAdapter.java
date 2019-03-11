package com.user.discoverfood;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter
{

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.frisby,
            R.drawable.mcdonalds,
            R.drawable.tacos
    };

    public String[] slide_headings = {
            "FRISBY",
            "MC DONALDS",
            "TACOS & BBQ"
    };

    public String[] slide_desc = {
            "Los principales productos son el pollo apanado, en diversas presentaciones.",
            "Los principales productos son las hamburguesas, las papas fritas, los menús para el desayuno, los refrescos, los batidos, los helados, los postres y, recientemente, las ensaladas de fruta.",
            "los principales productos son comida mexicana, tacos, burritos, quesadillas."
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_head);
        TextView slideDesc = (TextView) view.findViewById(R.id.slide_desc);
        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDesc.setText(slide_desc[position]);
        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}