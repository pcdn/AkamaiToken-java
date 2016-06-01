# AkamaiToken-java
- This is decompiled and modified version of Akamai secure token java tool to make it as java library to use inside java application 

# Usage

This's combined of command line tool and java library:


1. To use it as command line, see help:
	``$ java -jar AkamaiToken.jar --help``
	
2. To use it as library:
	```java
		String url = "http://d.s1.pcdn.io/playlist/sub/7CqmZ4DYjAs.mpd";
        	URI uri = new URI(url);
        	String acl = uri.getPath();
        	Dictionary tokenConfig = new Hashtable();
        	tokenConfig.put("acl", acl);
        	tokenConfig.put("window_seconds", "86400");
        	tokenConfig.put("key", "736563757265746f6b");
        	String generateToken = AkamaiToken.generateToken(tokenConfig);
        	String finalURL = url + "?" + generateToken;
        	System.out.println("Final URL: " + finalURL);
	```


