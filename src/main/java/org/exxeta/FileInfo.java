package org.exxeta;

public record FileInfo(String path, long totalLinesAmount, long codeLinesAmount) {

  @Override
  public String toString() {
    String output = "path=" + path + " "
        + "totalLinesAmount=" + totalLinesAmount + " "
        + "codeLinesAmount=" + codeLinesAmount + " ";
    return output;
  }
}
