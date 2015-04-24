package me.osama.goeuromobiletest.api;

import com.google.gson.GsonBuilder;

import retrofit.RestAdapter;

public class WebServiceFactory {
	
	private static GoEuro goEuroApiClient;
	
	public static GoEuro getInstanceWithBasicGsonConversion() {
		if ( goEuroApiClient == null ) {
//			OkHttpClient name = new OkHttpClient();
//			name.setReadTimeout( 15, TimeUnit.SECONDS );
			
			RestAdapter restAdapter = new RestAdapter.Builder()
											.setClient( new AppRetroClient() )
											.setEndpoint(WebServiceConstants.SERVER_URL)
//											.setServer( WebServiceConstants.SERVER_URL )
											.setConverter( new retrofit.converter.GsonConverter( new GsonBuilder().create() ) )
											.setLogLevel(RestAdapter.LogLevel.FULL)
											.build();

            goEuroApiClient = restAdapter.create( GoEuro.class );
		}




        return goEuroApiClient;
	}
//    GsonFactory.getConfiguredGson()



	
	
}
