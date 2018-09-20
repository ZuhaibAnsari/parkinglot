package com.hussi.parser;

import com.hussi.enums.InputFileTypesEnum;

public class InputFileStrategyFactory {
    
    //Lazy initialization would be good option .. initialize only when called
    private static final InputFileStrategy CSV_PARSER = new CSVParser();
    private static final InputFileStrategy JSON_PARSER = new JSONParser();
    private static final InputFileStrategy EXCEL_PARSER = new EXCELParser();
    private static final InputFileStrategy XML_PARSER = new XMLParser();

    public static InputFileStrategy getInputFileParsingStrategy(InputFileTypesEnum file_path) {
        switch (file_path) {
            case JSON:
                return JSON_PARSER;
            case XML:
                return XML_PARSER;
            case CSV:
                return CSV_PARSER;
            case EXCEL:
                return EXCEL_PARSER;
            default:
                return CSV_PARSER;
        }
    }

}
