package com.example.naman.stayuncleprototype;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Naman on 22-08-2016.
 */
public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.DetailsViewHolder>
{
    public static final String TAG = "HotelDetailsAdapter";

    ArrayList<Hotel_Details_POJO.HotelDetails> hotelObject = new ArrayList<>();
    Context ctx;

    public CardViewAdapter(ArrayList<Hotel_Details_POJO.HotelDetails> hotelObject,Context ctx)
    {
        this.hotelObject = hotelObject;
        this.ctx=ctx;
    }





    @Override
    public CardViewAdapter.DetailsViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);

        DetailsViewHolder detailsViewHolder = new DetailsViewHolder(view,ctx,hotelObject);

        return detailsViewHolder;
    }



    @Override
    public void onBindViewHolder( final DetailsViewHolder holder, int position)
    {

        Hotel_Details_POJO.HotelDetails details = hotelObject.get(position);

        int imageid;
        imageid=details.getImageId();
        holder.hotel_img.setImageResource(imageid);

        holder.couple_ic.setImageResource(R.drawable.couple);

        //holder.test_iv.setImageResource(imageid);


        holder.name_tv.setText(details.getHotelName());
        holder.address_tv.setText(details.getAddress());
        holder.address_tv.setSelected(true);
//        holder.state_tv.setText(details.getState());
        String rent = String.valueOf((int)details.getRent());
        holder.rent_tv.setText("RENT : INR " + rent);


        if(details.getWifi()==true)
            holder.ic_wifi.setImageResource(R.drawable.ic_wifi_grey_700_24dp);
        else
            holder.ic_wifi.setImageResource(R.drawable.ic_signal_wifi_off_grey_700_24dp);

        if(details.getFood()==true)
            holder.ic_food.setImageResource(R.drawable.ic_free_breakfast_blue_grey_700_24dp);

        if(details.getParking()==true)
            holder.ic_parking.setImageResource(R.drawable.parking);

        if(details.getSwimming()==true)
            holder.ic_swimming.setImageResource(R.drawable.swimming);

    }

    @Override
    public int getItemCount() {
        return hotelObject.size();
    }

    public static class DetailsViewHolder extends RecyclerView.ViewHolder
    {
        ImageView hotel_img,ic_wifi,ic_food, ic_parking,couple_ic,ic_swimming;
        ImageView test_iv;
        TextView name_tv,address_tv, rent_tv;

        ArrayList<Hotel_Details_POJO.HotelDetails> list = new ArrayList<Hotel_Details_POJO.HotelDetails>();
        Context ctx;

        public DetailsViewHolder(View view,Context ctx, ArrayList<Hotel_Details_POJO.HotelDetails> list)
        {
            super(view);

            this.ctx=ctx;
            this.list=list;

         //   test_iv= (ImageView) view.findViewById(R.id.test_imv);

            hotel_img = (ImageView) view.findViewById(R.id.hotel_image);
            couple_ic=(ImageView) view.findViewById(R.id.couples);

            name_tv = (TextView) view.findViewById(R.id.hotel_name_tv);
            address_tv = (TextView) view.findViewById(R.id.address_tv);

            rent_tv = (TextView) view.findViewById(R.id.rent_tv);
          //  rent_tv.getBackground().setAlpha(80);


            ic_wifi = (ImageView) view.findViewById(R.id.ic_wifi);
            ic_food = (ImageView) view.findViewById(R.id.ic_food);
            ic_parking = (ImageView) view.findViewById(R.id.ic_car_parking);
            ic_swimming= (ImageView) view.findViewById(R.id.ic_swimming);




        }
    }
}

