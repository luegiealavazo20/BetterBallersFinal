package ucucite.edu.betterballers;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    //constructor
    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
//        holder.mTitleTv.setText(modellist.get(postition).getTitle());
        holder.mDescTv.setText(modellist.get(postition).getDesc());
        //set the result in imageview
        holder.mIconIv.setImageResource(modellist.get(postition).getIcon());

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                if (modellist.get(postition).getTitle().equals("Basketball-Overview")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, BasketBall_Overview.class);
                    intent.putExtra("actionBarTitle", "Basketball-Overview");
                    intent.putExtra("contentTv", "Basketball-Overview");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Basketball-Equipment")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Basketball_Equipment.class);
                    intent.putExtra("actionBarTitle", "Basketball-Equipment");
                    intent.putExtra("contentTv", "Basketball-Equipment");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Basketball-How to Play?")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Basketball_howtoplay.class);
                    intent.putExtra("actionBarTitle", "Basketball-How to Play?");
                    intent.putExtra("contentTv", "Basketball-How to Play?");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Basketball-Variants")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext,  Basketball_Variants.class);
                    intent.putExtra("actionBarTitle", "Basketball-Variants");
                    intent.putExtra("contentTv", "Basketball-Variants");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Basketball-Common Terms")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Basketball_common_terms.class);
                    intent.putExtra("actionBarTitle", "Basketball-Common Terms");
                    intent.putExtra("contentTv", "Basketball-Common Terms");
                    mContext.startActivity(intent);
                }


                if (modellist.get(postition).getTitle().equals("Basketball-Playing Environment")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Basketball_Playing_Environment.class);
                    intent.putExtra("actionBarTitle", "Basketball-Playing Environment");
                    intent.putExtra("contentTv", "Basketball-Playing Environment");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Basketball-Tournaments")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Basketball_Tournaments.class);
                    intent.putExtra("actionBarTitle", "Basketball-Tournaments");
                    intent.putExtra("contentTv", "Basketball-Tournaments");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Basketball–Hall of fame")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Basketball_Hall_of_fame.class);
                    intent.putExtra("actionBarTitle", "Basketball–Hall of fame");
                    intent.putExtra("contentTv", "Basketball–Hall of fame");
                    mContext.startActivity(intent);
                }


            }
        });

        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}

