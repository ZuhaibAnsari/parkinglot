package com.hussi.parser;

import com.hussi.domain.InputDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CSVParser implements InputFileStrategy {

    @Override
    public List<InputDTO> parseInputFile(String file_path) {
        System.out.println("CSV PARSER : EMPTY IMPLEMENTATION ");
        List<InputDTO> inputDTOList = new ArrayList<InputDTO>();
        return null;
    }

    @Override
    public void writeOutputFile(Map<String, BigDecimal> averageIncomeMap) {

    }

}
