package com.eduapp.client.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.eduapp.client.model.Constant;

@SuppressWarnings("deprecation")
public abstract class HttpClientGet<T> {

	public abstract List<T> createObjectFromJson(String output);

	 
	@SuppressWarnings("resource")
	public List<T> getContent(String url) {
		DefaultHttpClient httpClient = null;

		try {

			httpClient = new DefaultHttpClient();
			HttpGet getRequest = new HttpGet(Constant.getBaseUrl() + url);
			getRequest.addHeader("accept", "application/json");

			HttpResponse response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output;
			StringBuffer result = new StringBuffer();
			//System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				result.append(output);
			}
			return createObjectFromJson(result.toString());

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(httpClient!=null)
				httpClient.getConnectionManager().shutdown();
		}
		return null;
	}

}
