package com.example.s.top10music;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int [] music_poster_ressource= {R.drawable.m1, R.drawable.m2,
            R.drawable.m2, R.drawable.m3, R.drawable.m4,
            R.drawable.m5, R.drawable.m6, R.drawable.m7,
            R.drawable.m8,R.drawable.m9,R.drawable.zm10
    };

    String[] music_titles;
    String[] music_views;
    MusicAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        music_titles=getResources().getStringArray(R.array.music_title);
        music_views=getResources().getStringArray(R.array.music_views);
        int i=0;
        adapter = new MusicAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter((ListAdapter) adapter);
        for (String titles:music_titles)
        {
            MusicDataProvider dataprovider = new MusicDataProvider(
                    music_poster_ressource[i],
                    music_titles[i],
                    music_views[i]
            );
            adapter.add(dataprovider);
            i++;
        }

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (position == 0)
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kJQP7kiw5Fk")));


        if (position == 1)

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JGwWNGJdvx8")));

        if (position == 2)

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fyaI4-5849w")));

        if (position == 3)

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CTFtOOh47oo")));



        if (position == 4)

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=nfs8NYg7yQM")));



        if (position == 5)

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RqcjBLMaWCg")));



        if (position == 6)

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=FM7MFYoylVs")));


        if (position == 7)

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=D5drYkLiLI8")));


        if (position == 8)

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=weeI1G46q0o")));

        if (position == 9)

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=h--P8HzYZ74")));

    }
});

    }
}
