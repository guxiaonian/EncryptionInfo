package com.example.encryptioninfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;

import java.security.interfaces.RSAPublicKey;

import fairy.easy.encryptioninformation.EncryptionHelper;
import fairy.easy.encryptioninformation.code.Base64Helper;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "MD5结果为:" + EncryptionHelper.getMd5Param(ENCRYPT_VALUE));
                Log.i(TAG, "SHA256结果为:" + EncryptionHelper.getSha256Param(ENCRYPT_VALUE));
                Log.i(TAG, "HmacMD5结果为:" + EncryptionHelper.getHmacMd5Param(ENCRYPT_VALUE, ENCRYPT_KEY));
                Log.i(TAG, "HmacSHA256结果为:" + EncryptionHelper.getHmacSha256Param(ENCRYPT_VALUE, ENCRYPT_KEY));
                String aesResult = EncryptionHelper.encryptAesParam(ENCRYPT_VALUE, AES_ENCRYPT_KEY);
                Log.i(TAG, "AES加密结果为:" + aesResult);
                Log.i(TAG, "AES解密结果为:" + EncryptionHelper.decryptAesParam(aesResult, AES_ENCRYPT_KEY));
                String rsaResult = EncryptionHelper.encryptRsaParamWithPublicKeyToHexString(ENCRYPT_VALUE, RSA_PUBLIC_KEY);
                Log.i(TAG, "RSA加密1结果为:" + rsaResult);
                Log.i(TAG, "RSA解密1结果为:" + EncryptionHelper.decryptHexStringRsaParamWithPrivateKey(rsaResult, RSA_PRIVATE_KEY));
                String rsa2Result = EncryptionHelper.encryptRsaParamWithPublicKey2ToBase64ToString(ENCRYPT_VALUE, RSA_PUBLIC_KEY);
                Log.i(TAG, "RSA加密2结果为:" + rsa2Result);
                Log.i(TAG, "RSA解密2结果为:" + EncryptionHelper.decryptBase64RsaParamWithPrivateKey2(rsa2Result, RSA_PRIVATE_KEY));

                byte[] aesBytes=EncryptionHelper.encryptAesParam(ENCRYPT_VALUE.getBytes(),AES_ENCRYPT_KEY.getBytes());
                byte[] result=EncryptionHelper.decryptAesParam(aesBytes,AES_ENCRYPT_KEY.getBytes());
                Log.i(TAG,"AES Bytes解密结果为:"+new String(result));

                byte[] rsaBytes=EncryptionHelper.encryptRsaParamBytes(ENCRYPT_VALUE.getBytes(), Base64Helper.decode(RSA_PUBLIC_KEY.getBytes()));
                byte[] rsaBytesResult=EncryptionHelper.decryptRsaParamBytes(rsaBytes,Base64Helper.decode(RSA_PRIVATE_KEY.getBytes()));
                Log.i(TAG,"RSA Bytes解密结果为:"+new String(rsaBytesResult));

            }
        });
    }


    private static final String ENCRYPT_VALUE = "test";
    private static final String ENCRYPT_KEY = "123";
    private static final String AES_ENCRYPT_KEY = "0000000000000000";

    private static final String RSA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDwk5AZ9I4TdWwm0yiujztlU2ym\n" +
            "htYnKdCJ/BznuHI1zDq1K+6Nxde12/zPdd/gXuTCNVH4hznzmy9LeQdA3EitXAnh\n" +
            "vzAETj3qOSrU8w54CibmS95HG3ueii3otDGWYpb9Xur8v2st+Cryi128HwwUGQ7X\n" +
            "yX2fitEG5nEnpGsJMQIDAQAB";

    private static final String RSA_PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAPCTkBn0jhN1bCbT\n" +
            "KK6PO2VTbKaG1icp0In8HOe4cjXMOrUr7o3F17Xb/M913+Be5MI1UfiHOfObL0t5\n" +
            "B0DcSK1cCeG/MAROPeo5KtTzDngKJuZL3kcbe56KLei0MZZilv1e6vy/ay34KvKL\n" +
            "XbwfDBQZDtfJfZ+K0QbmcSekawkxAgMBAAECgYAz5vIQ13ULd6rUmXvOZTJgQuZO\n" +
            "6woqute13UFzMJTbTGtiCM9XoNZP8t0Q+RJKus5Jo+1CXBJBnzpN4xeQg7Xd3cBu\n" +
            "hnACUy4CNBTbcE6DTrluheHoNRA0+6XPq0w4mfHZCEa6muUEMbFgx46vVDHg28Ws\n" +
            "aiZJxhiLm7EDlXSuTQJBAP3j0RL/C4UPQ1I478p0lvCI7P8TeWDYQRhgtIzUhHeL\n" +
            "Duj/apmtpCKts8MJDJlGqwhf4nij00kXtwuOjdQnU+cCQQDyk2uH183oVib2wBOG\n" +
            "ZAoIh6BphMAF/NNfB4kM8u9L7GQu6bnqNwJ2BjnuatTOC9wUmlBo+Sik+ZNG/Aji\n" +
            "kJcnAkB80fAMAs/LDwHt/ogFZOSARREfJpfaAPef4ItjYWfuzbL64feqri+vzO4/\n" +
            "yMck5BVZ/Kn+3awWl04qpF8eGmepAkEAmVYMzALjWvFSkfmangIQwZGSGgFbLK3D\n" +
            "ozdtL61FDLYyIeGGrwH04UxQRGBtgo3GoZNmLuUJBzfoHB/nMeh6UwJBAOKOWa4+\n" +
            "trU/2WoGeY4D2BzOX8hmnhD5mWeuxIpXm7erRtM7SEKw3Y3KEO4mPx0alNq+VNUg\n" +
            "LTycWNuMYHw0T0c=";


}
