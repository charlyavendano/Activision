package com.urbanwarriors.apirest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.message.Message;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


@SpringBootApplication
public class ActivisionApplication {

	public static void main(String[] args) throws UnirestException {
		//matchesJson();
		profileJson();
	}
	
	public static void profileJson() throws UnirestException {
		Unirest.setTimeouts(0, 0);
		String url = "https://my.callofduty.com/api/papi-client/crm/cod/v2/title/mw/platform/uno/gamer/charly%232717644/matches/wz/start/0/end/0/details";
		HttpResponse<JsonNode> response = Unirest.get(url)
				.header("Cookie", "ACT_SSO_COOKIE=MTE5Mjc4NTM3Mjk4NzkxODEwOTY6MTYyNTI4NDA0ODI3Mzo3ODAzOGI5NTI4YmQ4Mjk5NTJkZDdiZjM1YTgxYmRhNg; ACT_SSO_COOKIE_EXPIRY=1625284048273; atkn=eyJhbGciOiAiQTEyOEtXIiwgImVuYyI6ICJBMTI4R0NNIiwgImtpZCI6ICJ1bm9fcHJvZF9sYXNfMSJ9.GS0ZT8IzFRYEQIjGHxBTLBbZHPLrndLKH3_Ae-BqUV8kgMX0NXPF-g.zlcAvlpPPowWfJf8.4rXQiTTH_8OljsV2rehi9VLf6Fz1P7OHzH6yWTe6eI5COjRcq__F-jb_Ug5ruhelWmrc2ulZOmdbZ0lebFFaaQGWn6YYPl00BQ_NTpxeVTg6RJL1EQFufbXRFEqynlU34r4BTGP_j5U6Am8lMm5c4rIUIZX0OGcFWqcpOX18ay_kEjJQ-mZgGKuJMl0xcZdv8WgDUdVMDDj9iuULQbnX3g3iGJftCvwx8KBxDKq7Z7wjMiBKe-vsQ8Phd5WoIX7QhO8h0AkH_znuRg6wyrOK5D9Y4Owwn5YbmTPvNKsshvTHqC8QYNeQ_-JWxOEZ34AhQalUXfo_KCn0l6jGZXHB6MRLi_TILgcZKQo5-3Du_UEMnU9e8os2fRhRQn--qGpq4IqhNgOAaIPF-FVLx6UpaIO8ZEJFrbFW3t2EPRvG-NlLa1npsn7H72CXhBilKt6wv7ZMfDhfSyqpNElr3mirLSQKON-8qw.nwjFBgUSEFawY5hJfnhung};")
				.asJson();
		int ganados = 0;
		int muertes = 0;
		int bajas = 0;
		long promedio = 0;
		
		JSONObject princiapl = response.getBody().getObject();
		JSONObject data = princiapl.getJSONObject("data");
		JSONObject ganados1 = data.getJSONObject("maxLevel");
		System.out.println(ganados);
	}
	
