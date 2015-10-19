package com.example.dinna.simplemvc;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

public class Gallery extends AppCompatActivity {

    private Integer[] pics = {R.drawable.antartica1, R.drawable.antartica2,
            R.drawable.antartica3, R.drawable.antartica4,
            R.drawable.antartica5, R.drawable.antartica6,
            R.drawable.antartica7, R.drawable.antartica8,
            R.drawable.antartica9, R.drawable.antartica10};

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Creating a picture gallery: https://www.youtube.com/watch?v=cGt5t8ID_5Q
        android.widget.Gallery gallery = (android.widget.Gallery) findViewById(R.id.gallery1);
        gallery.setAdapter(new ImageAdapter(this));
        imageView = (ImageView) findViewById(R.id.imageView);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Picture: " + (arg2+1),
                        Toast.LENGTH_SHORT).show();
                imageView.setImageResource(pics[arg2]);
            }
        });
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;
        int imageBackground;

        public ImageAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return pics.length;
        }

        @Override
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub
            return arg0;
        }

        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return arg0;
        }

        @Override
        public View getView(int arg0, View arg1, ViewGroup arg2) {
            // TODO Auto-generated method stub
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(pics[arg0]);
            return imageView;
        }
    }

}
