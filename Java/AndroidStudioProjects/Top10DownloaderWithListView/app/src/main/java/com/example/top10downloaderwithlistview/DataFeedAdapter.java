package com.example.top10downloaderwithlistview;

import android.content.Context;
import android.os.Debug;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;


public class DataFeedAdapter extends ArrayAdapter {

    TextView nameText;
    TextView artistText;
    TextView releaseDateText;
    TextView priceText;
    TextView summaryText;

    private final int layoutResource;
    private final LayoutInflater layoutInflater;
    private List<FeedEntry> feedEntries;

    public DataFeedAdapter(@NonNull Context context,
                           int resource,
                           List<FeedEntry> feedEntries) {
        super(context, resource, feedEntries);

        this.layoutResource = resource;
        this.layoutInflater = LayoutInflater.from(context);
        this.feedEntries = feedEntries;

    }

    public int getCount() {
        return feedEntries.size();

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layoutInflater.inflate(layoutResource, parent, false);

        nameText = view.findViewById(R.id.nameText);
        artistText = view.findViewById(R.id.artistText);
        releaseDateText = view.findViewById(R.id.releaseDateText);
        priceText = view.findViewById(R.id.priceText);
        summaryText = view.findViewById(R.id.summaryText);

        Log.d("x", "position: " + position);
        FeedEntry currentEntry = feedEntries.get(position);


        nameText.setText(currentEntry.getName());
        artistText.setText(currentEntry.getArtist());
        releaseDateText.setText(currentEntry.getReleaseDate());
        priceText.setText(currentEntry.getPrice());
        summaryText.setText(currentEntry.getSummary());

        return view;

    }

}
