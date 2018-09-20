package com.hussi.parser;

import com.hussi.enums.InputFileTypesEnum;

public class ParserTest
{
	
	public static void main(String[] args) 
	{
		//String file_path = "C:\\Users\\indiahiring\\Desktop\\Ajay_Pratap\\Hussain\\resources\\Exercise_PerCapitaIncome.csv";
		String file_path = "resources\\Exercise_PerCapitaIncome.csv";
		String file_extension = file_path.substring(file_path.lastIndexOf(".")+1,file_path.length());
		InputFileStrategy fileStrategy = InputFileStrategyFactory.getInputFileParsingStrategy(InputFileTypesEnum.valueOf(file_extension.toUpperCase())) ;
		fileStrategy.parseInputFile(file_path);
	}

}
