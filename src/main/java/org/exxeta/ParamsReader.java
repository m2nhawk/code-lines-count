package org.exxeta;

import java.util.Optional;

public class ParamsReader {

  private ParamsReader() {
  }

  public static Optional<String> getPath(String[] args) {
    if (args.length < 1 || args[0].length() < 1) {
      return Optional.empty();
    }
    return Optional.of(args[0]);
  }
}
