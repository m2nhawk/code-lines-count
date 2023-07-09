package org.exxeta;

import java.util.List;

public class LinesAnalyzer {

  public static long getTotalLines(List<String> lines) {
    return lines.size();
  }

  public static long getCodeLines(List<String> lines) {
    return lines.stream().filter(line -> !line.isBlank() && !line.trim().startsWith("//")).count();
  }
}
