package kr.co.keypair.votingsystem;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jFactory;
import org.web3j.protocol.http.HttpService;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private final String msContractAddr = "0x0101010101010101010101010101010101010101";
    private final String msPrikey = "0x627c3cced38c0068f8ac17b989fc166551dd061400998585e80fd4ef6251be07";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Credentials credentials = Credentials.create(msPrikey);
        Web3j web3 = Web3jFactory.build(new HttpService("https://rinkeby.infura.io/swGGKC97MU0pqiKuFUpA"));

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            // call your contract here
                            // http calls should be run on a different thread

                        } catch (Exception e) {
                            e.toString();
                        }
                    }
                }.start();
            }
        });

    }
}
