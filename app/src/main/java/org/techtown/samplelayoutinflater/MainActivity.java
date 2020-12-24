package org.techtown.samplelayoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//여기 있던 setContentView 메서드의 순서를 바꾸기 위해서 24줄에 넣었다.

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼이 눌렸어요", Toast.LENGTH_LONG).show();
            }
        });
        setContentView(R.layout.activity_main); //이렇게 하면 앱은 오류가 나타나 실행되지 않는다. setContentView가 실행될 떄
        //activity_main.xml에 있는 button을(뷰들을) 객체화(인플레이션) 시켜주는데, setContentView()가 이렇게 나중에 실행하게 되면,
        //인플레이션 조차 되지 않아서 이 소스코드는(MainActiviy.java)는 button의 존재 조차도 모르게 된다.
    }
}