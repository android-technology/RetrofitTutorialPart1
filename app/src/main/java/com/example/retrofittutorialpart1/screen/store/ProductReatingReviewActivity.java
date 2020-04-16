package com.example.retrofittutorialpart1.screen.store;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.retrofittutorialpart1.R;

public class ProductReatingReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_reating_review);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(ProductReatingReviewActivity.this, getLayoutInflater());
            }
        });
    }

    public void showDialog(Context context, LayoutInflater inflater) {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(context);
        View viewDialog = inflater.inflate(R.layout.reate_product_dialog, null);

        ImageView btnClose = viewDialog.findViewById(R.id.btn_close_rate);
        final RatingBar rbRateProduct = viewDialog.findViewById(R.id.rb_rate_product);
        Button btnSubmit = viewDialog.findViewById(R.id.btn_submit_rate);
        final EditText edtComment = viewDialog.findViewById(R.id.edt_comment);

        mBuilder.setView(viewDialog);
        AlertDialog dialog = mBuilder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = String.valueOf(rbRateProduct.getRating());
                Toast.makeText(ProductReatingReviewActivity.this, edtComment.getText() + "::" + rating, Toast.LENGTH_LONG).show();
            }
        });

        dialog.show();
    }
}
