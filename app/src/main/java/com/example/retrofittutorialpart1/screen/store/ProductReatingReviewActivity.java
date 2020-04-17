package com.example.retrofittutorialpart1.screen.store;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.retrofittutorialpart1.R;
import com.example.retrofittutorialpart1.textview.ExpandableTextView;

public class ProductReatingReviewActivity extends AppCompatActivity {

    Spannable.Factory spFactory;

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

        // Textview Custom
        spFactory = Spannable.Factory.getInstance();
        String text = "còn xã hội này, sống muốn được người ta tôn trọng thì mình phải tôn trọng người khác trước, Muốn người ta quý mình thì mình phải quý người ta trước. Những người cho mình vay tiền, lúc mình khó khăn, lúc mình khổ, lúc mình vỡ nợ, không phải vì người ta ngu, không phải vì người ta dại, mà vì chính người đó mình nên tôn trọng, bởi những người đó coi mình là anh em bạn bè thì những lúc mình vỡ nợ, khó khăn, khổ người ta mới đưa tiền cho mình vay.";
        final ExpandableTextView textView = findViewById(R.id.text_custom);
        textView.setText(text);
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
