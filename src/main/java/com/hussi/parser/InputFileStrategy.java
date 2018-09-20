package com.hussi.parser;

import com.hussi.domain.InputDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface InputFileStrategy 
{
	List<InputDTO> parseInputFile(String file_path);
	
	void writeOutputFile(Map<String, BigDecimal> averageIncomeMap);
}
