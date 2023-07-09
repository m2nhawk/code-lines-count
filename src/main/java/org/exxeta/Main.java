package org.exxeta;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {

    final var path = ParamsReader.getPath(args);
    if (path.isEmpty()) {
      System.out.println("Please provide a valid path as an argument.");
      return;
    }

    final var filesAnalysisResult = analyzeFilesInPath(path.get());
    System.out.println(filesAnalysisResult);
  }

  private static FilesAnalysisResult analyzeFilesInPath(String path) throws IOException {
    final var files = FilesProvider.provide(path);
    final var fileInfos = new ArrayList<FileInfo>();
    long totalLinesAmount = 0;
    long codeLinesAmount = 0;
    for (var file : files) {
      final var fileInfo = FileAnalyzer.analise(file);
      fileInfos.add(fileInfo);
      totalLinesAmount += fileInfo.totalLinesAmount();
      codeLinesAmount += fileInfo.codeLinesAmount();
    }
    return new FilesAnalysisResult(fileInfos, totalLinesAmount, codeLinesAmount);
  }
}