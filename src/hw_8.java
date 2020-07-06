public class hw_8 {
  public static void main(String[] args) {
    System.out.println("昼食にお勧めのメニューを教えます");
    int recom = new java.util.Random().nextInt(3);
    switch (recom){
      case 0:
        System.out.println("カレーです");
        break;
      case 1:
        System.out.println("本日のランチです");
        break;
      case 2:
        System.out.println("ラーメンです");
    }
  }
}

// メモ（ここから下は写さない）
// https://drive.google.com/file/d/1bGC8LMQeQA9PxrQkoU8w78yBu1_ptheS/view?usp=sharing
