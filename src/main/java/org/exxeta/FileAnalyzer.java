package org.exxeta;

import java.io.IOException;

public class FileAnalyzer {

  private FileAnalyzer() {
  }

  public static FileInfo analise(String path) throws IOException {
    final var lines = FileReader.read(path);
    final var totalLinesAmount = LinesAnalyzer.getTotalLines(lines);
    final var codeLinesAmount = LinesAnalyzer.getCodeLines(lines);
    return new FileInfo(path, totalLinesAmount, codeLinesAmount);
  }
}
