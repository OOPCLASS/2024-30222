import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

// currency exchange api
// https://github.com/fawazahmed0/exchange-api?tab=readme-ov-file
public class Main {

  public static void main(String[] args) {
//    JFrame frame = new JFrame("Simple Frame");
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setSize(300, 120);
//
//    JPanel panel1 = new JPanel();
//    panel1.setBackground(java.awt.Color.red);
//    JPanel panel2 = new JPanel();
//    panel2.setBackground(java.awt.Color.blue);
//    JLabel l = new JLabel("Label1 ");
//    JTextField tf = new JTextField("TextField1");
//    panel1.add(l);
//    panel1.add(tf);
//    panel1.setLayout(new FlowLayout());
//    JButton b1 = new JButton("Button 1");
//
//    b1.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        tf.setText("Button 1 Clicked");
//      }
//    });
//    b1.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        l.setText("Button 1 Clicked");
//      }
//    });
//
//
//    JButton b2 = new JButton("Button 2");
//    JButton b3 = new JButton("Button 3");
//    JButton b4 = new JButton("Button 4");
//    panel1.add(b4);
//    panel2.add(b1);
//    panel2.add(b2);
//    panel2.add(b3);
//    JPanel p = new JPanel();
//    p.add(panel1);
//    p.add(panel2);
//    p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
//    p.setBackground(Color.green);
//    frame.setContentPane(p);
//    frame.setVisible(true);

    try {
      URL url = URI.create("https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies/eur.json").toURL();
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      con.setDoOutput(true);

      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer content = new StringBuffer();
      while ((inputLine = in.readLine()) != null) {
        content.append(inputLine);
      }
      System.out.println(content);
      String ronString = "\"ron\": ";
      int indexOfRon = content.indexOf(ronString);
      String ronValue = content.substring(indexOfRon + ronString.length(), indexOfRon + content.substring(indexOfRon).indexOf(","));
      in.close();
      // 1 EUR = YYY RON
      System.out.println("1 EUR = " + ronValue + " RON");
      con.disconnect();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}