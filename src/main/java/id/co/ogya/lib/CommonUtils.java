package id.co.ogya.lib;

import java.util.UUID;

public class CommonUtils {
	public String getLongGeneratedId() {
		String generatedId = UUID.randomUUID().toString().replace("-", "");
		return generatedId;
	}
	
	public String getShortGeneratedId() {
		String generatedId = getLongGeneratedId();
		return generatedId.substring(0, 8);
	}
}
