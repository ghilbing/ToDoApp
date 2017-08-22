package com.example.gretel.todoapp.adapters;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.gretel.todoapp.R;
import com.example.gretel.todoapp.data.TaskContract;

/**
 * Created by gretel on 8/7/17.
 */

public class TaskCursorAdapter extends CursorAdapter {

    public TaskCursorAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        //Find individual views that we want to modify in the list item layout
        TextView nameTextView = (TextView) view.findViewById(R.id.name);
        TextView priorityTextView = (TextView) view.findViewById(R.id.priority);
        TextView dateTextView = (TextView) view.findViewById(R.id.date);
        TextView notesTextView = (TextView) view.findViewById(R.id.notes);

        //Find the columns fo attributes that we're interested int
        int nameColumnIndex = cursor.getColumnIndex(TaskContract.TaskEntry.TASK_NAME);
        int priorityColumnIndex = cursor.getColumnIndex(TaskContract.TaskEntry.PRIORITY);
        int dateColumnIndex = cursor.getColumnIndex(TaskContract.TaskEntry.DUE_DATE);
        int notesColumnIndex = cursor.getColumnIndex(TaskContract.TaskEntry.NOTES);


        //Read the item attributes from the cursor for the current item
        String taskName = cursor.getString(nameColumnIndex);
        int taskPriority = cursor.getInt(priorityColumnIndex);
        String taskDate = cursor.getString(dateColumnIndex);
        String taskNotes = cursor.getString(notesColumnIndex);


        //Update the TextViews
        nameTextView.setText(taskName);
        dateTextView.setText(taskDate);
        notesTextView.setText(taskNotes);


        switch (taskPriority){
            case 1:
                priorityTextView.setText(R.string.priority_high);
                priorityTextView.setTextColor(Color.parseColor("#E74C3C"));
                break;
            case 2:
                priorityTextView.setText(R.string.priority_medium);
                priorityTextView.setTextColor(Color.parseColor("#FF9800"));
                break;
            case 3:
                priorityTextView.setText(R.string.priority_low);
                priorityTextView.setTextColor(Color.parseColor("#FFD600"));
                break;
        }

    }

}
