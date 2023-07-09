package org.exxeta;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FilesProvider {

  private static final String SUPPORTED_FILE_ENDING = ".java";

  private FilesProvider() {
  }

  public static List<String> provide(String path) throws IOException {
    final var files = new ArrayList<String>();
    Files.walkFileTree(Paths.get(path), new SimpleFileVisitor<>() {
      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (!Files.isDirectory(file) && file.getFileName().toString()
            .endsWith(SUPPORTED_FILE_ENDING)) {
          files.add(file.toString());
        }
        return FileVisitResult.CONTINUE;
      }
    });
    return files;
  }
}
