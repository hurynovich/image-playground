package org.example;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;

import java.io.InputStream;

public class ImageMain {
  public static void main(String[] args) throws Exception {
    try (
        InputStream is = ImageMain.class.getResourceAsStream("/sample.svg");
    ) {
      ImageInfo info = Imaging.getImageInfo(is, null);
      System.out.println(info.getMimeType());
      System.out.println(info.getWidth() + "x" + info.getHeight());
    }
  }
}
