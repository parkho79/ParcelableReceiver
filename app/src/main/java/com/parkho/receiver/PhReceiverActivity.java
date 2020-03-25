package com.parkho.receiver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.parkho.ShareData;

public class PhReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        if (bundle == null) {
            return;
        }

        ShareData shareData = bundle.getParcelable("Parcelable");
        if (shareData == null) {
            return;
        }

        ((TextView) findViewById(R.id.tv_name_data)).setText(shareData.getName());

        ((TextView) findViewById(R.id.tv_number_data)).setText(String.valueOf(shareData.getNumber()));

        ((TextView) findViewById(R.id.tv_parcelable_data)).setText(String.valueOf(shareData.isParcelable()));
    }
}
