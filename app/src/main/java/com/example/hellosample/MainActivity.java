package com.example.hellosample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 表示ボタンオブジェクト取得
        Button bt = findViewById(R.id.btClick);

        // リスナクラスのインスタンス作成
        HelloListener hl = new HelloListener();

        // 表示ボタンにリスナ設定
        bt.setOnClickListener(hl);
    }

    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            // 入力欄のオブジェクト取得
            EditText et = findViewById(R.id.etname);

            // 表示欄のオブジェクト取得
            TextView tv = findViewById(R.id.tvOutput);

            // 入力値取得
            String inputStr = et.getText().toString();

            // 入力値を表示欄に設定
            tv.setText(String.format("%sさん。こんにちは！", inputStr));
        }
    }
}