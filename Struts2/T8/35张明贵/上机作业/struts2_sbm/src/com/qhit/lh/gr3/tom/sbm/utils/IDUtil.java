/**
 * 
 */
package com.qhit.lh.gr3.tom.sbm.utils;

import java.util.UUID;

/**
 * @author tom
 *TODO
 * 2017年12月10日上午11:34:22
 */
public class IDUtil {
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}
