import java.io.*;

public class hw_5 {
  public static void main(String[] args) throws IOException {
    System.out.println("正方形の辺の長さを入力してください");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int readNum = Integer.parseInt(br.readLine());
    System.out.println("正方形の面積は"+readNum*readNum+"です");
  }
}

// メモ（ここから下は写さない）
// https://drive.google.com/file/d/1pa8ZruE2Ep19clpVLIBjkGxccqxPr0WA/view?usp=sharing
