package com.hussi.parser;

import com.hussi.domain.InputDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class XMLParser implements InputFileStrategy
{

	@Override
	public List<InputDTO> parseInputFile(String file_path) {
		System.out.println("XML PARSER");
		System.out.println("COMPLETE XML PARSER IMPLEMENTATION IS NOT ADDED FOR NOW");
		return null;
	}
	
	@Override
	public void writeOutputFile(Map<String, BigDecimal> averageIncomeMap) {
		System.out.println("EXCEL PARSER");
		System.out.println("COMPLETE EXCEL PARSER IMPLEMENTATION IS NOT ADDED FOR NOW");
		
	}

}
