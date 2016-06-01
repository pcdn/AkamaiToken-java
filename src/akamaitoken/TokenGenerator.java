///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package akamaitoken;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.net.URL;
//import java.net.URLConnection;
//import java.util.Dictionary;
//import java.util.Hashtable;
//
///**
// *
// * @author Hung
// */
//public class TokenGenerator {
//
//    /**
//     * @param args the command line arguments
//     * @throws java.net.URISyntaxException
//     * @throws akamaitoken.AkamaiTokenException
//     * @throws java.net.MalformedURLException
//     * @throws java.lang.InterruptedException
//     */
//    public static void main(String[] args) throws URISyntaxException, AkamaiTokenException, MalformedURLException, IOException, InterruptedException {
//        String url = "http://d.s1.pcdn.io/playlist/sub/7CqmZ4DYjAs.mpd";
//        URI uri = new URI(url);
//        String acl = uri.getPath();
//        Dictionary tokenConfig = new Hashtable();
//        tokenConfig.put("acl", acl);
//        tokenConfig.put("window_seconds", "86400");
//        tokenConfig.put("key", "736563757265746f6b656e");
//        while(true) {
//            String generateToken = AkamaiToken.generateToken(tokenConfig);
//            System.out.println(generateToken.split("~")[2].split("=")[1]);
//            System.out.println(generateToken.split("~")[2].split("=")[1].length());
//            String finalURL = url + "?" + generateToken;
//            System.out.println("Final URL: " + finalURL);
//            URL request = new URL(finalURL);
//            URLConnection connection = request.openConnection();
//            try (BufferedReader in = new BufferedReader(
//                    new InputStreamReader(
//                            connection.getInputStream()))) {
//                String inputLine;
//
//                while ((inputLine = in.readLine()) != null) {
//                    System.out.println(inputLine);
//                }
//            }
//    }
//    }
//
//}
