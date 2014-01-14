 package com.wy.com;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class ServerTrustingTrustManager implements X509TrustManager{
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        throw new CertificateException("Client is not trusted.");
    }


    public void checkServerTrusted(X509Certificate[] chain, String authType) {
        // trust all servers
    }


    public X509Certificate[] getAcceptedIssuers() {
        return null;//new X509Certificate[0];
    }
}
