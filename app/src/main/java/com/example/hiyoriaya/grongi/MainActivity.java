package com.example.hiyoriaya.grongi;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ShareCompat;
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
        ShareCompat.IntentBuilder builder = ShareCompat.IntentBuilder.from(MainActivity.this);
        builder.setText(result.getText().toString());
        builder.setType("text/plain");
        builder.startChooser();
        return false;
    }

    public void grongi(){
        String gtxt;
        gtxt = input.getText().toString();
        String[] chars = new String[gtxt.length()];

        for(int i=0;i<chars.length;i++){
            if(String.valueOf(gtxt.charAt(i)).equals("あ")) {
                chars[i] = "ガ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("い")){
                chars[i] = "ギ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("う")){
                chars[i] = "グ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("え")){
                chars[i] = "ゲ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("お")){
                chars[i] = "ゴ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("か")){
                chars[i] = "バ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("き")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "キャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "キュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "キョ";
                }else {
                    chars[i] = "ビ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("く")){
                chars[i] = "ブ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("け")){
                chars[i] = "ベ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("こ")){
                chars[i] = "ボ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("さ")){
                chars[i] = "ガ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("し")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "シャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "シュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "ショ";
                }else {
                    chars[i] = "ギ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("す")){
                chars[i] = "グ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("せ")){
                chars[i] = "ゲ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("そ")){
                chars[i] = "ゴ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("た")){
                chars[i] = "ダ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ち")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "チャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "チュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "チョ";
                }else {
                    chars[i] = "ヂ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("つ")){
                chars[i] = "ヅ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("て")){
                chars[i] = "デ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("と")){
                chars[i] = "ド";
            }else if(String.valueOf(gtxt.charAt(i)).equals("な")){
                chars[i] = "バ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("に")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "ニャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "ニュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "ニョ";
                }else {
                    chars[i] = "ビ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぬ")){
                chars[i] = "ブ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ね")){
                chars[i] = "ベ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("の")){
                chars[i] = "ボ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("は")){
                chars[i] = "ザ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ひ")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "ヒャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "ヒュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "ヒョ";
                }else {
                    chars[i] = "ジ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("ふ")){
                chars[i] = "ズ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("へ")){
                chars[i] = "ゼ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ほ")){
                chars[i] = "ゾ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ま")){
                chars[i] = "ラ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("み")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "ミャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "ミュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "ミョ";
                }else {
                    chars[i] = "リ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("む")){
                chars[i] = "ル";
            }else if(String.valueOf(gtxt.charAt(i)).equals("め")){
                chars[i] = "レ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("も")){
                chars[i] = "ロ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("や")){
                chars[i] = "シャ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ゆ")){
                chars[i] = "シュ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("よ")){
                chars[i] = "ショ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ら")){
                chars[i] = "サ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("り")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "リャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "リュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "リョ";
                }else {
                    chars[i] = "シ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("る")){
                chars[i] = "ス";
            }else if(String.valueOf(gtxt.charAt(i)).equals("れ")){
                chars[i] = "セ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ろ")){
                chars[i] = "ソ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("わ")){
                chars[i] = "パ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("を")) {
                chars[i] = "ゾ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ん")){
                chars[i] = "ン";
            }else if(String.valueOf(gtxt.charAt(i)).equals("が")){
                chars[i] = "ガ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぎ")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "ギャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "ギュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "ギョ";
                }else {
                    chars[i] = "ギ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぐ")){
                chars[i] = "グ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("げ")){
                chars[i] = "ゲ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ご")){
                chars[i] = "ゴ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ざ")){
                chars[i] = "ザ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("じ")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "ジャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "ジュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "ジョ";
                }else {
                    chars[i] = "ジ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("ず")){
                chars[i] = "ズ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぜ")){
                chars[i] = "ゼ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぞ")){
                chars[i] = "ゾ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("だ")){
                chars[i] = "ザ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぢ")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "ヂャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "ヂュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "ヂョ";
                }else {
                    chars[i] = "ジ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("づ")){
                chars[i] = "ズ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("で")){
                chars[i] = "ゼ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ど")){
                chars[i] = "ゾ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ば")){
                chars[i] = "ダ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("び")) {
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "ビャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "ビュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "ビョ";
                }else {
                    chars[i] = "ヂ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぶ")){
                chars[i] = "ヅ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("べ")){
                chars[i] = "デ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぼ")){
                chars[i] = "ド";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぱ")){
                chars[i] = "マ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぴ")){
                if(String.valueOf(gtxt.charAt(i+1)).equals("ゃ")){
                    chars[i] = "ミャ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ゅ")){
                    chars[i] = "ミュ";
                }else if(String.valueOf(gtxt.charAt(i+1)).equals("ょ")){
                    chars[i] = "ミョ";
                }else {
                    chars[i] = "ミ";
                }
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぷ")){
                chars[i] = "ム";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぺ")){
                chars[i] = "メ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぽ")){
                chars[i] = "モ";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ゃ")){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ゅ")){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ょ")){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぁ")){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぃ")){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぅ")){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぇ")){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ぉ")){
                chars[i] = "";
            }else if(String.valueOf(gtxt.charAt(i)).equals("ー")){
                chars[i] = chars[i-1];
            }else if(String.valueOf(gtxt.charAt(i)).equals("っ")){
                chars[i] = chars[i+1];
            }else{
                chars[i] = String.valueOf(gtxt.charAt(i));
            }
        }
        gtxt = "";
        for(int i=0;i<chars.length;i++){
            gtxt = gtxt+ chars[i];
        }
        result.setText(gtxt);
    }
}
