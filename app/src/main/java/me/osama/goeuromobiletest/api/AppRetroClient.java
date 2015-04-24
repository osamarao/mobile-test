package me.osama.goeuromobiletest.api;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import retrofit.client.UrlConnectionClient;

public class AppRetroClient extends UrlConnectionClient{
	
	public static OkUrlFactory factory;
	
	public AppRetroClient() {
		factory = generateDefaultOkUrlFactory();
	}
	
	private static OkUrlFactory generateDefaultOkUrlFactory() {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(15, TimeUnit.SECONDS);
        client.setReadTimeout(15, TimeUnit.SECONDS);
        return new OkUrlFactory(client);
    }
	
	@Override
	protected HttpURLConnection openConnection(retrofit.client.Request request)	throws IOException {
		
		return factory.open(new URL(request.getUrl()));
	}
	
	
}