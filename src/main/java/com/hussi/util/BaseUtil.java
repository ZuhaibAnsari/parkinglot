package com.hussi.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;

public class BaseUtil 
{
	
	public static void printMap(Map<String, BigDecimal> averageIncomeMap)
	{
		System.out.println("Country / City Name"+"\t\t"+"Gender"+"\t\t"+"Average Income (USD)");
		for (String key : averageIncomeMap.keySet()) 
		{
			String[] key_split = key.split("_");
			NumberFormat formatter = new DecimalFormat("#0.00");
			String value = formatter.format(averageIncomeMap.get(key));
			System.out.println(key_split[1]+"\t\t"+key_split[0]+"\t\t"+value);
			//System.out.println(key + " ==>> " + averageIncomeMap.get(key));
		}
	}
	
	public static BigDecimal round(BigDecimal d, int scale, boolean roundUp) {
		  int mode = (roundUp) ? BigDecimal.ROUND_UP : BigDecimal.ROUND_DOWN;
		  return d.setScale(scale, mode);
		}

}
