package core.basesyntax.service;

import java.util.List;

public interface CsvFileReader {
    List<String> readInputFile(String fileName);
}
