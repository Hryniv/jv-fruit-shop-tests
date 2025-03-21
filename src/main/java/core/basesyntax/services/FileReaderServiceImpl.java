package core.basesyntax.services;

import core.basesyntax.services.exception.FileReaderException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderServiceImpl implements FileReaderService {
    @Override
    public List<String> read(String filePath) {
        List<String> lines;
        try {
            lines = Files.readAllLines(Path.of(filePath));
        } catch (IOException e) {
            throw new FileReaderException("Can't read file " + filePath);
        }
        return lines;
    }
}
