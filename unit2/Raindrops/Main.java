import javax.swing.JFrame;

class Main extends JFrame{

  public Main(){
    super("Raindrops");
    this.add(new RainDrops());
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String[] args) {
    Main app = new Main();
    app.setVisible(true);
  }
}