package org.exxeta;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {

  public static List<String> read(String path) throws IOException {
    try (BufferedReader reader = Files.newBufferedReader(Path.of(path))) {
      return reader.lines().toList();
    }
  }
}
