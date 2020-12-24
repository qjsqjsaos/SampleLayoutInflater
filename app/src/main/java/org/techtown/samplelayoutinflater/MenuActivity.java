package org.techtown.samplelayoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {

    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        container = findViewById(R.id.container);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater)
                            getSystemService(Context.LAYOUT_INFLATER_SERVICE);//getSystemService 메서드를 LayoutInflater 형식으로 형변환을 하여
                // inflater 변수에 넣어준다는 이야기다.
                //LayoutInflater 클래스는 시스템 서비스로 제공하는 클래스이므로 getSystemService를 사용해야 한다.
                //getSystemService()를 통해서 LayoutInflater객체를 참조한다.(즉 getSystemService()를 통해 LayoutInflater 객체를 사용할 수 있다는 것이다.)
                inflater.inflate(R.layout.sub1, container, true); //inflate 메소드, 부분 레이아웃을 container 객체에 설정
                CheckBox checkBox = container.findViewById(R.id.checkBox);
                //부분 레이아웃은 container 객체에 설정이 되어 있으므로(32줄 참고)
                checkBox.setText("로딩되었어요.");
            }
        });

    }
}