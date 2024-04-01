package org.example;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Base64InputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class Main {
  static byte[] ico = {0x0, 0x00, 0x01, 0x00};
  static byte[] png = {0x0, 0x00, 0x01, 0x00};
  static byte[] jpg = {0x0, 0x00, 0x01, 0x00};
  static byte[] svg = {0x0, 0x00, 0x01, 0x00};

  public static void main(String[] args) {
    final String encoded = "SGVsbG8gd29ybGQh";
    Reader in = new InputStreamReader(new Base64InputStream(new ByteArrayInputStream(encoded.getBytes(StandardCharsets.UTF_8))));
    try(in){
      int c;
      while ((c = in.read()) >= 0){
        System.out.println((char)c);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
}