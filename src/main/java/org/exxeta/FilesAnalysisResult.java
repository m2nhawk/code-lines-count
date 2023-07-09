package org.exxeta;

import java.util.List;

public record FilesAnalysisResult(List<FileInfo> listOfFileInfos, long totalLinesAmount,
                                  long codeLinesAmount) {

  @Override
  public String toString() {
    final var output = new StringBuilder();
    listOfFileInfos().forEach(fileInfo -> output.append(fileInfo).append("\n"));
    output.append("Total:\n");
    output.append("\tLines:\t").append(totalLinesAmount).append("\n");
    output.append("\tCode Lines:\t").append(codeLinesAmount).append("\n");
    return output.toString();
  }
}
