package com.example.hiyoriaya.grongi;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnTouchListener,View.OnKeyListener{

    private TextView result;
    private TextView userm;
    private EditText input;
    private Switch mode;
    private ImageView share;
    private InputMethodManager imm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareItems();
    }

    protected void prepareItems(){
        imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        result = (TextView)findViewById(R.id.result);
        userm = (TextView)findViewById(R.id.usermassage);
        input = (EditText)findViewById(R.id.input);
        input.setOnKeyListener(this);
        mode = (Switch)findViewById(R.id.mode);
        share = (ImageView)findViewById(R.id.share);
        share.setOnTouchListener(this);
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            return true;
        }
        // Enterを離したときに処理を実行
        if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_ENTER) {
            userm.setText(input.getText());
            imm.hideSoftInputFromWindow(input.getWindowToken(),InputMethodManager.RESULT_UNCHANGED_SHOWN);
            grongi();
            input.setText("");
            return true;
        }
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        //シェア処理
        return false;
    }

    public void grongi(){
        String gtxt;
        gtxt = input.getText().toString();
        String[] chars = new String[gtxt.length()];

        for(int i=0;i<chars.length;i++){
            if(String.valueOf(gtxt.charAt(i))=="あ") {
                chars[i] = "ガ";
            }else if(String.valueOf(gtxt.charAt(i))=="い"){
                chars[i] = "ギ";
            }else if(String.valueOf(gtxt.charAt(i))=="う"){
                chars[i] = "グ";
            }else if(String.valueOf(gtxt.charAt(i))=="え"){
                chars[i] = "ゲ";
            }else if(String.valueOf(gtxt.charAt(i))=="お"){
                chars[i] = "ゴ";
            }else if(String.valueOf(gtxt.charAt(i))=="か"){
                chars[i] = "バ";
            }else if(String.valueOf(gtxt.charAt(i))=="き"){
                chars[i] = "ビ";
            }else if(String.valueOf(gtxt.charAt(i))=="く"){
                chars[i] = "ブ";
            }else if(String.valueOf(gtxt.charAt(i))=="け"){
                chars[i] = "ベ";
            }else if(String.valueOf(gtxt.charAt(i))=="こ"){
                chars[i] = "ボ";
            }else if(String.valueOf(gtxt.charAt(i))=="さ"){
                chars[i] = "ガ";
            }else if(String.valueOf(gtxt.charAt(i))=="し"){
                chars[i] = "ギ";
            }else if(String.valueOf(gtxt.charAt(i))=="す"){
                chars[i] = "グ";
            }else if(String.valueOf(gtxt.charAt(i))=="せ"){
                chars[i] = "ゲ";
            }else if(String.valueOf(gtxt.charAt(i))=="そ"){
                chars[i] = "ゴ";
            }else if(String.valueOf(gtxt.charAt(i))=="た"){
                chars[i] = "ダ";
            }else if(String.valueOf(gtxt.charAt(i))=="ち"){
                chars[i] = "ヂ";
            }else if(String.valueOf(gtxt.charAt(i))=="つ"){
                chars[i] = "ヅ";
            }else if(String.valueOf(gtxt.charAt(i))=="て"){
                chars[i] = "デ";
            }else if(String.valueOf(gtxt.charAt(i))=="と"){
                chars[i] = "ド";
            }else if(String.valueOf(gtxt.charAt(i))=="な"){
                chars[i] = "バ";
            }else if(String.valueOf(gtxt.charAt(i))=="に"){
                chars[i] = "ビ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぬ"){
                chars[i] = "ブ";
            }else if(String.valueOf(gtxt.charAt(i))=="ね"){
                chars[i] = "ベ";
            }else if(String.valueOf(gtxt.charAt(i))=="の"){
                chars[i] = "ボ";
            }else if(String.valueOf(gtxt.charAt(i))=="は"){
                chars[i] = "ザ";
            }else if(String.valueOf(gtxt.charAt(i))=="ひ"){
                chars[i] = "ジ";
            }else if(String.valueOf(gtxt.charAt(i))=="ふ"){
                chars[i] = "ズ";
            }else if(String.valueOf(gtxt.charAt(i))=="へ"){
                chars[i] = "ゼ";
            }else if(String.valueOf(gtxt.charAt(i))=="ほ"){
                chars[i] = "ゾ";
            }else if(String.valueOf(gtxt.charAt(i))=="ま"){
                chars[i] = "ラ";
            }else if(String.valueOf(gtxt.charAt(i))=="み"){
                chars[i] = "リ";
            }else if(String.valueOf(gtxt.charAt(i))=="む"){
                chars[i] = "ル";
            }else if(String.valueOf(gtxt.charAt(i))=="メ"){
                chars[i] = "レ";
            }else if(String.valueOf(gtxt.charAt(i))=="モ"){
                chars[i] = "ロ";
            }else if(String.valueOf(gtxt.charAt(i))=="や"){
                chars[i] = "シャ";
            }else if(String.valueOf(gtxt.charAt(i))=="ゆ"){
                chars[i] = "シュ";
            }else if(String.valueOf(gtxt.charAt(i))=="よ"){
                chars[i] = "ショ";
            }else if(String.valueOf(gtxt.charAt(i))=="ら"){
                chars[i] = "サ";
            }else if(String.valueOf(gtxt.charAt(i))=="り"){
                chars[i] = "シ";
            }else if(String.valueOf(gtxt.charAt(i))=="る"){
                chars[i] = "ス";
            }else if(String.valueOf(gtxt.charAt(i))=="れ"){
                chars[i] = "セ";
            }else if(String.valueOf(gtxt.charAt(i))=="ろ"){
                chars[i] = "ソ";
            }else if(String.valueOf(gtxt.charAt(i))=="わ"){
                chars[i] = "パ";
            }else if(String.valueOf(gtxt.charAt(i))=="を") {
                chars[i] = "ゾ";
            }else if(String.valueOf(gtxt.charAt(i))=="ん"){
                chars[i] = "ン";
            }else if(String.valueOf(gtxt.charAt(i))=="が"){
                chars[i] = "ガ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぎ"){
                chars[i] = "ギ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぐ"){
                chars[i] = "グ";
            }else if(String.valueOf(gtxt.charAt(i))=="げ"){
                chars[i] = "ゲ";
            }else if(String.valueOf(gtxt.charAt(i))=="ご"){
                chars[i] = "ゴ";
            }else if(String.valueOf(gtxt.charAt(i))=="ざ"){
                chars[i] = "ザ";
            }else if(String.valueOf(gtxt.charAt(i))=="じ"){
                chars[i] = "ジ";
            }else if(String.valueOf(gtxt.charAt(i))=="ず"){
                chars[i] = "ズ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぜ"){
                chars[i] = "ゼ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぞ"){
                chars[i] = "ゾ";
            }else if(String.valueOf(gtxt.charAt(i))=="だ"){
                chars[i] = "ザ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぢ"){
                chars[i] = "ジ";
            }else if(String.valueOf(gtxt.charAt(i))=="づ"){
                chars[i] = "ズ";
            }else if(String.valueOf(gtxt.charAt(i))=="で"){
                chars[i] = "ゼ";
            }else if(String.valueOf(gtxt.charAt(i))=="ど"){
                chars[i] = "ゾ";
            }else if(String.valueOf(gtxt.charAt(i))=="ば"){
                chars[i] = "ダ";
            }else if(String.valueOf(gtxt.charAt(i))=="び") {
                chars[i] = "ヂ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぶ"){
                chars[i] = "ヅ";
            }else if(String.valueOf(gtxt.charAt(i))=="べ"){
                chars[i] = "デ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぼ"){
                chars[i] = "ド";
            }else if(String.valueOf(gtxt.charAt(i))=="ぱ"){
                chars[i] = "マ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぴ"){
                chars[i] = "ミ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぷ"){
                chars[i] = "ム";
            }else if(String.valueOf(gtxt.charAt(i))=="ぺ"){
                chars[i] = "メ";
            }else if(String.valueOf(gtxt.charAt(i))=="ぽ"){
                chars[i] = "モ";
            }else if(String.valueOf(gtxt.charAt(i))=="ゃ"){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i))=="ゅ"){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i))=="ょ"){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i))=="ぁ"){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i))=="ぃ"){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i))=="ぅ"){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i))=="ぇ"){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i))=="ぉ"){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i))=="ー"){
                chars[i] = chars[i-1];
            }else if(String.valueOf(gtxt.charAt(i))=="っ"){
                chars[i] = chars[i+1];
            }
        }
        for(int i=0;i<chars.length;i++){
            gtxt += chars[i];
        }
        result.setText(gtxt);
    }
}
