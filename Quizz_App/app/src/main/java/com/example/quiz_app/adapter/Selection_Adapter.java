package com.example.quiz_app.adapter;





import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quiz_app.Home_Screen;
import com.example.quiz_app.Quiz_Screen;
import com.example.quiz_app.R;
import com.example.quiz_app.model.Quiz_start;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class Selection_Adapter extends RecyclerView.Adapter<Selection_Adapter.ViewHolder> {

    ArrayList<Quiz_start> qs = new ArrayList<>();
    ArrayList<Integer> questionId;
    Context context;

    public Selection_Adapter(ArrayList<Quiz_start> qs,ArrayList<Integer> questionId,Context context) {
        this.qs = qs;
        this.questionId=questionId;
        this.context = context;
    }

    @NonNull
    @Override
    public Selection_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.quiz_topic_selector, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView2.setText(qs.get(position).getHeading());
        holder.textView2.setTextColor(Color.parseColor("#8b80b6"));
        holder.textView.setTextColor(Color.parseColor("#fbb44d"));
        String s ="Question "+ qs.get(position).getNum_of_ques();
        holder.textView.setText(s);
        String title =qs.get(position).getHeading();
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, Quiz_Screen.class);

                i.putExtra("questionId",questionId);
                i.putExtra("title",title);
                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return qs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public TextView textView2;
        MaterialButton button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.no_of_ques);
            this.textView2 = itemView.findViewById(R.id.quizTitle);
            this.button = itemView.findViewById(R.id.start_btn);
        }
    }

}
