package com.alimasood.encryptdecrypt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button encrypt,decrypt;
    int count=0;

    EditText et ,dt;
    InterstitialAd mInterstitialAd,mInterstitialAd1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        encrypt=findViewById(R.id.enb);
        decrypt=findViewById(R.id.deb);
        et=findViewById(R.id.ent);
        dt=findViewById(R.id.det);

        MobileAds.initialize(this, initializationStatus -> {
        });

        AdRequest adRequest = new AdRequest.Builder().build();

        mInterstitialAd.load(this,"ca-app-pub-9102423097712233/7330996114", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {

                        super.onAdLoaded(interstitialAd);
                        mInterstitialAd = interstitialAd;

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdClicked() {
                                // Called when a click is recorded for an ad.

                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();


                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                super.onAdFailedToShowFullScreenContent(adError);


                            }

                            @Override
                            public void onAdImpression() {
                                super.onAdImpression();

                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                super.onAdShowedFullScreenContent();


                            }
                        });


                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error

                        mInterstitialAd = null;
                    }
                });

        mInterstitialAd1.load(this,"ca-app-pub-9102423097712233/7588633528", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {

                        super.onAdLoaded(interstitialAd);
                        mInterstitialAd1 = interstitialAd;

                        mInterstitialAd1.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdClicked() {
                                // Called when a click is recorded for an ad.

                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();


                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                super.onAdFailedToShowFullScreenContent(adError);


                            }

                            @Override
                            public void onAdImpression() {
                                super.onAdImpression();

                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                super.onAdShowedFullScreenContent();


                            }
                        });


                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error

                        mInterstitialAd1 = null;
                    }
                });






    }
    public void doenc(View v)
    {
        count++;
        char []res=new char[1000000];
        int i;

        // Toast.makeText(MainActivity.this,"a",Toast.LENGTH_SHORT).show();
        String msg=et.getText().toString();
        msg=msg.toLowerCase();

        char [] ch= new char[1000000];
        ch=msg.toCharArray();
        int len=ch.length;

        for( i=0;i<len;i++)
        {
            if(ch[i]=='a')
            {
                res[i]='z';
            }
            if(ch[i]=='b')
            {
                res[i]='x';
            }
            if(ch[i]=='c')
            {
                res[i]='c';
            }
            if(ch[i]=='d')
            {
                res[i]='v';
            }
            if(ch[i]=='e')
            {
                res[i]='b';
            }
            if(ch[i]=='f')
            {
                res[i]='n';
            }
            if(ch[i]=='g')
            {
                res[i]='m';
            }
            if(ch[i]=='h')
            {
                res[i]='a';
            }
            if(ch[i]=='i')
            {
                res[i]='s';
            }
            if(ch[i]=='j')
            {
                res[i]='d';
            }
            if(ch[i]=='k')
            {
                res[i]='f';
            }
            if(ch[i]=='l')
            {
                res[i]='g';
            }
            if(ch[i]=='m')
            {
                res[i]='h';
            }
            if(ch[i]=='n')
            {
                res[i]='j';
            }
            if(ch[i]=='o')
            {
                res[i]='k';
            }
            if(ch[i]=='p')
            {
                res[i]='l';
            }
            if(ch[i]=='q')
            {
                res[i]='q';
            }
            if(ch[i]=='r')
            {
                res[i]='w';
            }
            if(ch[i]=='s')
            {
                res[i]='e';
            }
            if(ch[i]=='t')
            {
                res[i]='r';
            }
            if(ch[i]=='u')
            {
                res[i]='t';
            }
            if(ch[i]=='v')
            {
                res[i]='y';
            }
            if(ch[i]=='w')
            {
                res[i]='u';
            }
            if(ch[i]=='x')
            {
                res[i]='i';
            }
            if(ch[i]=='y')
            {
                res[i]='o';
            }
            if(ch[i]=='z')
            {
                res[i]='p';
            }
            if(ch[i]==' ')
            {
                res[i]='.';
            }
            if(ch[i]=='?')
            {
                res[i]='}';
            }


        }

        String j=" ";
        for(i=0;i<len;i++)
        {
            j=j+res[i];
        }
        j=j+" ";


        et.setText(j);

        if(count%6==0)
        {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(mInterstitialAd1!=null)
                        mInterstitialAd1.show(MainActivity.this);
                    else
                    {

                    }



                }
            },1000);


        }

        else if(count%10==0)
        {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(mInterstitialAd!=null)
                        mInterstitialAd.show(MainActivity.this);
                    else
                    {

                    }



                }
            },1000);
        }
        else
        {

        }

        if(count==18)
        {
            finish();
            Intent s=new Intent(this,MainActivity.class);
            s.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            this.startActivity(s);

        }

        //Toast.makeText(MainActivity.this,ch[0],Toast.LENGTH_SHORT).show();


    }
    public void cleardec(View v)
    {
        dt.setText("");
    }
    public void clearenc(View v)
    {
        et.setText("");
    }

    public void dodec(View v)
    {
        count++;
        char []res=new char[1000000];
        int i;

        // Toast.makeText(MainActivity.this,"a",Toast.LENGTH_SHORT).show();
        String msg=dt.getText().toString();
        msg=msg.toLowerCase();

        char [] ch= new char[1000000];
        ch=msg.toCharArray();
        int len=ch.length;

        for( i=0;i<len;i++)
        {
            if(ch[i]=='z')
            {
                res[i]='a';
            }
            if(ch[i]=='x')
            {
                res[i]='b';
            }
            if(ch[i]=='c')
            {
                res[i]='c';
            }
            if(ch[i]=='v')
            {
                res[i]='d';
            }
            if(ch[i]=='b')
            {
                res[i]='e';
            }
            if(ch[i]=='n')
            {
                res[i]='f';
            }
            if(ch[i]=='m')
            {
                res[i]='g';
            }
            if(ch[i]=='a')
            {
                res[i]='h';
            }
            if(ch[i]=='s')
            {
                res[i]='i';
            }
            if(ch[i]=='d')
            {
                res[i]='j';
            }
            if(ch[i]=='f')
            {
                res[i]='k';
            }
            if(ch[i]=='g')
            {
                res[i]='l';
            }
            if(ch[i]=='h')
            {
                res[i]='m';
            }
            if(ch[i]=='j')
            {
                res[i]='n';
            }
            if(ch[i]=='k')
            {
                res[i]='o';
            }
            if(ch[i]=='l')
            {
                res[i]='p';
            }
            if(ch[i]=='q')
            {
                res[i]='q';
            }
            if(ch[i]=='w')
            {
                res[i]='r';
            }
            if(ch[i]=='e')
            {
                res[i]='s';
            }
            if(ch[i]=='r')
            {
                res[i]='t';
            }
            if(ch[i]=='t')
            {
                res[i]='u';
            }
            if(ch[i]=='y')
            {
                res[i]='v';
            }
            if(ch[i]=='u')
            {
                res[i]='w';
            }
            if(ch[i]=='i')
            {
                res[i]='x';
            }
            if(ch[i]=='o')
            {
                res[i]='y';
            }
            if(ch[i]=='p')
            {
                res[i]='z';
            }
            if(ch[i]=='.')
            {
                res[i]=' ';
            }
            if(ch[i]=='}')
            {
                res[i]='?';
            }


        }

        String j=" ";
        for(i=0;i<len;i++)
        {
            j=j+res[i];
        }
        j=j+" ";


        dt.setText(j);

        //Toast.makeText(MainActivity.this,ch[0],Toast.LENGTH_SHORT).show();
        if(count%6==0)
        {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(mInterstitialAd1!=null)
                        mInterstitialAd1.show(MainActivity.this);
                    else
                    {

                    }



                }
            },1000);


        }

        else if(count%10==0)
        {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(mInterstitialAd!=null)
                        mInterstitialAd.show(MainActivity.this);
                    else
                    {

                    }



                }
            },1000);
        }

        else
        {

        }
        if(count==18)
        {
            finish();
            Intent s=new Intent(this,MainActivity.class);
            s.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            this.startActivity(s);

        }




    }
}