	public static void matchesJson() throws UnirestException {
		Unirest.setTimeouts(0, 0);
		String url = "https://my.callofduty.com/api/papi-client/crm/cod/v2/title/mw/platform/uno/gamer/charly%232717644/matches/wz/start/0/end/0/details";
		HttpResponse<JsonNode> response = Unirest.get(url)
				.header("Cookie", "ACT_SSO_COOKIE=MTE5Mjc4NTM3Mjk4NzkxODEwOTY6MTYyNTI4NDA0ODI3Mzo3ODAzOGI5NTI4YmQ4Mjk5NTJkZDdiZjM1YTgxYmRhNg; ACT_SSO_COOKIE_EXPIRY=1625284048273; atkn=eyJhbGciOiAiQTEyOEtXIiwgImVuYyI6ICJBMTI4R0NNIiwgImtpZCI6ICJ1bm9fcHJvZF9sYXNfMSJ9.GS0ZT8IzFRYEQIjGHxBTLBbZHPLrndLKH3_Ae-BqUV8kgMX0NXPF-g.zlcAvlpPPowWfJf8.4rXQiTTH_8OljsV2rehi9VLf6Fz1P7OHzH6yWTe6eI5COjRcq__F-jb_Ug5ruhelWmrc2ulZOmdbZ0lebFFaaQGWn6YYPl00BQ_NTpxeVTg6RJL1EQFufbXRFEqynlU34r4BTGP_j5U6Am8lMm5c4rIUIZX0OGcFWqcpOX18ay_kEjJQ-mZgGKuJMl0xcZdv8WgDUdVMDDj9iuULQbnX3g3iGJftCvwx8KBxDKq7Z7wjMiBKe-vsQ8Phd5WoIX7QhO8h0AkH_znuRg6wyrOK5D9Y4Owwn5YbmTPvNKsshvTHqC8QYNeQ_-JWxOEZ34AhQalUXfo_KCn0l6jGZXHB6MRLi_TILgcZKQo5-3Du_UEMnU9e8os2fRhRQn--qGpq4IqhNgOAaIPF-FVLx6UpaIO8ZEJFrbFW3t2EPRvG-NlLa1npsn7H72CXhBilKt6wv7ZMfDhfSyqpNElr3mirLSQKON-8qw.nwjFBgUSEFawY5hJfnhung};")
				.asJson();
		Long fechaInicio ;
		Long fechaFin ;
		int muertes;
		int bajas;
	    String modo;
	    String clanTag;
	    int posicion;
	    String idJuego;
	    Boolean saqueo;
	    	
		//Guardo en un objeto todo el json retornado de la consulta
		JSONObject princiapl = response.getBody().getObject();
		//Guardo en un array el contido de arreglo del segundo nivel
		JSONArray matches = princiapl.getJSONObject("data").getJSONArray("matches");
		for (int i = 0; i < matches.length(); i++) {
            
			JSONObject data = matches.getJSONObject(i);
			JSONObject playerStats = matches.getJSONObject(i).getJSONObject("playerStats");
			JSONObject player = matches.getJSONObject(i).getJSONObject("player");
			
			if (data.has("mode")) {
            	modo = data.getString("mode");
            	if (modo.contains("plnd")  == true){
            		System.out.println("ESTO ES UN SAQUEO, PASE AL SIGUIENTE");
            		continue;
            	}
            }else {
            	modo = null;
            }
			
            if (data.has("utcStartSeconds")) {
            	fechaInicio = data.getLong("utcStartSeconds");
            }else {
            	fechaInicio = (long) 0;
            }
            
            if (data.has("utcEndSeconds")) {
            	fechaFin = data.getLong("utcEndSeconds");
            }else {
            	fechaFin = (long) 0;
            }
            
            if (data.has("matchID")) {
            	idJuego = data.getString("matchID");
            }else {
            	idJuego = "0";
            }
            
            if (playerStats.has("kills")) {
            	bajas = playerStats.getInt("kills");
            }else {
            	bajas = 0;
            }
            
            if (playerStats.has("deaths")) {
            	muertes = playerStats.getInt("deaths");
            }else {
            	muertes = 0;
            }
            
            if (player.has("clantag")) {
            	clanTag = player.getString("clantag");
            }else {
            	clanTag = null;
            }
            
            if (playerStats.has("teamPlacement")) {
            	posicion = playerStats.getInt("teamPlacement");
            }else {
            	posicion = 0;
            }
            
            System.out.println("Secuencial: " + i + 
            		 		   " IdJuego : " + idJuego + 
            		           " - Hr Ini: " + fechaInicio + 
            		           " - Hr Fin: "+ fechaFin + 
            		           " - Modo: " + modo +
            		           " - Bajas: " + bajas + 
            		           " - Muertes: " + muertes +
            		           " - Posicion: " + posicion + 
            		           " - ClaTag: " + clanTag);
        }
	}
	
	
}
